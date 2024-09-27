package com.rayshaayundami2b.klinikapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageRegister : AppCompatActivity() {

    private lateinit var sin : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_page_register)
        sin = findViewById(R.id.tvsignin)

        sin.setOnClickListener(){
            val intent= Intent(this, PageLogin::class.java)
            startActivity(intent)
        }

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_register)

    }
}