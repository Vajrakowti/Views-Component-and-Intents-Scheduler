package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CustomToastEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast_ex)

        val btnToast = findViewById<Button>(R.id.btnT)
        btnToast.setOnClickListener{
            val vg: ViewGroup? = findViewById(R.id.custom_toast)             // toastlayout lo pena custom toast vuntundi//
            val inflater = layoutInflater

            val layout: View = inflater.inflate(R.layout.toastlayout,vg)

            val tv =  layout.findViewById<TextView>(R.id.txtVw)
            tv.text = "Custom Toast Notification"

            val toast = Toast(applicationContext)

            toast.setGravity(Gravity.CENTER_VERTICAL,0,100)
            toast.duration = Toast.LENGTH_LONG
            toast.setView(layout)
            toast.show()
        }
    }
}