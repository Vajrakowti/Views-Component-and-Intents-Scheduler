package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class RatingBarEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar_ex)

        val simpleRatingBar = findViewById<RatingBar>(R.id.simpleRatingBar)
        val simpleRating    = findViewById<RatingBar>(R.id.simpleRating)
        val submitButton    = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val totalStars ="Totalstars " +   simpleRatingBar.numStars
            val rating =  "Rating "+ simpleRatingBar.rating
            Toast.makeText(this, """ $totalStars,$rating""".trimIndent(), Toast.LENGTH_LONG).show()
        }

        simpleRating.setOnRatingBarChangeListener{  ratingBar, rating, fromUser ->
            Toast.makeText(this, "rating $rating, $fromUser",
                Toast.LENGTH_LONG).show()
        }
    }
}