package com.example.firstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image : ImageView = findViewById(R.id.imageView)
        val submitButton : Button = findViewById(R.id.submit)
        val background : ConstraintLayout = findViewById(R.id.background)

        submitButton.setOnClickListener {
            submitButton.text = getString(R.string.app_name)
            image.visibility = View.VISIBLE
            background.setBackgroundColor(resources.getColor(R.color.purple_500))
        }


    }
}