package com.anil.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.day1.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            val entermobile = binding.enterLayoutText.text.toString()

            val data = Bundle().apply {
                putInt("value", 10)
                putString("name", "Anil")
                putString("mobileNo", entermobile)
            }

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("data", data)
            }

            startActivity(intent)
        }
    }
}