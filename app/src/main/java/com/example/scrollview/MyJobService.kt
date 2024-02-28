package com.example.scrollview

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyJobService : JobService(){                                           // It is kotlin file only

    override fun onStartJob(p0: JobParameters?): Boolean {
        Log.d("TAG", "onStartJob:")
        val intent = Intent(this@MyJobService, AlaramManagerBroadcast::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this@MyJobService, 234, intent, PendingIntent.FLAG_IMMUTABLE)
        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),pendingIntent)
        Toast.makeText(this@MyJobService, "Alarm Set", Toast.LENGTH_LONG).show()
        return true
    }

//    override fun onStopJob(p0: JobParameters?): Boolean {
//       Log.d("TAG", "onStopJob:")
//        return true
//    }
override fun onStopJob(p0: JobParameters?): Boolean
{
    Log.d("TAG","onStopJob:")
    return true
  }
}