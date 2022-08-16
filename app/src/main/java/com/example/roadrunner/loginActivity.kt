package com.example.roadrunner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.*

class loginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var email = findViewById(R.id.email) as EditText
        var password = findViewById(R.id.password) as EditText
        var btn_submit = findViewById<Button>(R.id.btnLogin)

        // set on-click listener
        btn_submit.setOnClickListener {
            val email = email.text;
            val password = password.text;
            Toast.makeText(this@loginActivity, email, Toast.LENGTH_LONG).show()
            // validate + verfiy the user_name and password combination
        }
    }
}