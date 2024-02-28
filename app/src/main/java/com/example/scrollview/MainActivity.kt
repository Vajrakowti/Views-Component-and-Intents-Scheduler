package com.example.scrollview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Explicit Intent
        val explicitButton = findViewById<Button>(R.id.explicitButton)

        explicitButton.setOnClickListener {
            val explicitIntent = Intent(this,SecondActivity::class.java)
            startActivity(explicitIntent)
        }

        // Implicit Intent

//        val url ="https://www.google.com"
//        val implicitButton = findViewById<Button>(R.id.implicitButton)
//
//        implicitButton.setOnClickListener {
//            val implicitButton = Intent(Intent.ACTION_VIEW, Uri.parse(url))
//            startActivity(implicitButton)
//        }

        val url1 = "https://www.youtube.com"
        val implicitButton1 = findViewById<Button>(R.id.implicitButton)

        implicitButton1.setOnClickListener {
            val implicitButton1 = Intent(Intent.ACTION_VIEW, Uri.parse(url1))
            startActivity(implicitButton1)
        }

    }
}