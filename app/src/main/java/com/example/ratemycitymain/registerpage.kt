package com.example.ratemycitymain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ratemycitymain.databinding.ActivityLoginpageBinding
import com.example.ratemycitymain.databinding.ActivityRegisterpageBinding

class registerpage : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin3.setOnClickListener {
            startActivity(Intent(this, loginpage::class.java))
        }
    }
}