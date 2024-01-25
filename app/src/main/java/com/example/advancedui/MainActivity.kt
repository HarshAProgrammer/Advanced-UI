package com.example.advancedui

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.advancedui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.checkBox.isChecked){

                }else{
                    binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                    Toast.makeText(applicationContext,"Please Accept the terms and Conditions",Toast.LENGTH_LONG).show()
                }

        }


    }
}