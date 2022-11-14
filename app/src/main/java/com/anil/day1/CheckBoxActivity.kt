package com.anil.day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.anil.day1.databinding.ActivityCheckBoxBinding
import com.anil.day1.databinding.ActivityRadioButtonBinding

class CheckBoxActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCheckBoxBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checknow.setOnClickListener {
            val selectedItems = mutableListOf<String>()
            if(binding.checkbox1.isChecked){
                selectedItems.add(binding.checkbox1.text.toString())
            }

            if(binding.checkbox2.isChecked){
                selectedItems.add(binding.checkbox2.text.toString())
            }

            if (binding.checkbox3.isChecked){
                selectedItems.add(binding.checkbox3.text.toString())
            }

            if(binding.checkbox4.isChecked){
                selectedItems.add(binding.checkbox4.text.toString())
            }

            if(binding.checkbox5.isChecked){
                selectedItems.add(binding.checkbox5.text.toString())
            }

            val checkedId = binding.checkbox1
//           val checkedId = binding.root.findViewById<CheckBoxActivity>(checkedId).getText()
            Toast.makeText(this, "Checked Text ${selectedItems.joinToString(separator = ", ")}", Toast.LENGTH_LONG).show()
        }
    }
}