package com.example.unitconverteAliKhalifa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

class ActivityConvertTemperature : AppCompatActivity() {

    lateinit var btnTempConverte:Button
    lateinit var textTempConvert:TextView
    lateinit var textTempResult:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_temperature)

        btnTempConverte=findViewById(R.id.button_Convert_Temperature)
        textTempConvert=findViewById(R.id.text_Convert_Temperature)
        textTempResult=findViewById(R.id.text_Temperature_Result)

        btnTempConverte.setOnClickListener {
            try {
                val celsius = textTempConvert.text.toString().toDouble()
                textTempResult.text= (((celsius*9/5)+32).toString()+" °F")
            }catch (e:Exception){}
        }


    }
}