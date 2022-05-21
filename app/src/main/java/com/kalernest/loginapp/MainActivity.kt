package com.kalernest.loginapp

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


//import android.view.View
//import android.widget.TextView
//import android.widget.Toast
//import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    lateinit var userimage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn: Button = findViewById(R.id.loginbtn)
        val forgotPassword: TextView = findViewById(R.id.forgotpass)
        val metaFacebook:ImageView = findViewById(R.id.meta)
        val google : ImageView = findViewById(R.id.Google)
        val twitter : ImageView = findViewById(R.id.Twitter)

        //Logging
        Log.i("Main Activity", "onCreate created")

        //text
        val username: TextView = findViewById(R.id.username)

        //image
        userimage = findViewById(R.id.Google)



        loginBtn.setOnClickListener {
            loginButton()
        }


    }

    private fun loginButton() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val userimage : ImageView = findViewById(R.id.Google)

        TODO("Not yet implemented")
    }

    override fun onStart() {
        super.onStart()
    }


}