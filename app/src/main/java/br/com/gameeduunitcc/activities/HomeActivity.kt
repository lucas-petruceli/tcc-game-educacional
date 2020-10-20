package br.com.gameeduunitcc.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.gameeduunitcc.R
import br.com.gameeduunitcc.viewlModel.HomeVM
import kotlinx.android.synthetic.main.activity_main.*


class HomeActivity : AppCompatActivity() {
    private val viewModel by lazy {
        ViewModelProvider(this).get(HomeVM::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindObserver()
        setupActivity()
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
            viewModel.getStartFase()
        }

        btnFases.setOnClickListener {
            fases()
        }
    }

    fun fases() {
        val intent = Intent(this, FasesActivity::class.java)
        startActivity(intent)
    }
}