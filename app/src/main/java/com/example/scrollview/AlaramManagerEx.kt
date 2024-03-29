package com.example.scrollview

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_IMMUTABLE
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AlaramManagerEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alaram_manager_ex)

        // Add recevier alarm in manifest.

        var start = findViewById<Button>(R.id.button)
        var RStart = findViewById<Button>(R.id.RStart)
        var cancel = findViewById<Button>(R.id.cancel_button)
        var Etext = findViewById<EditText>(R.id.time)

//        A pending intent in Android development is like a voucher for a future action.
//        It lets another app trigger something specific within your app, even if your app isn't running at the moment.

//        You can create an alarm using the AlarmManager and associate a pending intent with it.
//        When the alarm goes off, the pending intent triggers the desired action in your app.

        var alarmManager : AlarmManager
        val intent = Intent(this,AlaramManagerBroadcast::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this,0, intent, FLAG_IMMUTABLE)


        start.setOnClickListener{
            var i = Etext.text.toString().toInt()
            alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+(i*1000),pendingIntent)
            Toast.makeText(this,"Alarm set in $i seconds",Toast.LENGTH_LONG).show()

        }

        RStart.setOnClickListener{
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),5000,pendingIntent)
                Toast.makeText(this,"Repeating Alarm 5 Seconds",Toast.LENGTH_LONG).show()
        }

        cancel.setOnClickListener {
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.cancel(pendingIntent)
            Toast.makeText(this,"Alarm Cancelled",Toast.LENGTH_LONG).show()
        }
    }
}