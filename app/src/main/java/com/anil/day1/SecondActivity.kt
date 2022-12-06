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
            val data = intent?.getBundleExtra("data")
            val name = data?.getString("name")
            val value = data?.getInt("value")
            val number = data?.getString("number")

            Toast.makeText(this, "Name: $name, Value: $value", Toast.LENGTH_SHORT).show()
        }
    }
}