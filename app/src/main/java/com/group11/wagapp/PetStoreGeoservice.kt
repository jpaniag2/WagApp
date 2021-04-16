package com.group11.wagapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class PetStoreGeoservice : AppCompatActivity() {
    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_store)
        webView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.isClickable = true
        webView.webViewClient = object : WebViewClient() {}
        webView.loadUrl("https://www.google.com/maps/search/pet+store+near+me/@35.3957841,-80.7938129,12z/data=!3m1!4b1")
    }
}