package com.group11.wagapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            val intent = Intent(this, UserHomeProfile::class.java)
                startActivity(intent)

        registerButton.setOnClickListener {
            val intentSignUp = Intent(this, SignUpPage::class.java)
                startActivity(intentSignUp)
            }

        }

    }
}