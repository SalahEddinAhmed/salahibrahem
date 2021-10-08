package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main6.*
import java.util.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        back2.setOnClickListener { val intent = Intent(this,MainActivity3::class.java) ; startActivity(intent) ; finish() }

        button3.setOnClickListener {
            val intent =Intent(this, MainActivity5::class.java)
            startActivity(intent )
            finish()
        }



        sum.setOnClickListener {

            val name = name.text.toString()
            val dayOfBirth = day.text.toString().toInt()
            val today = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            val monthOfBirth = month.text.toString().toInt()
            val thismonthe = Calendar.getInstance().get(Calendar.MONTH)
            val yearOfBirth = year.text.toString().toInt()
            val thisyear = Calendar.getInstance().get(Calendar.YEAR)

            val yorday = today - dayOfBirth
            val yourmonthe = (thismonthe - monthOfBirth) + 1
            val youryear = thisyear - yearOfBirth
            val yourbigmonth = (monthOfBirth - thismonthe ) + 1
            val yourbiday = (dayOfBirth - today )

            if (yourmonthe < 0){

                av.setText("عمر $name هو : $youryear سنة و $yorday شهر إلا $yourbigmonth شهور")

            } else {av.setText("عمر $name هو : $youryear سنة و $yourmonthe شهور و $yorday يوم ")}

                if (yorday < 0 ){

                av.setText("عمر $name هو : $youryear سنة و $yourmonthe شهور إلا $yourbiday يوم ")

            }else {av.setText("عمر $name هو : $youryear سنة و $yourmonthe شهور و $yorday يوم ")}

            if (yorday < 0 &&  yorday < 0 ){

                av.setText("عمر $name هو : $youryear سنة و $yourmonthe شهور إلا $yourbiday يوم ")

            }else {av.setText("عمر $name هو : $youryear سنة و $yourmonthe شهور و $yorday يوم ")}

        }

    }
}