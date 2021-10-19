package com.example.fisicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FormulasOndas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulas_ondas)

        val images = listOf<Image>(
            Image("Longitud de Onda", R.drawable.ondas_longitudonda),
            Image("Periodo", R.drawable.ondas_periodo),
            Image("Frecuencia", R.drawable.ondas_frecuencia),
            Image("Frecuencia", R.drawable.ondas_frecondasestacionarias),
            Image("Rapidez de propagación", R.drawable.ondas_rapidezpropag),
            Image("Efecto Doppler", R.drawable.ondas_efectodopp),
            Image("Índice de refracción", R.drawable.ondas_indicederefraccion),
        )
        val imageView6 =findViewById<ImageView>(R.id.imageView6)
        val imageView9 =findViewById<ImageView>(R.id.imageView9)

        imageView6.setOnClickListener {
            startActivity(Intent(this, Formulas::class.java))
        }
        imageView9.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java))
        }

        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)
    }
}