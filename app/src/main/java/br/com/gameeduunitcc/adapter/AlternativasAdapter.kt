package br.com.gameeduunitcc.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import br.com.gameeduunitcc.R
import br.com.gameeduunitcc.models.GameAlternativa

class AlternativasAdapter(private val alternativas: List<GameAlternativa>) :
    RecyclerView.Adapter<AlternativasAdapter.AlternativasViewHolder>() {
    private var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlternativasViewHolder {
        context = parent.context
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_alternativas, parent, false)
        return AlternativasViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlternativasViewHolder, position: Int) {

        val alternativa = alternativas[position]
        val resoucerId =
            context!!.resources.getIdentifier(
                alternativa.imagemAlternativa,
                "drawable",
                context!!.packageName
            )
        val drawableId = ContextCompat.getDrawable(context!!, resoucerId)
        holder.imagemAlternativa.setImageDrawable(drawableId)
    }

    override fun getItemCount() = alternativas.size

    inner class AlternativasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagemAlternativa: ImageView = itemView.findViewById(R.id.imgAlternativa)

    }
}