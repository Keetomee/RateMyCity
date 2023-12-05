package com.example.ratemycitymain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ratemycitymain.databinding.ActivityMoreBinding

class more : AppCompatActivity() {

    private lateinit var binding: ActivityMoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button9191.setOnClickListener {
            startActivity(Intent(this, add_post::class.java))
        }
        binding.buttonHome2121.setOnClickListener {
            startActivity(Intent(this, home_main::class.java))
        }
        binding.buttonCompare0909.setOnClickListener {
            startActivity(Intent(this,comaprepage::class.java))
        }
    }
}