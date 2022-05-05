package com.kalernest.loginapp

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

//import android.view.View
//import android.widget.TextView
//import android.widget.Toast
//import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn: Button = findViewById(R.id.loginbtn)
        val forgotPassword: TextView = findViewById(R.id.forgotpass)
        val metaFacebook:ImageView = findViewById(R.id.meta)
        val google : ImageView = findViewById(R.id.Google)
        val twitter : ImageView = findViewById(R.id.Twitter)

        loginBtn.setOnClickListener {
            loginButton()
        }


    }

    private fun loginButton() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        TODO("Not yet implemented")
    }
}