package com.example.demoapp
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<TextView>(R.id.button1)
        val forgetpassword = findViewById<TextView>(R.id.forgetpass)
        // Setting up click listener on the TextView
        button.setOnClickListener {
            val intent = Intent(this, create_acc::class.java)

            startActivity(intent)

            forgetpassword.setOnClickListener {
                val intent = Intent(this, forget_pass::class.java)

                startActivity(intent)
            }
        }
    }
}
