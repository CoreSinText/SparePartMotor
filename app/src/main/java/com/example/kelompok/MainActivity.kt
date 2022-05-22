package com.example.kelompok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityDaftarBarang = findViewById<CardView>(R.id.dftrBarang)

        activityDaftarBarang.setOnClickListener(){
            startActivity(Intent(this, DaftarBarang::class.java))
        }
    }
}