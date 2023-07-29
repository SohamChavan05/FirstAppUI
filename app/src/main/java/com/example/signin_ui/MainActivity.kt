package com.example.signin_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSignIn = findViewById<Button>(R.id.btnSignIn)
        btnSignIn.setOnClickListener{
            val signIn = Intent(this,SignIn::class.java)
            startActivity(signIn)
        }

        var btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener{
            val logIn = Intent(this,LogIn::class.java)
            startActivity(logIn)
        }
    }
}