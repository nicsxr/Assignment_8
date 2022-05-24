package com.example.assignment_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    lateinit var resourcesAdapter: ResourcesAdapter
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val data = intent.getSerializableExtra("data") as List<Data>

        linearLayoutManager = LinearLayoutManager(this)

        recyclerView = findViewById(R.id.resourcesRecyclerView)
        recyclerView.layoutManager = linearLayoutManager
        resourcesAdapter = ResourcesAdapter(baseContext, data)
        resourcesAdapter.notifyDataSetChanged()
        recyclerView.adapter = resourcesAdapter



    }
}