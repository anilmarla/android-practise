package com.anil.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.day1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //        https://dribbble.com/shots/19153569-Mobile-App-iOS-Android-UI

        binding.radioButton.setOnClickListener {
            val intent = Intent(this, RadioButtonActivity::class.java)
            startActivity(intent)
        }

        binding.checkbox.setOnClickListener {
            val intent = Intent(this, CheckBoxActivity::class.java)
            startActivity(intent)
        }
        binding.TextView.setOnClickListener {
            val intent = Intent(this, TextActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            val intent = Intent(this, ButtonActivity::class.java)
            startActivity(intent)
        }
        binding.yellow.setOnClickListener {
            val intent = Intent(this, YellowActivity::class.java)
            startActivity(intent)
        }
        binding.white.setOnClickListener {
            val intent = Intent(this, WhiteActivity::class.java)
            startActivity(intent)
        }
        binding.textActivity.setOnClickListener {
            val intent = Intent(this, TextFiledsActivity::class.java)
            startActivity(intent)
        }
        binding.cardPayment.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }
        binding.loginAccount.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.passwordcreatinon.setOnClickListener {
            val intent = Intent(this, PasswordActivity::class.java)
            startActivity(intent)
        }
        binding.mobileButton.setOnClickListener {
            val intent = Intent(this, MobileActivity::class.java )
            startActivity(intent)
        }
        binding.sumsubButton.setOnClickListener {
            val intent = Intent(this, SumSubActivity::class.java)
            startActivity(intent)
        }
        binding.senddata.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
        binding.cardView.setOnClickListener {
            val intent = Intent(this, CardViewActivity::class.java)
            startActivity(intent)
        }

        }

    }
