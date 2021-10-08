package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.textView2
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        textView5.setOnClickListener { val intent = Intent (this,MainActivity6::class.java) ; startActivity(intent) ; finish()}

        textView2.setOnClickListener {
            val intent = Intent (this, MainActivity2::class.java)
            startActivity(intent) ; finish()
            Toast.makeText(this,"رجوع", Toast.LENGTH_SHORT).show() }

        button4.setOnClickListener {

            val intent = Intent(this, MainActivity4 ::class.java)
            startActivity(intent) ; finish()
            Toast.makeText(this,"اّلة حاسبة",Toast.LENGTH_SHORT).show()
        }
        button5.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity6 ::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"حساب العمر",Toast.LENGTH_SHORT).show()
        }
    }
}