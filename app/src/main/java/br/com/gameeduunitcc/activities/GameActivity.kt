package br.com.gameeduunitcc.activities

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.gameeduunitcc.Pref
import br.com.gameeduunitcc.R
import br.com.gameeduunitcc.adapter.AlternativasAdapter
import br.com.gameeduunitcc.models.GameAlternativa
import br.com.gameeduunitcc.models.GameNivel
import br.com.gameeduunitcc.utils.ClickListener
import br.com.gameeduunitcc.utils.TouchListener
import br.com.gameeduunitcc.viewlModel.GameVM
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.content_game.*

class GameActivity : AppCompatActivity() {

    private var idFase = 1
    private var audioHabilitado = false
    private var nivelCorrente = 0
    private lateinit var alternativasCorrentes: List<GameAlternativa>
    private lateinit var gameNiveis: List<GameNivel>
    private val viewModel by lazy {
        ViewModelProvider(this).get(GameVM::class.java)
    }

    //TODO: implementar alguma forma de loader e parar ele dentro do observer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        setupToolbar()
        setupParams()
        setupRecyclerView()
        getNiveis()
    }

    fun setupToolbar() {
        toolbarGame.setNavigationIcon(R.drawable.ic_arrow_left_white_24)
        toolbarGame.setTitleTextColor(resources.getColor(R.color.white, null))
        toolbarGame.setNavigationOnClickListener {
            finish()
        }
    }

    fun setupParams() {
        idFase = intent.getIntExtra("idFase", 1)
        audioHabilitado = intent.getBooleanExtra("audioHabilitado", false)
    }

    fun setupFala() {
        if (audioHabilitado) {
            imgFala.visibility = View.VISIBLE
            imgFala.setOnClickListener {
                startAudio(gameNiveis[nivelCorrente].audioNivel)
            }
        }
    }

    fun setupRecyclerView() {
        val layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        layoutManager.gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
        rvAlternativas.layoutManager = layoutManager
        rvAlternativas.hasFixedSize()
        rvAlternativas.addOnItemTouchListener(
            TouchListener(
                this,
                rvAlternativas,
                object : ClickListener {
                    override fun onClick(view: View?, position: Int) {

                        if (alternativasCorrentes[position].valida) {
                            if (nivelCorrente + 1 == gameNiveis.size) {
                                finalizarFase()
                                return
                            }
                            nivelCorrente++
                            startNivel(gameNiveis[nivelCorrente])
                            //TODO: implementar animação (usuario Acertou)
                        } else {
                            //TODO: implementar animação (usuario Errou)
                        }

                    }
                })
        )
    }

    fun getNiveis() {
        viewModel.game.observe(this, Observer {
            it?.let {
                gameNiveis = it
                startNivel(gameNiveis[nivelCorrente])
                return@Observer
            }
        })
        viewModel.getGame(idFase)
    }

    fun startNivel(nivel: GameNivel) {
        Log.i("testeAudio", nivel.imagemNivel)
        val resoucerNivelId =
            resources.getIdentifier(nivel.imagemNivel, "drawable", this@GameActivity.packageName)
        val drawableNivelId = ContextCompat.getDrawable(this@GameActivity, resoucerNivelId)
        imgNivel.setImageDrawable(drawableNivelId)
        setAdapterAlternativa(nivel.alternativas)
        if (audioHabilitado) {
            setupFala()
            startAudio(nivel.audioNivel)
        }
    }

    fun setAdapterAlternativa(alternativa: List<GameAlternativa>) {
        toolbarGame.title = "Nível ${nivelCorrente + 1}"
        alternativasCorrentes = alternativa.shuffled()
        //TODO reordernar array para o objeto correto nao ficar na mema posição
        rvAlternativas.adapter = AlternativasAdapter(alternativasCorrentes)
    }

    fun finalizarFase() {
        //TODO: colocar dailog mostrando a quantidade de acerto
        var proximaFase = 0
        if (idFase == 6) {
            proximaFase = 1
        } else {
            proximaFase = idFase + 1
        }

        Pref.save(Pref.ID_ULTIMA_FASE_REALIZADA, proximaFase)
        val intent = Intent(this@GameActivity, FasesActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun startAudio(audio: String?) {
        audio?.let { nomeAudio ->
            Log.i("testeAudio", nomeAudio)
            val soundId =
                resources.getIdentifier(nomeAudio, "raw", this@GameActivity.packageName)
            val mediaPlayer = MediaPlayer.create(this, soundId)
            mediaPlayer.start()
        }
    }
}