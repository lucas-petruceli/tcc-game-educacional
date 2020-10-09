package br.com.gameeduunitcc.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.gameeduunitcc.R
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        setupToolbar()
    }

    fun setupToolbar() {
        toolbarGame.setNavigationIcon(R.drawable.ic_arrow_left_white_24)
        toolbarGame.setNavigationOnClickListener {
            finish()
        }
    }
}