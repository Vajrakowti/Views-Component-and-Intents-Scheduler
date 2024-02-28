package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class CA1EX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca1_ex)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val i = Intent(this,AvgRatingEx::class.java)
                startActivity(i)
                finish() },3000)
    }
}