package com.anil.day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:SecondActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if(intent != null){
            val name = intent.extras?.getString("name")
            val value = intent.extras?.getInt("value")
            val number = intent.extras?.getString("number")

            Toast.makeText(this, "Name: $name, Value: $value", Toast.LENGTH_SHORT).show()
        }
    }
}