package com.example.fisicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Ejercicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios)

        val btnejondas =findViewById<ImageView>(R.id.btnforondas)
        val btnejmec =findViewById<ImageView>(R.id.btnformec)
        val btnenergej =findViewById<ImageView>(R.id.btnenergfor)
        val btnejelect =findViewById<ImageView>(R.id.btnforelect)

        btnejondas.setOnClickListener {
            startActivity(Intent(this, EjerciciosOndas::class.java))
        }
        btnejmec.setOnClickListener {
            startActivity(Intent(this, EjerciciosMecanica::class.java))
        }
        btnenergej.setOnClickListener {
            startActivity(Intent(this, EjerciciosEnergia::class.java))
        }
        btnejelect.setOnClickListener {
            startActivity(Intent(this, EjerciciosElect::class.java))
        }

    }
}