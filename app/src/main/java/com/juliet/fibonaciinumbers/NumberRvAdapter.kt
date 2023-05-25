package com.juliet.fibonaciinumbers


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NameRvAdapter(var fibonaciiNumbers:List<String>): RecyclerView.Adapter<NameViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_list,parent, false)
        return NameViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val currentName=fibonaciiNumbers.get(position)
        holder.tvnum.text=currentName
    }

    override fun getItemCount(): Int {
        return fibonaciiNumbers.size
    }
}
class NameViewHolder(itemView:View):ViewHolder(itemView){
    var tvnum=itemView.findViewById<TextView>(R.id.tvNum)
}