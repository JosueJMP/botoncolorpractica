package com.example.boton2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val mainLayout = findViewById<ConstraintLayout>(R.id.main)
        val cambiarColorBoton = findViewById<Button>(R.id.button_change_color)

        cambiarColorBoton.setOnClickListener {
            val randomColor = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
            mainLayout.setBackgroundColor(randomColor)
        }

        ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            }
        }
}
