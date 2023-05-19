package com.example.viewbindingrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindingrecyclerview.databinding.TextRowItemBinding

class Custom_data_adapter(private val dataSet : ArrayList<String>) : RecyclerView.Adapter<Custom_data_adapter.ViewHolder>() {

    class ViewHolder(binding : TextRowItemBinding) : RecyclerView.ViewHolder(binding.root) {

        val myText : TextView = binding.myText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = DataBindingUtil.inflate<TextRowItemBinding>(LayoutInflater.from(parent.context),R.layout.text_row_item,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.myText.text = dataSet[position]
    }
}