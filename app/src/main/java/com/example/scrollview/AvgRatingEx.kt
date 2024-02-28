package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar

class AvgRatingEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avg_rating_ex)


        val firstRatingBar = findViewById<RatingBar>(R.id.firstRatingBar)
        val secondRatingBar = findViewById<RatingBar>(R.id.secondRatingBar)
        val thirdRatingBar = findViewById<RatingBar>(R.id.thirdRatingBar)
        val fourthRatingBar = findViewById<RatingBar>(R.id.fourthRatingBar)

        val avgRatingBar = findViewById<RatingBar>(R.id.avgRatingBar)

        val submitButton = findViewById<Button>(R.id.submitButton2)

        submitButton.setOnClickListener {

            val avgRating = (firstRatingBar.rating + secondRatingBar.rating + thirdRatingBar.rating + fourthRatingBar.rating)/4
            avgRatingBar.rating = avgRating
        }
    }
}