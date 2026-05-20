package com.example.multiplyierapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val TextView = findViewById<TextView>(R.id.TextView)
        val WriteNumText = findViewById<EditText>(R.id.WriteNumText)
        val WriteNumText2 = findViewById<EditText>(R.id.WriteNumText2)
        val calculatbutton = findViewById<Button>(R.id.calculatbutton)
        val ResultTextView = findViewById<TextView>(R.id.ResultTextView)
    }
}