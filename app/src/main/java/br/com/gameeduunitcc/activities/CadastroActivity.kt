package br.com.gameeduunitcc.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.gameeduunitcc.R
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        setupToolbar()
    }

    fun setupToolbar() {
        toolbarCadastro.title = "Cadastro"
        toolbarCadastro.setTitleTextColor(resources.getColor(R.color.white, null))
        toolbarCadastro.setNavigationIcon(R.drawable.ic_arrow_left_white_24)
        toolbarCadastro.setNavigationOnClickListener {
            finish()
        }
    }
}