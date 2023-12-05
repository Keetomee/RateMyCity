package com.example.ratemycitymain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ratemycitymain.databinding.ActivityAddPostBinding
import com.example.ratemycitymain.databinding.ActivityComaprepageBinding

class add_post : AppCompatActivity() {

    private lateinit var binding: ActivityAddPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCompare12.setOnClickListener {
            startActivity(Intent(this,comaprepage::class.java))
        }

        binding.buttonHome22.setOnClickListener {
            startActivity(Intent(this, home_main::class.java))
        }
        binding.more12.setOnClickListener {
            startActivity(Intent(this, more::class.java))
        }

    }
}