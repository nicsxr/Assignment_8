package com.example.assignment_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    lateinit var resourcesAdapter: UsersAdapter
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val data = intent.getSerializableExtra("data") as List<DataX>

        linearLayoutManager = LinearLayoutManager(this)

        recyclerView = findViewById(R.id.recyclerView2)
        recyclerView.layoutManager = linearLayoutManager
        resourcesAdapter = UsersAdapter(baseContext, data)
        resourcesAdapter.notifyDataSetChanged()
        recyclerView.adapter = resourcesAdapter
    }
}