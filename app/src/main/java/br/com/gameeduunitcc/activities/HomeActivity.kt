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
import br.com.gameeduunitcc.R
import kotlinx.android.synthetic.main.activity_main.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setBackground(applicationContext, rlHome, R.drawable.home_background_azul)
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
}