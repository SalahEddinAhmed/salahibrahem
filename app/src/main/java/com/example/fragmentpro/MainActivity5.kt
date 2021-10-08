package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main6.*
import java.util.*
import kotlin.math.max
import kotlin.math.min

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        back.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java); startActivity(intent)
            finish()
            Toast.makeText(this,"رجوع", Toast.LENGTH_SHORT).show()
        }

        go.setOnClickListener {

        val nameone =name1.text.toString()
        val nametow =name2.text.toString()
        val dayone =day1.text.toString().toInt()
        val daytow =day2.text.toString().toInt()
        val monthone =month1.text.toString().toInt()
        val monthtow =month2.text.toString().toInt()
        val yearone =year1.text.toString().toInt()
        val yeartow =year2.text.toString().toInt()

        if (yearone < yeartow){avar.setText("$nameone هو الأكبر ب${-yearone + yeartow} سنة و ${-monthone + monthtow} شهر و ${-dayone + daytow} يوم .") }

        if (yearone > yeartow){avar.setText("$nametow هو الأكبر ب${-yeartow + yearone} سنة و ${-monthtow + monthone} شهر و ${-daytow + dayone} يوم .") }

        if (yearone == yeartow) {
            if (monthone < monthtow) {
                avar.setText("$nameone هو الأكبر ب${-monthone + monthtow} شهر و ${-dayone + daytow} يوم .")
                if (monthone > monthtow) {
                    avar.setText("$nametow هو الأكبر ب${-monthtow + monthone} شهر و ${-daytow  + dayone} يوم .")
                }
            }
            if (monthone == monthtow) {
                if (dayone < daytow) {
                    avar.setText("$nameone هو الأكبر ب${-dayone + daytow} يوم .")
                    if (dayone > daytow) {
                        avar.setText("$nametow هو الأكبر ${-daytow + dayone} يوم .")
                    }
                }
            }
        }


            Toast.makeText(this,"${avar.text}",Toast.LENGTH_SHORT).show()

        }
    }
}