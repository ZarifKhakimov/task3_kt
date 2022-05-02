package com.example.myscrollappkt.activity

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myscrollappkt.R

class AdvancedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced)
        initViews()
    }

    fun initViews() {
//        val textView = findViewById<TextView>(R.id.textView)
//        val text = "I know just how to #whisper, And I know just how to cry, I know just where to find the answers"
//        val wordToSpan: Spannable = SpannableString(text)
//        wordToSpan.setSpan(
//            ForegroundColorSpan(Color.BLUE),
//            18,
//            27,
//            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//        )
//        textView?.text = wordToSpan
    }
}