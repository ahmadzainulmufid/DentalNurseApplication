package com.example.dentalnursing.ui.akreditas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dentalnursing.R
import android.widget.ImageButton
import android.widget.TextView


class AkreditasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akreditas)

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        val tvLink: TextView = findViewById(R.id.tv_link)

        val linkText = "http://link.kemkes.go.id/AkreditasiKesehatanGigi"
        val spannable = android.text.SpannableString(linkText)
        spannable.setSpan(android.text.style.UnderlineSpan(), 0, linkText.length, 0)
        tvLink.text = spannable

        btnBack.setOnClickListener {
            onBackPressed()
        }

        tvLink.setOnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://link.kemkes.go.id/AkreditasiKesehatanGigi"))
            startActivity(urlIntent)
        }
    }
}