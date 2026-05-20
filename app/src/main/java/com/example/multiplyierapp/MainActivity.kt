package com.example.multiplyierapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val TextView = findViewById<TextView>(R.id.textView)
        val writeNumText = findViewById<EditText>(R.id.writeNumText)
        val WriteNumText2 = findViewById<EditText>(R.id.writeNumText2)
        val Calculatbutton = findViewById<Button>(R.id.calculatButton)
        val ResultTextView = findViewById<TextView>(R.id.resultTextView)
    }
}