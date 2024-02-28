package com.example.scrollview

import android.app.NotificationManager
import android.app.RemoteInput
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NotificationViewEx : AppCompatActivity() {
    lateinit var notificationManager: NotificationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_view_ex)

        var txtView = findViewById<TextView>(R.id.tv)
        var inp = NotificationManagerExx()

        txtView.text = "Hey!"

//        var bundle:Bundle = RemoteInput.getResultsFromIntent(intent)
//        if(bundle != null)
//            txtView.setText(bundle.getString(inp.myKey))

        notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.cancel(inp.notificationId)


    }
}