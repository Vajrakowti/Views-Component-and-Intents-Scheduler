package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class ProgressBarEX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar_ex)

        val pgsBar = findViewById<ProgressBar>(R.id.pBar)
        val pgsBar1 = findViewById<ProgressBar>(R.id.pBarCircular)
        val txtView = findViewById<TextView>(R.id.tView)
        val btn = findViewById<Button>(R.id.btnshow)
        val btnR = findViewById<Button>(R.id.resetButton)

        pgsBar.visibility = View.VISIBLE

        btn.setOnClickListener {

            pgsBar1.visibility = View.VISIBLE
            var i = pgsBar.progress                             // it`s value is zero

            Thread{
                while(i<100)
                {
                    i = i+1;
                    Handler(Looper.getMainLooper()).post {
                        pgsBar.progress = i
                        txtView.text = i.toString()+"/"+pgsBar.max
                        if(i==100)
                        {
                            pgsBar1.visibility = View.INVISIBLE
                        }
                    }
                    try {
                        Thread.sleep(1000)
                    }
                    catch (e:InterruptedException)
                    {
                        e.printStackTrace()
                    }
                }
            }.start()
        }

        btnR.setOnClickListener {
            pgsBar.progress = 0;
            txtView.text = 0.toString()+"/"+pgsBar.max
        }

    }
}