package com.example.roadrunner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.*

class registerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var name = findViewById(R.id.nameRegister) as EditText
        var email = findViewById(R.id.emailRegister) as EditText
        var password = findViewById(R.id.passwordRegister) as EditText
        var logIn= findViewById<TextView>(R.id.loginNow)
        var btn = findViewById<Button>(R.id.registerBtn)

        btn.setOnClickListener {
            var name = name.text
            val email = email.text;
            val password = password.text;
            Toast.makeText(this@registerActivity, email, Toast.LENGTH_LONG).show()
            // validate + verify the user_name and password combination
        }

        logIn.setOnClickListener {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }

    }


}