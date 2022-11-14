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
            val entermobile = binding.enterLayout.editText.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("value", 10)
            intent.putExtra("name", "Anil")
            intent.putExtra("mobileNo", entermobile)
            startActivity(intent)
        }
    }
}