package com.example.ratemycitymain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ratemycitymain.databinding.ActivityComaprepageBinding
import com.example.ratemycitymain.databinding.ActivityLoginpageBinding

class comaprepage : AppCompatActivity() {

    private lateinit var binding: ActivityComaprepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComaprepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonHome2.setOnClickListener {
            startActivity(Intent(this, home_main::class.java))

        }

        binding.buttonAdd212.setOnClickListener {
            startActivity(Intent(this,add_post::class.java))
        }
        binding.more99.setOnClickListener {
            startActivity(Intent(this,more::class.java))
        }

    }
}