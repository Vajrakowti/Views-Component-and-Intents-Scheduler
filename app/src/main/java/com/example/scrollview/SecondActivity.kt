package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Next Page
        val nextPage = findViewById<Button>(R.id.nextPage)

        nextPage.setOnClickListener {
            val nextPage = Intent(this,ThirdActivity::class.java)
            startActivity(nextPage)
        }

        //backPages

        val backPages = findViewById<Button>(R.id.backPages)

        backPages.setOnClickListener {
            val backPages = Intent(this,MainActivity::class.java)
            startActivity(backPages)
        }
    }
}