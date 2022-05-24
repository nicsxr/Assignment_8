package com.example.assignment_8

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ResourcesAdapter(val context: Context, val resourcesList: List<Data>) :
    RecyclerView.Adapter<ResourcesAdapter.ViewHolder>() {
    class ViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {
        var resourceId: TextView
        var name: TextView
        var year: TextView
        var color: TextView
        var value: TextView

        init{
            resourceId = itemView.findViewById(R.id.textView1)
            name = itemView.findViewById(R.id.textView2)
            year = itemView.findViewById(R.id.textView3)
            color = itemView.findViewById(R.id.textView4)
            value = itemView.findViewById(R.id.textView5)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.resources, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.resourceId.text = resourcesList[position].id.toString()
        holder.name.text = resourcesList[position].name
        holder.year.text = resourcesList[position].year.toString()
        holder.color.text = resourcesList[position].color
        holder.value.text = resourcesList[position].pantone_value
    }

    override fun getItemCount(): Int {
        return resourcesList.size
    }
}