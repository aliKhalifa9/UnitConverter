package com.example.unitconverteAliKhalifa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityConvertLength : AppCompatActivity() {
    lateinit var btnConvertLength: Button
    lateinit var textLengthConvert: TextView
    lateinit var textLengthResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_length)


        btnConvertLength = findViewById(R.id.button_Convert_Calendar)
        textLengthConvert = findViewById(R.id.text_Convert_Calendar)
        textLengthResult = findViewById(R.id.text_Calendar_Result)

        btnConvertLength.setOnClickListener {
            try {
                val meter = textLengthConvert.text.toString().toFloat()
                textLengthResult.text= ((meter/1000).toBigDecimal().toString()+" KM \n" +
                        (meter*100).toBigDecimal() + " CM \n" + (meter*1000).toBigDecimal() +" MM" )
            }catch (e:Exception){}
        }


    }
}