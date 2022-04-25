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
        members.add(Member(R.drawable.alisher_davlatov, "Akmal Davlatov"))
        members.add(Member(R.drawable.xurshidbek_qurbonov_, "Xurshidbek Qurbobov"))
        members.add(Member(R.drawable.mehrob_aka, "Mehrob Fayziyev"))
        members.add(Member(R.drawable.me, "Asilbek Jahonov"))
        members.add(Member(R.drawable.sanjarbek_suvonov_s, "Sanjarbek Suvonov"))
        members.add(Member(R.drawable.akmal_paiziyev, "Akmal Paiziyev"))
        members.add(Member(R.drawable.davronbek_turdiyev, "Davronbek Turdiyev"))
        members.add(Member(R.drawable.dilshod_mirsoatov, "Dilshod Mirsoatov"))
        members.add(Member(R.drawable.kadirov_dev, "Akmal Qodirov"))
        members.add(Member(R.drawable.nurbek_boboyev_n, "Nurbek Boboyev"))
        members.add(Member(R.drawable.umidjon_ishmuhammedov, "Umidjon Ishmuhamedov"))
        members.add(Member(R.drawable.odilbek_mirzayev, "Odilbek Mirzayev"))




        refreshAdapter(members)
    }

    fun refreshAdapter(members: ArrayList<Member>?) {
        val adapter = RecyclerAdapter(context, members)
        recyclerView!!.adapter = adapter
        recyclerView!!.isNestedScrollingEnabled = false
    }
}