package com.example.week4activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.example.week4activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1);
        val button2 = findViewById<Button>(R.id.button2);
        val imageView = findViewById<ImageView>(R.id.imageView)


        binding.textview01.setOnClickListener{
            binding.name = "goodbye"
        }

        button1.setOnClickListener{
            imageView.setImageResource(R.drawable.calm_shiba)
        }

        button2.setOnClickListener {
            imageView.setImageResource(R.drawable.angry_shiba)
        }

        }
}
