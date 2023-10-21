package com.example.codecraftingwithdeepak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.name

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY = "MainActivity.key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.startbtn)

        start.setOnClickListener{

            val name = name.text.toString()
            intent = Intent(applicationContext, technologyPage::class.java)
            intent.putExtra(KEY, name)
            startActivity(intent)
        }
    }
}