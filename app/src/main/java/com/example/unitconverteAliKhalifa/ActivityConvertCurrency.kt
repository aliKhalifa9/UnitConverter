package com.example.unitconverteAliKhalifa


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import java.lang.Exception

class ActivityConvertCurrency : AppCompatActivity() {
    lateinit var btnConvertCurrency:Button
    lateinit var textConvertCurrency:TextView
    lateinit var radioDollar:RadioButton
    lateinit var radioEuro:RadioButton
    lateinit var textConvertResultCurrency: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_currency)

        btnConvertCurrency = findViewById(R.id.button_Convert_Calendar)
        textConvertCurrency=findViewById(R.id.text_Convert_Calendar)
        textConvertResultCurrency= findViewById(R.id.text_Calendar_Result)
        radioDollar=findViewById(R.id.Radio_Dollar)
        radioEuro =findViewById(R.id.radio_Euro)

        btnConvertCurrency.setOnClickListener {
            try {
                val dinar = textConvertCurrency.text.toString().toDouble()
                if (radioDollar.isChecked){textConvertResultCurrency.text=((dinar*0.00069).toBigDecimal().toString()+"$")}
                else{ if (radioEuro.isChecked)textConvertResultCurrency.text=((dinar*0.00057).toBigDecimal().toString()+"€")}
            }catch (e:Exception){}

        }

    }
}