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
import kotlinx.android.synthetic.main.activity_main9.*

class facebooke : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebooke)

        back6.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity8::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"رجوع", Toast.LENGTH_SHORT).show()

        }

        webView.settings.javaScriptEnabled

        var URL =""

        webView.webViewClient = object : WebViewClient(){

            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                URL = request.toString()

                return false
            }
        }

        webView.loadUrl("https://fb.com")

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return if (keyCode != KeyEvent.KEYCODE_BACK || !webView.canGoBack()) {
            webView.goBack()
            true
        } else{
            super.onKeyDown(keyCode, event)
        }


    }
}