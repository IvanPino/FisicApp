package com.example.fisicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EjerciciosMecanica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios_mecanica)
        val images = listOf<Image>(
            Image("Images 1", R.drawable.img1),
            Image("Images 2", R.drawable.img2),
            Image("Images 3", R.drawable.img3),
            Image("Images 4", R.drawable.img4),
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