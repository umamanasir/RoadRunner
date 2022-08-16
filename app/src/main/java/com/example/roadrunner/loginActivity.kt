package com.example.roadrunner
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class loginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var email = findViewById(R.id.email) as EditText
        var password = findViewById(R.id.password) as EditText
        var btn_submit = findViewById<Button>(R.id.btnLogin)
        val registerNow = findViewById<TextView>(R.id.registerNow)

        // set on-click listener
        btn_submit.setOnClickListener {
            val email = email.text;
            val password = password.text;
            Toast.makeText(this@loginActivity, email, Toast.LENGTH_LONG).show()
            // validate + verify the user_name and password combination
        }

        registerNow.setOnClickListener{
            val intent = Intent(this, registerActivity::class.java)
            startActivity(intent)

        }
    }
}