package com.example.fisicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FormulasMecanica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulas_mecanica)
        val images = listOf<Image>(
            Image("Aceleración", R.drawable.meca_aceler_media),
            Image("Caida libre", R.drawable.meca_caidalibre),
            Image("Energía Cinética y Potencial", R.drawable.meca_cinetpotyelast),
            Image("Energía Mecánica", R.drawable.meca_enerycons),
            Image("Frenado", R.drawable.meca_frenado),
            Image("Fuerza elástica", R.drawable.meca_fuerzelast),
            Image("Impulso y Momentum", R.drawable.meca_impymomlin),
            Image("MRU", R.drawable.meca_intinerar_mru),
            Image("Lanzamiento Vertical", R.drawable.meca_lanzvertdown),
            Image("lanzamiento vertical", R.drawable.meca_lanzvertup),
            Image("Newton", R.drawable.meca_newtx),
            Image("MRUA", R.drawable.meca_posicmrua),
            Image("Potencia", R.drawable.meca_potmec),
            Image("Rapidez", R.drawable.meca_rapidez),
            Image("Roce y Momentum", R.drawable.meca_rocymom),
            Image("Altura y Tiempo", R.drawable.meca_tiemaltmax),
            Image("Trabajo - Roce", R.drawable.meca_trabroc),
            Image("Velocidad", R.drawable.meca_veloc),
            Image("MRUA", R.drawable.meca_velocmrua),
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