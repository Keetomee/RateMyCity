package com.example.ratemycitymain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ratemycitymain.databinding.ActivityDashboardBinding
import com.example.ratemycitymain.databinding.ActivityHomeMainBinding

class home_main : AppCompatActivity() {

    private lateinit var binding: ActivityHomeMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCompare.setOnClickListener{
            startActivity(Intent(this, comaprepage::class.java))
        }

        binding.buttonAdd.setOnClickListener {
            startActivity(Intent(this, add_post::class.java))
        }
        binding.more69.setOnClickListener {
            startActivity(Intent(this,more::class.java))
        }

    }

}

