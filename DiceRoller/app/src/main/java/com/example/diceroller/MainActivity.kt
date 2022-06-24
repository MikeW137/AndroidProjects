package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()
        val dice2  = Dice(6);
        val diceRoll2 = dice2.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll1.toString()
        val resultTextView2: TextView = findViewById(R.id.textView4)
        resultTextView2.text = diceRoll2.toString()
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}