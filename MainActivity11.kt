package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maindashboard)

        val button12: Button = findViewById(R.id.button12)
        button12.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }
        val imageView41: ImageView = findViewById(R.id.imageView41)
        val imageView22: ImageView = findViewById(R.id.imageView22)
        val imageView24: ImageView = findViewById(R.id.imageView24)
        val imageView27: ImageView = findViewById(R.id.imageView27)
        val imageView39: ImageView = findViewById(R.id.imageView39)



        imageView41.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        // Set click listener for imageView22
        imageView22.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

        // Set click listener for imageView24
        imageView24.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }

        // Set click listener for imageView27
        imageView27.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

        // Set click listener for imageView36
        imageView39.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }
    }
}