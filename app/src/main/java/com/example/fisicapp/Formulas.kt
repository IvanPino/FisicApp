package com.example.fisicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulas)

        val btnforondas =findViewById<ImageView>(R.id.btnforondas)
        val btnformec =findViewById<ImageView>(R.id.btnformec)
        val btnenergfor =findViewById<ImageView>(R.id.btnenergfor)
        val btnforelect =findViewById<ImageView>(R.id.btnforelect)

        btnforondas.setOnClickListener {
            startActivity(Intent(this, FormulasOndas::class.java))
        }
        btnformec.setOnClickListener {
            startActivity(Intent(this, FormulasMecanica::class.java))
        }
        btnenergfor.setOnClickListener {
            startActivity(Intent(this, FormulasEnergia::class.java))
        }
        btnforelect.setOnClickListener {
            startActivity(Intent(this, FormulasElect::class.java))
        }
    }
}