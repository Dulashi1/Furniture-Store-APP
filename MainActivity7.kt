package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity7 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search1)



        // Find imageView by ID
        val ImageView50: ImageView = findViewById(R.id.ImageView50)

        // Set click listener for imageView50
        ImageView50.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

        // Find imageView26 by ID
        val imageView26: ImageView = findViewById(R.id.imageView26)

        // Set click listener for imageView32
        imageView26.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }
    }
}
