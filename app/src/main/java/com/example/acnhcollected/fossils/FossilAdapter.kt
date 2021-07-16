package com.example.acnhcollected.fossils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.acnhcollected.R

class FossilAdapter(private val fossilList : List<FossilData>) : RecyclerView.Adapter<FossilAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FossilAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fossil_contents, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FossilAdapter.ViewHolder, position: Int) {
        val fossils = fossilList[position]

        holder.bind(fossils)

    }

    override fun getItemCount(): Int = fossilList.size


    inner class ViewHolder(val v : View) : RecyclerView.ViewHolder(v) {

        val fossilName = v.findViewById<TextView>(R.id.fossil_name)
        val fossilImage = v.findViewById<ImageView>(R.id.fossil_image)
        val fossilPrice = v.findViewById<TextView>(R.id.fossil_price)

        fun bind(fossil : FossilData) {

            fossilName.text = fossil.fileName
            fossilPrice.text = fossil.price.toString()

        }

    }
}