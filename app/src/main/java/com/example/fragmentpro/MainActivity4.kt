package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main4.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.nio.file.attribute.AclEntry
import javax.xml.xpath.XPathExpression

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        textView2.setOnClickListener { val intent = Intent (this, MainActivity3::class.java) ; startActivity(intent) ; finish()
            Toast.makeText(this,"رجوع", Toast.LENGTH_SHORT).show()}

        tv1.setOnClickListener { appendOnExpresstion("1", true) }
        tv2.setOnClickListener { appendOnExpresstion("2", true) }
        tv3.setOnClickListener { appendOnExpresstion("3", true) }
        tv4.setOnClickListener { appendOnExpresstion("4", true) }
        tv5.setOnClickListener { appendOnExpresstion("5", true) }
        tv6.setOnClickListener { appendOnExpresstion("6", true) }
        tv7.setOnClickListener { appendOnExpresstion("7", true) }
        tv8.setOnClickListener { appendOnExpresstion("8", true) }
        tv9.setOnClickListener { appendOnExpresstion("9", true) }
        tv0.setOnClickListener { appendOnExpresstion("0", true) }
        tvDot.setOnClickListener { appendOnExpresstion(".", true) }

        tvPlus.setOnClickListener { appendOnExpresstion("+", true) }
        tvMinus.setOnClickListener { appendOnExpresstion("-", true) }
        tvMul.setOnClickListener { appendOnExpresstion("*", true) }
        tvDivde.setOnClickListener { appendOnExpresstion("/", true) }
        tvopen.setOnClickListener { appendOnExpresstion("(", true) }
        tvclose.setOnClickListener { appendOnExpresstion(")", true) }

        tvClear.setOnClickListener {
            tvExpresstion.text = ""
            tvResult.text = ""
            Toast.makeText(this,"نظيف",Toast.LENGTH_SHORT).show()
        }

        tvBack.setOnClickListener {
            val string = tvExpresstion.text.toString()
            if (string.isNotEmpty()) {

                tvExpresstion.text = string.substring(0, string.length - 1)

            }
            tvResult.text = ""
        }

        tvEquals.setOnClickListener {

            try {

                val expression =  ExpressionBuilder (tvExpresstion.text.toString()).build()

                val result = expression.evaluate()
                val longResult = result.toLong()
                if (result == longResult.toDouble())
                    tvResult.text = longResult.toString()
                else
                    tvResult.text = result.toString()

            }catch (e:Exception){
                Log.d("Exception","message " + e.message )


            }

        }
    }


    fun appendOnExpresstion ( string: String, canClear : Boolean){

        if (tvResult.text.isNotEmpty()){

            tvExpresstion.text = ""

        }

        if (canClear){

            tvResult.text = ""
            tvExpresstion.append(string)
        }else{

            tvExpresstion.append(tvResult.text)
            tvExpresstion.append(string)
            tvResult.text=""
        }

    }


}
