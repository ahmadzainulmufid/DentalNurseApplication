package com.example.dentalnursing.ui.mahasiswa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dentalnursing.databinding.ActivityMahasiswaBinding

class MahasiswaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMahasiswaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMahasiswaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupIntentViews()
        setupBackButton()  // Set up the back button
    }

    private fun setupIntentViews() {
        binding.card1.setOnClickListener {
            startActivity(Intent(this, PrestasiActivity::class.java))
        }
        binding.card2.setOnClickListener {
            startActivity(Intent(this, KegiatanActivity::class.java))
        }
    }

    private fun setupBackButton() {
        // Set an OnClickListener on the back button
        binding.btnBack.setOnClickListener {
            onBackPressed()  // This will navigate back to the previous activity
        }
    }
}
