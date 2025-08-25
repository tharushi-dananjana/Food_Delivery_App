package com.example.fooddelivery.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddelivery.R

class OnboardingActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding2)

        findViewById<View>(R.id.arrowBtn1).setOnClickListener {
            val intent = Intent(this, OnboardingActivity3::class.java)
            startActivity(intent)
        }
    }
}
