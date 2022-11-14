package com.anil.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.anil.day1.databinding.ActivityMobileBinding
import com.anil.day1.databinding.ActivityPasswordBinding

class MobileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMobileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMobileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.getOtp.setOnClickListener {
            val entermobile = binding.enterMobileText.text.toString()

            if (entermobile.isEmpty()) {
                binding.enterMobile.error = "Please Enter your mobile number"
                return@setOnClickListener
            }
            binding.enterMobile.error = null

            val intent = Intent(this, OtpActivity::class.java)
            intent.putExtra("mobile_number", entermobile)
            intent.putExtra("a", 100)
            intent.putExtra("b", 8f)
            intent.putExtra("name", "Anil")

            startActivity(intent)
        }


    }
}