package com.example.unitconverteAliKhalifa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

class ActivityConvertTime : AppCompatActivity() {
    lateinit var btnConvertTime: Button
    lateinit var textConvertTime: TextView
    lateinit var textResultTime:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_time)

        btnConvertTime=findViewById(R.id.button_Convert_Calendar)
        textConvertTime=findViewById(R.id.text_Convert_Calendar)
        textResultTime=findViewById(R.id.text_Calendar_Result)

        btnConvertTime.setOnClickListener {
            try {
                val hour = textConvertTime.text.toString().toInt()
                textResultTime.text = ( (hour*60).toString() +" Minutes\n"+ (hour*3600)+ " Seconds\n" +(hour*3600000) +" Millisecond")
            }catch (e:Exception){}



        }


    }
}