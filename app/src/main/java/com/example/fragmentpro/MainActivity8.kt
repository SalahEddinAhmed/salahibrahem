package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main8.*

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)


        back4.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"رجوع",Toast.LENGTH_SHORT).show()

        }

        imageView2.setOnClickListener {
            Toast.makeText(this,"فيس بوك", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, facebooke::class.java)
            startActivity(intent)
            finish()
        }

        textView9.setOnClickListener {
            Toast.makeText(this,"فيس بوك", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, facebooke::class.java)
            startActivity(intent)
            finish()
        }

        imageView3.setOnClickListener {
            Toast.makeText(this,"انستجرام", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, istagram::class.java)
            startActivity(intent)
            finish()
        }


        textView10.setOnClickListener {
            Toast.makeText(this,"انستجرام", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, istagram::class.java)
            startActivity(intent)
            finish()
        }

        imageView4.setOnClickListener {
            Toast.makeText(this,"واتساب", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, MainActivity9::class.java)
            startActivity(intent)
            finish()
        }


        textView11.setOnClickListener {
            Toast.makeText(this,"واتساب", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, MainActivity9::class.java)
            startActivity(intent)
            finish()
        }

        imageView5.setOnClickListener {
            Toast.makeText(this,"تويتر", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, twitter::class.java)
            startActivity(intent)
            finish()
        }


        textView12.setOnClickListener {
            Toast.makeText(this,"تويتر", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, twitter::class.java)
            startActivity(intent)
            finish()
        }

        imageView6.setOnClickListener {
            Toast.makeText(this,"يوتيوب", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, youtube::class.java)
            startActivity(intent)
            finish()
        }


        textView13.setOnClickListener {
            Toast.makeText(this,"يوتيوب", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, youtube::class.java)
            startActivity(intent)
            finish()
        }

        imageView7.setOnClickListener {
            Toast.makeText(this,"تلجرام", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, youtube::class.java)
            startActivity(intent)
            finish()
        }


        textView14.setOnClickListener {
            Toast.makeText(this,"تلجرام", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, youtube::class.java)
            startActivity(intent)
            finish()
        }


    }
}