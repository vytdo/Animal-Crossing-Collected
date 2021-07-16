package com.example.acnhcollected.bugs

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BugAdapter(private val bugList : List<BugData>) : RecyclerView.Adapter<BugAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BugAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BugAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(val v : View) : RecyclerView.ViewHolder(v) {

    }
}