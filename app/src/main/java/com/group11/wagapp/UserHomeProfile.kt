package com.group11.wagapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_user_home_profile.*

class UserHomeProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_home_profile)


        findShelterButton.setOnClickListener {
            val intentTest = Intent(this, AnimalShelterGeoservice::class.java)
            startActivity(intentTest)
        }
    }
}