package com.drogunova.neuroapps.mkotlinlessons

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //переменные для ClickListener-а
    val msgText = "Hello World!"
    val duration = Toast.LENGTH_LONG


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //обработка нажатия кнопки
        button.setOnClickListener {
            val toast = Toast.makeText(applicationContext, msgText, duration)
            toast.show()
        }
    }
}