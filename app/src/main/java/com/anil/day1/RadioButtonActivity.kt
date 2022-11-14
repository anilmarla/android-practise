package com.anil.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.RadioButton
import android.widget.Toast
import com.anil.day1.databinding.ActivityMainBinding
import com.anil.day1.databinding.ActivityRadioButtonBinding

class RadioButtonActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRadioButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ClickMe.setOnClickListener {
            val checkedId = binding.radioGroup.checkedRadioButtonId
            val checkedText = binding.root.findViewById<RadioButton>(checkedId).text
            Toast.makeText(this, "Checked text $checkedText", Toast.LENGTH_LONG).show()
        }
    }
}