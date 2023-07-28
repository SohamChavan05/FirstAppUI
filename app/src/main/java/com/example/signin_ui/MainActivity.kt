package com.example.signin_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = findViewById<Button>(R.id.button_signin)
        x.setOnClickListener{
            Toast.makeText(this@MainActivity,"Enter Valid Sign In Info", Toast.LENGTH_SHORT).show()
        }
        var y = findViewById<Button>(R.id.button_login)
        y.setOnClickListener{
            Toast.makeText(this@MainActivity,"Enter Valid Log In Info", Toast.LENGTH_SHORT).show()
        }
    }
}