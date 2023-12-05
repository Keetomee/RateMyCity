package com.example.ratemycitymain

import android.content.Intent
import android.os.Bundle
import com.example.ratemycitymain.databinding.ActivityLandingpage1Binding
import androidx.appcompat.app.AppCompatActivity


class landingpage1 : AppCompatActivity() {

    private lateinit var binding: ActivityLandingpage1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingpage1Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, loginpage::class.java))
        }
    }
}