package com.example.scrollview

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.RemoteInput
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.media.AudioAttributes
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RemoteViews

class NotificationManagerExx : AppCompatActivity() {

    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var builder: Notification.Builder
    lateinit var btnNotify: Button
    lateinit var remoteCollapsedViews: RemoteViews
    lateinit var remoteExpandedViews: RemoteViews
    lateinit var pendingIntent: PendingIntent
    lateinit var soundUri: Uri
    lateinit var audioAttr: AudioAttributes
    lateinit var remoteInput: RemoteInput

    private val channelId = "My Channel Id"
    private val description = "Test Notification"
    private val title = "Notification"

    val myKey = "Remote Key"
    val notificationId = 1234;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_manager_exx)
//
//        btnNotify = findViewById(R.id.btnNotify);
//
//        btnNotify.setOnClickListener {
//            val intent = Intent(this,NotificationViewEx::class.java)
//            pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_IMMUTABLE)
//
//            soundUri = Uri.parse(
//                ContentResolver.SCHEME_ANDROID_RESOURCE + "://"+ applicationContext.packageName+"/"+R.raw.ringtone)
//
//
//            audioAttr = AudioAttributes.Builder()
//                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
//                .setUsage(AudioAttributes.USAGE_NOTIFICATION)
//                .build()
//
//            remoteCollapsedViews = RemoteViews(packageName,R.layout.activity_flash_screen_ex)
//            remoteExpandedViews = RemoteViews(packageName,R.layout.activity_flash_screen_ex2)
//
//            myNotificationChannel()
//
//            remoteInput = RemoteInput.Builder(myKey).setLabel("Replying...")
//                .build()
//            val action: Notification.Action =
//                Notification.Action.Builder(R.drawable.check,"Reply",pendingIntent)
//                    .addRemoteInput(remoteInput).build()
//            builder.addAction(action)
//
//            notificationManager.notify(notificationId, builder.build())
//        }

        btnNotify = findViewById(R.id.btnNotify)

        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        btnNotify.setOnClickListener {
            val intent = Intent(this,NotificationViewEx::class.java)
            pendingIntent = PendingIntent.getActivity(this,0,intent, PendingIntent.FLAG_IMMUTABLE)

            soundUri = Uri.parse(
                ContentResolver.SCHEME_ANDROID_RESOURCE + "://"+
                        applicationContext.packageName+"/"+R.raw.ringtone)
            audioAttr = AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                .build()

            remoteCollapsedViews = RemoteViews(packageName, R.layout.activity_flash_screen_ex)
            remoteExpandedViews = RemoteViews(packageName, R.layout.activity_flash_screen_ex2)

            myNotificationChannel()

            notificationManager.notify(notificationId,builder.build())
        }
    }

    private fun myNotificationChannel() {

//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
//            notificationChannel = NotificationChannel(channelId,description,NotificationManager.IMPORTANCE_HIGH)
//            notificationChannel.enableLights(true)
//            notificationChannel.lightColor = Color.GREEN
//            notificationChannel.enableVibration(false)
//            notificationChannel.setSound(soundUri,audioAttr)
//            notificationManager.createNotificationChannel(notificationChannel)
//
//            builder = Notification.Builder(this,channelId)
//                .setSmallIcon(R.drawable.ic_home)
//                .setContentTitle(title)
//                .setContentText(description)
//                .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.drawable.ic_profile))
//                .setContentIntent(pendingIntent)
//
//                .setCustomContentView(remoteCollapsedViews)
//                .setCustomBigContentView(remoteExpandedViews)
//
//                .setAutoCancel(true)
//
//        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notificationChannel = NotificationChannel(channelId,description,NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.GREEN
            notificationChannel.enableVibration(false)
            notificationChannel.setSound(soundUri,audioAttr)
            notificationManager.createNotificationChannel(notificationChannel)

            builder = Notification.Builder(this,channelId)
                .setSmallIcon(R.drawable.ic_home)
                .setContentTitle(title)
                .setContentText(description)
                .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.drawable.spalsh_image))
                .setContentIntent(pendingIntent)

                .setCustomContentView(remoteCollapsedViews)
                .setCustomBigContentView(remoteExpandedViews)

                .setAutoCancel(true)

        }


//        else{
//            builder = Notification.Builder(this)
//                .setSmallIcon(R.drawable.ic_home)
//                .setContentTitle(title)
//                .setContentText(description)
//                .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.drawable.ic_profile))
//                .setContentIntent(pendingIntent)
//                .setAutoCancel(true)
//        }

        else{
            builder = Notification.Builder(this)
                .setSmallIcon(R.drawable.ic_home)
                .setContentTitle(title)
                .setContentText(description)
                .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.drawable.spalsh_image))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
            }
    }
}