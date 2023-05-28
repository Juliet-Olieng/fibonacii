package com.juliet.fibonaciinumbers


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NumberRvAdapter(var fibonaciiNumbers:List<String>): RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_list,parent, false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val currentNumber=fibonaciiNumbers.get(position)
        holder.tvnum.text=currentNumber
    }

    override fun getItemCount(): Int {
        return fibonaciiNumbers.size
    }
}
class NumberViewHolder(itemView:View):ViewHolder(itemView){
    var tvnum=itemView.findViewById<TextView>(R.id.tvNum)
}