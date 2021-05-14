package com.example.unitconverteAliKhalifa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView

class ActivityConvertCalendar : AppCompatActivity() {

    lateinit var btnDateConvert:Button
    lateinit var textDateConvert: TextView
    lateinit var textCalenderResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_calendar)

        btnDateConvert = findViewById(R.id.button_Convert_Calendar)
        textDateConvert = findViewById(R.id.text_Convert_Calendar)
        textCalenderResult = findViewById(R.id.text_Calendar_Result)

        btnDateConvert.setOnClickListener {
            try {
                val year = textDateConvert.text.toString().toInt()
                textCalenderResult.text= ((year-622/0.97).toInt().toString() + " Hijri")
            }catch (e:Exception){}
        }


    }
}