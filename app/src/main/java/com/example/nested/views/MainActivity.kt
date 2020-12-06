package com.example.nested.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nested.R
import com.example.nested.models.ParentDataFactory
import com.example.nested.views.adapters.ParentAdapter

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    private fun initRecycler(){
        val recyclerView = findViewById<RecyclerView>(R.id.rv_parent)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity,
               RecyclerView.VERTICAL, false)
            adapter = ParentAdapter(ParentDataFactory.getParents(40))
        }

    }
}