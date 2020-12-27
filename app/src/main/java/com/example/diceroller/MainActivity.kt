package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var diceBtn :Button = findViewById(R.id.diceBtn)
        var diceTextView:TextView  = findViewById(R.id.diceTextView)

        var random = Random(7)




    }


}