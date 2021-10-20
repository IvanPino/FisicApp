package com.example.fisicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FormulasEnergia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulas_energia)
        val images = listOf<Image>(
            Image("Capacidad calórica y calor específico", R.drawable.energ_capaccaroric),
            Image("Cinética", R.drawable.energ_cinet),
            Image("Dilatación", R.drawable.energ_dilataclineal),
            Image("Dilatación", R.drawable.energ_dilatasup),
            Image("Dilatación", R.drawable.energ_dilatavolum),
            Image("Energía Mecánica", R.drawable.energ_mecanic),
            Image("Calor y mezclas", R.drawable.energ_mezcycallat),
            Image("Potencia", R.drawable.energ_portenciamecanic),
            Image("Energía Potencial", R.drawable.energ_potenc),
            Image("Trabajo", R.drawable.energ_trabajo),
            Image("Trabajo", R.drawable.energ_trabajroce),
            Image("Conversión de temperaturas", R.drawable.energ_transformacdetemp),
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