package com.group11.wagapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


class FormCollection : AppCompatActivity() {
    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_collecion)
        webView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.isClickable = true
        webView.webViewClient = object : WebViewClient() {}
        webView.loadUrl("https://8fatg4m4mqt.typeform.com/to/EvYD44BE")
    }
}