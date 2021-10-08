package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main10.*
import kotlinx.android.synthetic.main.item_todo.*

class MainActivity10 : AppCompatActivity() {

    lateinit var tv_Time: TextView
    lateinit var tv_Clicks: TextView

    lateinit var b_start: Button
    lateinit var b_click: Button

    var currentTime = 10
    var currentclick = 0

    //create timer
    lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        back11.setOnClickListener { val intent = Intent(this, MainActivity2 ::class.java) ; startActivity(intent) ; finish() }

        //init the objects
        tv_Time=findViewById(R.id.tv_Time)
        tv_Clicks=findViewById(R.id.tv_Clicks)

        b_start=findViewById(R.id.b_start)
        b_click=findViewById(R.id.b_click)

        //init thegame by disobling the click button
        b_click.isEnabled = false
        //click listener
        b_start.setOnClickListener {
            //start new game
            //currentTime = 10
            currentTime = 10
            currentclick = 0

            //change button state
            b_start.isEnabled = false
            b_click.isEnabled = true

            //start the timer
            timer.start()
        }

        b_click.setOnClickListener {
            //increase clicks and display them
            currentclick++
            tv_Clicks.text = "عدد النقرات : $currentclick"
        }

        //init the timer
       timer = object : CountDownTimer(10000,1000){//10000 = 10 seconds game, 1000 = refresh each second
           override fun onTick(millisUntilFinished: Long) {
           //each second display the time
           currentTime--
           val time = currentTime + 1 //adjust the time + 1 for the output
           tv_Time.text = "الوقت : $time"
           }

           override fun onFinish() {
               //timer ended
               tv_Time.text = "الوقت : 0"

               //change button state
               b_start.isEnabled = true
               b_click.isEnabled = false

           }
       }
    }
}