package br.com.gameeduunitcc.activities

import android.app.Dialog
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
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
import br.com.gameeduunitcc.utils.DialogRespostaErrada
import br.com.gameeduunitcc.utils.Layout
import br.com.gameeduunitcc.utils.TouchListener
import br.com.gameeduunitcc.viewlModel.GameVM
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.content_game.*

class GameActivity : AppCompatActivity() {

    private var idFase = 1
    private var audioHabilitado = false
    private var tituloFase: String? = null
    private var nivelCorrente = 0
    private lateinit var alternativasCorrentes: List<GameAlternativa>
    private lateinit var customDialog: Dialog
    private lateinit var btnClose: Button
    private lateinit var gameNiveis: List<GameNivel>
    private val viewModel by lazy {
        ViewModelProvider(this).get(GameVM::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        setupToolbar()
        setupParams()
        setupRecyclerView()
        getNiveis()
    }

    private fun setupToolbar() {
        toolbarGame.setNavigationIcon(R.drawable.ic_arrow_left_white_24)
        toolbarGame.setTitleTextColor(resources.getColor(R.color.white, null))
        toolbarGame.setNavigationOnClickListener {
            finish()
        }
    }

    private fun setupParams() {
        idFase = intent.getIntExtra("idFase", 1)
        audioHabilitado = intent.getBooleanExtra("audioHabilitado", false)
        tituloFase = intent.getStringExtra("tituloFase")
    }

    private fun setupFala() {
        if (audioHabilitado) {
            imgFala.visibility = View.VISIBLE
            imgFala.setOnClickListener {
                startAudio(gameNiveis[nivelCorrente].audioNivel)
            }
        }
    }

    private fun setupRecyclerView() {
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
                        } else {
                            DialogRespostaErrada.newInstance()
                                .show(supportFragmentManager, "Errada")
                        }
                    }
                }
            )
        )
    }

    private fun getNiveis() {
        viewModel.game.observe(this, Observer {
            it?.let {
                gameNiveis = it
                startNivel(gameNiveis[nivelCorrente])
                return@Observer
            }
            Toast.makeText(
                this@GameActivity,
                " Ooops.. Tivemos um problema, tente novamente",
                Toast.LENGTH_SHORT
            ).show()
            finish()
        })
        viewModel.getGame(idFase)
    }

    private fun startNivel(nivel: GameNivel) {
        txtTituloFase.text = tituloFase
        txtlabel.visibility = View.VISIBLE
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

    private fun setAdapterAlternativa(alternativa: List<GameAlternativa>) {
        toolbarGame.title = "Nível ${nivelCorrente + 1}"
        alternativasCorrentes = alternativa.shuffled()
        rvAlternativas.adapter = AlternativasAdapter(alternativasCorrentes)
        loaderGame.visibility = View.GONE
    }

    private fun finalizarFase() {
        var proximaFase = 0
        if (idFase == 6) {
            proximaFase = 1
        } else {
            proximaFase = idFase + 1
        }

        Pref.save(Pref.ID_ULTIMA_FASE_REALIZADA, proximaFase)

        customDialogFinalizar()
    }

    private fun startAudio(audio: String?) {
        audio?.let { nomeAudio ->
            val soundId =
                resources.getIdentifier(nomeAudio, "raw", this@GameActivity.packageName)
            val mediaPlayer = MediaPlayer.create(this, soundId)
            mediaPlayer.start()
        }
    }

    private fun customDialogFinalizar() {
        val view = View.inflate(this, R.layout.dialog_final_fase, null)
        btnClose = view.findViewById(R.id.btnSairDialog)
        showCustomDialog(view)
    }

    private fun showCustomDialog(contentView: View) {
        customDialog = Dialog(this@GameActivity, R.style.SlideFromBottom)
        customDialog.setContentView(contentView)
        customDialog.setCancelable(false)
        val customDialogWindow = customDialog.window
        customDialogWindow!!.setLayout(
            Layout.getScreenWidth(this@GameActivity) - 30,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        customDialogWindow.setGravity(Gravity.CENTER)
        customDialog.show()


        if (this::btnClose.isInitialized) {
            btnClose.setOnClickListener {
                val intent = Intent(this@GameActivity, FasesActivity::class.java)
                startActivity(intent)
                customDialog.dismiss()
                finish()
            }
        }
    }
}