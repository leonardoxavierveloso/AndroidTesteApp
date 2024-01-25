package com.example.androidtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import com.example.androidtestapp.databinding.ActivityMainBinding

// Função do setOn para o layout de Lauchsearch

class Home : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val search = findViewById<Button>(R.id.search)
        search.setOnClickListener {
            val intent = Intent(this, Signature::class.java)
            startActivity(intent)
        }

    }
}