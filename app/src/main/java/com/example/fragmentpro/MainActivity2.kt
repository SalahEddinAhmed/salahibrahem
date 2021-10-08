package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        textView18.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity10 ::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"سرعة النقر",Toast.LENGTH_SHORT).show()

        }

        textView19.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity10::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"سرعة النقر",Toast.LENGTH_SHORT).show()

        }

        textView8.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity8::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"مواقع التواصل الاجتماعي",Toast.LENGTH_SHORT).show()

        }

        textView7.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity8::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"مواقع التواصل الاجتماعي",Toast.LENGTH_SHORT).show()

        }

        textView8.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity8::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"مواقع التواصل الاجتماعي",Toast.LENGTH_SHORT).show()

        }

        clock.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity7::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"الساعة",Toast.LENGTH_SHORT).show()

        }

        textView6.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity7::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"الساعة",Toast.LENGTH_SHORT).show()

        }


        calculator.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"الحسابات",Toast.LENGTH_SHORT).show()

        }

        textView15.setOnClickListener {

            val intent = Intent(applicationContext, note::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"مدونة المهام اليومية",Toast.LENGTH_SHORT).show()

        }

        textView16.setOnClickListener {

            val intent = Intent(applicationContext, note::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"مدونة المهام اليوميةي",Toast.LENGTH_SHORT).show()

        }

        textView.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"رجوع",Toast.LENGTH_SHORT).show()

        }

/*
        // gridView فاشلةةةةةةةة :(
        gridView.setOnItemClickListener { adapterView, view, i, l ->

            val n = adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this, n , Toast.LENGTH_SHORT).show()

        }


        val name = arrayOf("الحسابات")
        val image = arrayOf(R.drawable.background)

        val myAdapter = CustomAdapter(this,name ,image)

        gridView.adapter = myAdapter

        gridView.setOnItemClickListener { adapterView, view, i, l ->

            val stringText = adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this, stringText,Toast.LENGTH_SHORT).show()

        }

 */


    }
}