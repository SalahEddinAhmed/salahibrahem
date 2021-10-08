package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"welcome",Toast.LENGTH_SHORT).show()

        button.setOnClickListener {
            val intent = Intent (applicationContext, MainActivity2::class.java)
            startActivity(intent)
            Toast.makeText(this,"دخول",Toast.LENGTH_SHORT).show()
        }

    }
}