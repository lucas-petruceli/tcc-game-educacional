package br.com.gameeduunitcc.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.gameeduunitcc.R
import br.com.gameeduunitcc.repositorio.tabelas.Fases

class FasesAdapter(private val allFases: List<Fases>) :
    RecyclerView.Adapter<FasesAdapter.FasesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FasesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fase, parent, false)
        return FasesViewHolder(view)
    }

    override fun onBindViewHolder(holder: FasesViewHolder, position: Int) {
        val fase = allFases[position]
        holder.txtTitulo.text = fase.descricao
    }

    override fun getItemCount(): Int = allFases.size

    inner class FasesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitulo: TextView = itemView.findViewById(R.id.txtNomeFase)
    }
}