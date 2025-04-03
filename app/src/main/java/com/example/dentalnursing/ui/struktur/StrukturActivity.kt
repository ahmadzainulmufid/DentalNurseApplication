package com.example.dentalnursing.ui.struktur

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dentalnursing.R
import android.widget.ImageButton


class StrukturActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_struktur)
        val btnBack: ImageButton = findViewById(R.id.btn_back)
        btnBack.setOnClickListener {
            // Handle the back button press
            onBackPressed() // This will navigate back to the previous activity
        }
    }
}