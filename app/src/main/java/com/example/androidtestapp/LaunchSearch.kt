package com.example.androidtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// Função do setOn para o layout de Signature

class LaunchSearch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_search)


        val signature = findViewById<Button>(R.id.signature)
        signature.setOnClickListener {
            val intent = Intent(this, Signature::class.java)
            startActivity(intent)
        }

    }
}