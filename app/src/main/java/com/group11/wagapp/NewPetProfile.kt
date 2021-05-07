package com.group11.wagapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_pet_profile.*
import kotlinx.android.synthetic.main.activity_user_home_profile.*

class NewPetProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_pet_profile)

        submitNewPetInfo.setOnClickListener {
            val intentTest = Intent(this, UserHomeProfile::class.java)
            startActivity(intentTest)
        }
    }
}