package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapp.databinding.ActivityMainBinding
import com.example.loginapp.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    private lateinit var binding : ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var intent = getIntent()
        var data = intent.getStringExtra("msg")
        binding.welcometxt.setText(data)
    }
}