package com.group11.wagapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class AnimalShelterGeoservice : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_collecion)
        webView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.isClickable = true
        webView.webViewClient = object : WebViewClient() {}
        webView.loadUrl("https://www.google.com/maps/search/animal+shelter+near+me/@35.3955447,-80.7938128,12z/data=!3m1!4b1")
    }
}