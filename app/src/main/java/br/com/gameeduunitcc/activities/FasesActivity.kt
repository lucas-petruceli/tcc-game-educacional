package br.com.gameeduunitcc.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.gameeduunitcc.R
import kotlinx.android.synthetic.main.activity_fases.*

class FasesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fases)

        setupToolbar()
    }

    fun setupToolbar() {
        toolbarFases.title = "Fases"
        toolbarFases.setTitleTextColor(resources.getColor(R.color.white, null))
        toolbarFases.setNavigationIcon(R.drawable.ic_arrow_left_white_24)
        toolbarFases.setNavigationOnClickListener {
            finish()
        }
    }
}