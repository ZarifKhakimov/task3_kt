package com.example.myscrollappkt.activity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myscrollappkt.R
import com.example.myscrollappkt.adapter.RecyclerAdapter
import com.example.myscrollappkt.model.Member

class RecyclerActivity : AppCompatActivity() {
    var context: Context? = null
    var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        initViews()
    }

    fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView?.setLayoutManager(GridLayoutManager(context, 1))
        val members: ArrayList<Member> = ArrayList<Member>()
        members.add(Member(R.drawable.iphone, "Xurshidbek"))
        members.add(Member(R.drawable.kosmos, "Begzodbek"))
        members.add(Member(R.drawable.iphone, "Xurshidbek"))
        members.add(Member(R.drawable.kosmos, "Xurshidbek"))
        refreshAdapter(members)
    }

    fun refreshAdapter(members: ArrayList<Member>?) {
        val adapter = RecyclerAdapter(context, members)
        recyclerView!!.adapter = adapter
        recyclerView!!.isNestedScrollingEnabled = false
    }
}