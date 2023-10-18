package com.example.codecraftingwithdeepak

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class technologyPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technology_page)

        val android = findViewById<CardView>(R.id.androidapp)
        val java = findViewById<CardView>(R.id.javaapp)
        val youtubebtn = findViewById<Button>(R.id.youtube)



        android.setOnClickListener{
            intent = Intent(applicationContext, androidapp::class.java)
            startActivity(intent)
        }

        java.setOnClickListener{
            intent = Intent(applicationContext, java::class.java)
            startActivity(intent)
        }

        youtubebtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/@deepakp-rathore")
            startActivity(intent)
        }



    }
}