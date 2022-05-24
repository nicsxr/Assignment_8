package com.example.assignment_8

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class UsersAdapter(val context: Context, val resourcesList: List<DataX>) :
    RecyclerView.Adapter<UsersAdapter.ViewHolder>() {
    class ViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {
        var userId: TextView
        var email: TextView
        var first: TextView
        var last: TextView
        var avatar: ImageView

        init{
            userId = itemView.findViewById(R.id.textView11)
            email = itemView.findViewById(R.id.textView6)
            first = itemView.findViewById(R.id.textView7)
            last = itemView.findViewById(R.id.textView8)
            avatar = itemView.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.users, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text = resourcesList[position].id.toString()
        holder.email.text = resourcesList[position].email
        holder.first.text = resourcesList[position].first_name
        holder.last.text = resourcesList[position].last_name
        Picasso.get().load(resourcesList[position].avatar).into(holder.avatar);
    }

    override fun getItemCount(): Int {
        return resourcesList.size
    }
}