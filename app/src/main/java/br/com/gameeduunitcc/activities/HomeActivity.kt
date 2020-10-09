package br.com.gameeduunitcc.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.gameeduunitcc.R
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActivity()
    }

    fun setupActivity() {
        btnComecar.setOnClickListener {
            comecarGame()
        }

        btnFases.setOnClickListener {
            fases()
        }

        txtCadastrar.setOnClickListener {
            cadastrar()
        }
    }

    fun comecarGame() {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }

    fun fases() {
        val intent = Intent(this, FasesActivity::class.java)
        startActivity(intent)
    }

    fun cadastrar() {
        val intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }
}