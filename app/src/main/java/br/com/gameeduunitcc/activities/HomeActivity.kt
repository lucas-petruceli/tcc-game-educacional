package br.com.gameeduunitcc.activities

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.gameeduunitcc.R
import br.com.gameeduunitcc.viewlModel.HomeVM
import kotlinx.android.synthetic.main.activity_main.*


class HomeActivity : AppCompatActivity() {
    var cont = 0
    private val viewModel by lazy {
        ViewModelProvider(this).get(HomeVM::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setBackground(applicationContext, rlHome, R.drawable.home_background_azul)
        bindObserver()
        setupActivity()


//        GlobalScope.launch {
//            val fases = RepoDatabase.getInstance(this@HomeActivity)?.fasesDAO()?.getAll()
//            val niveis = RepoDatabase.getInstance(this@HomeActivity)?.niveisDAO()?.getAll()
//
//            val fasesNiveis =
//                RepoDatabase.getInstance(this@HomeActivity)?.fasesNiveisDAO()?.getAll()
//            val alternativas =
//                RepoDatabase.getInstance(this@HomeActivity)?.alternativasDAO()?.getAll()
//            val niveisAlternativas =
//                RepoDatabase.getInstance(this@HomeActivity)?.niveisAlternativasDAO()?.getAll()
//
//            MainScope().launch { // TODO: corre o risco de não ter terminado de popular todos os dados
//                val nome = niveis?.get(19)?.imagemArquivo
//                val resoucerId =
//                    resources.getIdentifier(nome, "drawable", this@HomeActivity.packageName)
//                val drawableId = ContextCompat.getDrawable(this@HomeActivity, resoucerId)
//                teste.setImageDrawable(drawableId)
//            }
//
//            val t = 10
//        }

    }

    fun bindObserver() {
        viewModel.fase.observe(this, Observer { faseStart ->
            faseStart?.let {
                val intent = Intent(this, GameActivity::class.java)
                intent.putExtra("idFase", it.idFase)
                intent.putExtra("audioHabilitado", it.audioHabilitado)
                intent.putExtra("tituloFase", it.titulo)
                startActivity(intent)
            }
        })
    }

    fun setupActivity() {
        btnComecar.setOnClickListener {
            viewModel.getStartNivel()
        }

        btnFases.setOnClickListener {
            fases()
        }
    }

    fun fases() {
        val intent = Intent(this, FasesActivity::class.java)
        startActivity(intent)
    }

    fun setBackground(context: Context, view: View, drawableId: Int) {
//        TODO: performace sem a imagem é bem melhor (adicionar uma splash screen no caso de manter a imagem)
//        TODO: Fazer teste de performarce setando a imagem direto no arquivo xml do layout

        var bitmap = BitmapFactory.decodeResource(context.resources, drawableId)
        val width: Int = Resources.getSystem().displayMetrics.widthPixels
        val height: Int = Resources.getSystem().displayMetrics.heightPixels
        bitmap = Bitmap.createScaledBitmap(bitmap!!, width, height, true)
        val bitmapDrawable = BitmapDrawable(context.resources, bitmap)
        view.background = bitmapDrawable
    }

    override fun onPause() {
        super.onPause()
    }
}