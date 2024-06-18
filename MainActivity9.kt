package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cart)

        val imageView12: ImageView = findViewById(R.id.imageView12)
        val imageView19: ImageView = findViewById(R.id.imageView19)
        val imageView25: ImageView = findViewById(R.id.imageView25)
        val imageView21: ImageView = findViewById(R.id.imageView21)
        val imageView38: ImageView = findViewById(R.id.imageView38)



        // Set click listener for imageView12
        imageView12.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

        // Set click listener for imageView22
        imageView19.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

        // Set click listener for imageView24
        imageView25.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }

        // Set click listener for imageView27
        imageView21.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

        // Set click listener for imageView36
        imageView38.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }
    }
}