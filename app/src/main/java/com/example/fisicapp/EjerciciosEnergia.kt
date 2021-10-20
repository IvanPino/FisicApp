package com.example.fisicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EjerciciosEnergia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios_energia)
        val images = listOf<Image>(
            Image("Capacidad calórica y calor específico", R.drawable.energ_capaccaroric),
            Image("Images 2", R.drawable.energ_cinet),
            Image("Images 3", R.drawable.energ_dilataclineal),
            Image("Images 4", R.drawable.energ_dilatasup),
        )
        val imageView6 =findViewById<ImageView>(R.id.imageView6)

        imageView6.setOnClickListener {
            startActivity(Intent(this, Ejercicios::class.java))
        }

        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)
    }
}