package com.example.unitconverteAliKhalifa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCurrency:Button
    lateinit var btnWight:Button
    lateinit var btnLength:Button
    lateinit var btnTime:Button
    lateinit var btnTemperature: Button
    lateinit var btnDateConvertar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCurrency = findViewById(R.id.btn1)
        btnWight = findViewById(R.id.btn2)
        btnTime=findViewById(R.id.btn3)
        btnLength = findViewById(R.id.btn4)
        btnTemperature=findViewById(R.id.btn5)
        btnDateConvertar=findViewById(R.id.btn6)

        btnCurrency.setOnClickListener {
            val  enter = Intent(this,ActivityConvertCurrency::class.java)
            startActivity(enter)
        }

        btnLength.setOnClickListener {
            val enter = Intent(this,ActivityConvertLength::class.java)
            startActivity(enter)
        }

        btnWight.setOnClickListener {
            val enter = Intent(this,ActivityConvertarWight::class.java)
            startActivity(enter)
        }
        btnTime.setOnClickListener {
            val  enter = Intent(this,ActivityConvertTime::class.java)
            startActivity(enter)
        }

        btnTemperature.setOnClickListener {
            val  enter = Intent(this,ActivityConvertTemperature::class.java)
            startActivity(enter)
        }
        btnDateConvertar.setOnClickListener {
            val  enter = Intent(this,ActivityConvertCalendar::class.java)
            startActivity(enter)
        }

    }
}