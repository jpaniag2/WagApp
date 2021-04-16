package com.group11.wagapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user_home_profile.*

class UserHomeProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_home_profile)

        button.setOnClickListener {
            val internetFormatForm = Intent(this, FormCollection::class.java)
            startActivity(internetFormatForm)
        }
    }
}