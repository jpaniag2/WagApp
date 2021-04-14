package com.group11.wagapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up_page.*

class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        registerUserButton.setOnClickListener {
            val intent = Intent(this, UserHomeProfile::class.java)
                startActivity(intent)

        userHasAccount.setOnClickListener {
            val intentLogin = Intent(this, Login::class.java)
                startActivity(intentLogin)
            }

        }
    }

}