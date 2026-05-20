package com.example.multiplyierapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val writeNumText = findViewById<EditText>(R.id.writeNumText)
        val writeNumText2 = findViewById<EditText>(R.id.writeNumText2)
        val calculatbutton = findViewById<Button>(R.id.calculatButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        calculatbutton.setOnClickListener {
            val num1 = writeNumText.text.toString().toIntOrNull()
            val num2 = writeNumText2.text.toString().toIntOrNull()
        if (num1 != null && num2 != null) {
            val result = num1 * num2
            resultTextView.text = result.toString()
        } else {
            resultTextView.text = "Invalid input"
        }
        }
    }
}