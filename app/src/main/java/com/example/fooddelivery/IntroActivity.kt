package com.example.fooddelivery

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddelivery.activity.OnboardingActivity1
import com.example.fooddelivery.activity.SignUpActivity


class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intro)

        findViewById<View>(R.id.startBtn).setOnClickListener{
            val intent = Intent(this, OnboardingActivity1::class.java)
            startActivity(intent)
        }



    }
}
