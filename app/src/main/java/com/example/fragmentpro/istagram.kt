package com.example.fragmentpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_facebooke.*
import kotlinx.android.synthetic.main.activity_istagram.*
import kotlinx.android.synthetic.main.activity_main9.*

class istagram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_istagram)

        back7.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity8::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"رجوع", Toast.LENGTH_SHORT).show()

        }

        webView2.settings.javaScriptEnabled

        var URL =""

        webView2.webViewClient = object : WebViewClient(){

            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                URL = request.toString()

                return false
            }
        }

        webView2.loadUrl("https://www.instaram.com")

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return if (keyCode != KeyEvent.KEYCODE_BACK || !webView2.canGoBack()) {
            webView2.goBack()
            true
        } else{
            super.onKeyDown(keyCode, event)
        }

    }
}