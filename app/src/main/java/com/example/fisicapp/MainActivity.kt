package com.example.fisicapp

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btningresar = findViewById<ImageView>(R.id.btningresar)
        btningresar.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java))
        }
    }
}