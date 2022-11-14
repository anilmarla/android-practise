package com.anil.day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.anil.day1.databinding.ActivityCardBinding

class CardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initIncomeTypeDropDown()
    }

    private fun initIncomeTypeDropDown() {
        val items = listOf("Salaried", "Business", "Individual", "Other")
        val adapter = ArrayAdapter(this, R.layout.list_item, items)
        binding.incomeType.setAdapter(adapter)
    }
}