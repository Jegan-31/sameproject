package com.example.sameproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickRed = findViewById<TextView>(R.id.redbut)
        val clickBlue = findViewById<TextView>(R.id.bluebut)
        val clickGreen = findViewById<TextView>(R.id.greenbut)
        val finalEvents = findViewById<TextView>(R.id.clickfunc)

        clickRed.setOnClickListener {
            finalEvents.text = "Red was Clicked"
        }
        clickBlue.setOnClickListener {
            finalEvents.text = "Blue was Clicked"
        }
        clickGreen.setOnClickListener {
            finalEvents.text = "Green was Clicked"
        }
    }
}
