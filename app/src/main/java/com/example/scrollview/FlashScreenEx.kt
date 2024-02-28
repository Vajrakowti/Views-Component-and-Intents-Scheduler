package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class FlashScreenEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen_ex)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val i = Intent(this,FlashScreenEX2::class.java)
                startActivity(i)
                finish() },5000)
    }
}