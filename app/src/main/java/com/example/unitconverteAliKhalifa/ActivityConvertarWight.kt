package com.example.unitconverteAliKhalifa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

class ActivityConvertarWight : AppCompatActivity() {
    lateinit var btnWight: Button
    lateinit var textWight :TextView
    lateinit var textResult:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convertar_wight)
        btnWight= findViewById(R.id.button_Convert_Calendar)
        textWight=findViewById(R.id.text_Convert_Calendar)
        textResult= findViewById(R.id.text_Calendar_Result)

        btnWight.setOnClickListener {
            try{
                val kilo = (textWight.text.toString().toDouble() * 2.205)
                  textResult.text = kilo.toString()

            }catch (e:Exception){}

        }

    }
}


