
package com.group11.wagapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        loginButton.setOnClickListener {

            if(loginUsername.text.trim().isNotEmpty() && loginPassword.text.trim().isNotEmpty()) {
                val intent = Intent(this, UserHomeProfile::class.java)
                startActivity(intent)
            }else
                Toast.makeText(this, "Email and Password Required",Toast.LENGTH_SHORT).show()

        }

        registerButton.setOnClickListener {
            val intentSignUp = Intent(this, SignUpPage::class.java)
            startActivity(intentSignUp)
        }

    }



}
