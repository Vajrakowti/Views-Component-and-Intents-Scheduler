package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        //backPage

        val backPage = findViewById<Button>(R.id.backPage)

        backPage.setOnClickListener {
            val backPage = Intent(this,SecondActivity::class.java)
            startActivity(backPage)
        }
    }
}