package com.example.ratemycitymain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ratemycitymain.databinding.ActivityLandingpage1Binding
import com.example.ratemycitymain.databinding.ActivityLoginpageBinding

class loginpage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            startActivity(Intent(this, home_main::class.java))
        }

        binding.button2.setOnClickListener {
            startActivity(Intent(this, registerpage::class.java))
        }
    }
}