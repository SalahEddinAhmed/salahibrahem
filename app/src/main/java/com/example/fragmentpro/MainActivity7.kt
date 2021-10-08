package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main7.*

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        back3.setOnClickListener { val intent = Intent (this, MainActivity2::class.java) ; startActivity(intent) ; finish()
            Toast.makeText(this,"رجوع", Toast.LENGTH_SHORT).show()}
    }
}