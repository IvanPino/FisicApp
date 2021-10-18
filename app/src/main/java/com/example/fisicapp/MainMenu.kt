package com.example.fisicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val btnformulas = findViewById<ImageView>(R.id.btnforondas)
        val btnejercicios = findViewById<ImageView>(R.id.btnformec)
        val btnlibro = findViewById<ImageView>(R.id.btnenergfor)

        btnformulas.setOnClickListener {
            startActivity(Intent(this, Formulas::class.java))
        }
        btnejercicios.setOnClickListener {
            startActivity(Intent(this, Ejercicios::class.java))
        }
        btnlibro.setOnClickListener {
            startActivity(Intent(this, Libro::class.java))
        }
    }
}