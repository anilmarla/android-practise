package com.anil.day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.anil.day1.databinding.ActivityMainBinding
import com.anil.day1.databinding.ActivityTextBinding

class TextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            if (binding.date.visibility == View.GONE) {
                binding.date.visibility = View.VISIBLE
                binding.imageView.visibility = View.VISIBLE
                binding.text11.visibility = View.VISIBLE
            } else {
                binding.date.visibility = View.INVISIBLE
                binding.imageView.visibility = View.INVISIBLE
                binding.text11.visibility = View.INVISIBLE
            }
        }
    }
}