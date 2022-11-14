package com.anil.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.anil.day1.databinding.ActivityMainBinding
import com.anil.day1.databinding.ActivityPasswordBinding

class PasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.resetpassword.setOnClickListener {
            val password1 = binding.password1.text.toString()
            val password2 = binding.password2.text.toString()

            if (password1.length < 8) {
                binding.password1.error = getString(R.string.password_min_error)
                return@setOnClickListener
            }

            if (password2.length < 8) {
                binding.password2.error = getString(R.string.password_min_error)
                return@setOnClickListener
            }

            binding.password1.error = null
            binding.password2.error = null

            if (password1 != password2) {
                Toast.makeText(this, "Password is not matched", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

                Toast.makeText(this, "Password is reset Sucessfully", Toast.LENGTH_LONG).show()


        }
    }
}
