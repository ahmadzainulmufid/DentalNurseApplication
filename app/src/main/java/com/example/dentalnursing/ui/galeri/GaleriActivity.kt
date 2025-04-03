package com.example.dentalnursing.ui.galeri

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dentalnursing.R
import android.widget.ImageButton

class GaleriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)
        // Find the back button by its ID
        val btnBack: ImageButton = findViewById(R.id.btn_back)

        // Set an OnClickListener to handle the back button press
        btnBack.setOnClickListener {
            // Handle the back button press
            onBackPressed() // This will navigate back to the previous activity
        }
    }
}