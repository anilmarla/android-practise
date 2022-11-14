package com.anil.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.anil.day1.databinding.ActivityMobileBinding
import com.anil.day1.databinding.ActivityOtpBinding

class OtpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOtpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mobileNumber = intent?.extras?.getString("mobile_number")
        val name = intent?.extras?.getString("name")
        val a = intent?.extras?.getInt("a")
        val b = intent?.extras?.getFloat("b")

        binding.mobileNumber.text = mobileNumber

        binding.verifyOtpBtn.setOnClickListener {
            val enterotp1 = binding.otpEditBox1.text.toString()
            val enterotp2 = binding.otpEditBox2.text.toString()
            val enterotp3 = binding.otpEditBox3.text.toString()
            val enterotp4 = binding.otpEditBox4.text.toString()

            if(enterotp1.isEmpty() || enterotp2.isEmpty() || enterotp3.isEmpty() || enterotp4.isEmpty()){
                Toast.makeText(this, "Please enter the OTP" ,Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
            // close the current screen
            finish()
        }

        binding.btnEdit.setOnClickListener {
            finish()
        }
    }
}