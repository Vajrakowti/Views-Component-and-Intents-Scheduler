package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class FlashScreenEX2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen_ex2)

        }
        override fun  onBackPressed(){
            Toast.makeText(applicationContext,"Hello",Toast.LENGTH_SHORT).show()
            super.onBackPressed()
           // when you exit app it will print hello toast
     }
}