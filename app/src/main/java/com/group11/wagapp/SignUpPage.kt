package com.group11.wagapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_sign_up_page.*
import android.content.ContentValues


class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        val dataHelper = SQLiteDB(applicationContext)
        val data = dataHelper.readableDatabase
        val table = data.rawQuery("SELECT * FROM USERS", null)

        if(table.moveToNext()){
            Toast.makeText(applicationContext, table.getString(1),Toast.LENGTH_SHORT).show()
        }

        registerUserButton.setOnClickListener {

            if (userSignUpName.text.trim().isNotEmpty() && userEmailAddress.text.trim().isNotEmpty() && signUpPageUsername.text.trim().isNotEmpty()
                && userPassword.text.trim().isNotEmpty() && userConfirmPassword.text.trim().isNotEmpty()) {

                val content = ContentValues()

                content.put("NAME", userSignUpName.text.toString().trim())
                content.put("EMAIL", userEmailAddress.text.toString().trim())
                content.put("USERNAME", signUpPageUsername.text.toString().trim())
                content.put("PASSWORD", userPassword.text.toString().trim())
                content.put("CONFIRM_PASSWORD", userConfirmPassword.text.toString().trim())
                data.insert("USERS", null, content)

                userSignUpName.setText("")
                userEmailAddress.setText("")
                signUpPageUsername.setText("")
                userPassword.setText("")
                userConfirmPassword.setText("")

                val intent = Intent(this, FormCollection::class.java)
                startActivity(intent)


            } else if (userSignUpName.text.trim().isEmpty() && userEmailAddress.text.trim().isEmpty() && signUpPageUsername.text.trim().isEmpty()
                && userPassword.text.trim().isEmpty() && userConfirmPassword.text.trim().isEmpty()){

                Toast.makeText(this, "All Fields are Required", Toast.LENGTH_SHORT).show()
            }

        }


            userHasAccount.setOnClickListener {
                val intentLogin = Intent(this, Login::class.java)
                startActivity(intentLogin)
            }
        }
    }

