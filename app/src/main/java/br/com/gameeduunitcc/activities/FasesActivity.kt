package br.com.gameeduunitcc.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.gameeduunitcc.R
import br.com.gameeduunitcc.adapter.FasesAdapter
import br.com.gameeduunitcc.repositorio.tabelas.Fases
import br.com.gameeduunitcc.utils.ClickListener
import br.com.gameeduunitcc.utils.TouchListener
import br.com.gameeduunitcc.viewlModel.FasesVM
import kotlinx.android.synthetic.main.activity_fases.*
import kotlinx.android.synthetic.main.content_fases.*

class FasesActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this).get(FasesVM::class.java)
    }

    private lateinit var fases: MutableList<Fases>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fases)

        setupToolbar()
        setupRecyclerView()
        getFases()
    }

    fun setupToolbar() {
        toolbarFases.title = "Fases"
        toolbarFases.setTitleTextColor(resources.getColor(R.color.white, null))
        toolbarFases.setNavigationIcon(R.drawable.ic_arrow_left_white_24)
        toolbarFases.setNavigationOnClickListener {
            finish()
        }
    }

    fun setupRecyclerView() {
        val layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        layoutManager.gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
        rvFases.layoutManager = layoutManager
        rvFases.addOnItemTouchListener(TouchListener(this, rvFases, object : ClickListener {
            override fun onClick(view: View?, position: Int) {
                val intent = Intent(this@FasesActivity, GameActivity::class.java)
                intent.putExtra("idFase", fases[position].idFase)
                intent.putExtra("audioHabilitado", fases[position].audioHabilitado)
                intent.putExtra("tituloFase", fases[position].titulo)
                startActivity(intent)
                finish()
            }
        }))
    }

    fun getFases() {
        viewModel.allFases.observe(this, Observer { allFases ->
            allFases?.let {
                fases = it as MutableList<Fases>
                rvFases.adapter = FasesAdapter(fases)
                return@Observer
            }

            //TODO: SnackBar Para avisar que não foi possivel recuperar as fases tente novamente
        })
        viewModel.getAllFases()
    }

}