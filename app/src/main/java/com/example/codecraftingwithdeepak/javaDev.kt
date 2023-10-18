package com.example.codecraftingwithdeepak

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class javaDev : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_dev)

        val webVariable = findViewById<WebView>(R.id.web)
        webFunction(webVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webFunction(webView: WebView){

        webView.webViewClient= WebViewClient()

        webView.apply {
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled= true

            loadUrl("https://dev.java/learn/")
        }
    }
}