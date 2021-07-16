package com.example.acnhcollected.fish

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.acnhcollected.R

class FishAdapter(private val fishList : List<FishData>) : RecyclerView.Adapter<FishAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FishAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fish_contents, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FishAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = fishList.size

    inner class ViewHolder(val v : View) : RecyclerView.ViewHolder(v) {

    }
}