package com.anil.day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.anil.day1.databinding.ActivityRadioButtonBinding
import com.anil.day1.databinding.ActivitySumSubBinding

class SumSubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySumSubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySumSubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sumButton.setOnClickListener {

            if (isValidForm()) {
                val sum = getNumberOne() + getNumberTwo()
                Toast.makeText(
                    this,
                    getString(R.string.sumof, getNumberOne(), getNumberTwo(), sum),
                    Toast.LENGTH_SHORT
                ).show()

            }
        }

        binding.subButton.setOnClickListener {
            if (isValidForm(isSub = true)) {
                val sub = getNumberOne() - getNumberTwo()
                Toast.makeText(
                    this,
                    getString(R.string.subof, getNumberOne(), getNumberTwo(), sub),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun isValidForm(isSub: Boolean = false): Boolean {
        val number1 = binding.firstnumberinput.text.toString()
        val number2 = binding.secondnumberinput.text.toString()

        if (number1.isEmpty()) {
            binding.firstnumberinput.error = getString(R.string.enternumber1)
            binding.firstnumberinput.requestFocus()
            return false
        } else {
            binding.firstnumberinput.error = null
        }

        if (number2.isEmpty()) {
            binding.secondnumberinput.error = getString(R.string.enternumber2)
            binding.secondnumberinput.requestFocus()
            return false
        } else {
            binding.secondnumberinput.error = null
        }

        if (isSub) {
            if (number1.toInt() < number2.toInt()) {
                binding.firstnumberinput.error = getString(R.string.smallnumber)
                binding.firstnumberinput.requestFocus()
                return false
            }
        }

        return true
    }

    private fun getNumberOne(): Int {
        return binding.firstnumberinput.text.toString().toInt()
    }

    private fun getNumberTwo(): Int {
        return binding.secondnumberinput.text.toString().toInt()
    }
}