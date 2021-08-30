package com.example.dicerolltask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var dice1Image : ImageView;
    lateinit var dice2Image : ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice1Image = findViewById(R.id.dice1)
        dice2Image = findViewById(R.id.dice2)
        val roll = findViewById<Button>(R.id.play)

        roll.setOnClickListener {
            rollDice()
            roll.setText("Roll Again")
        }
    }

    private fun rollDice() {

            val dice = Dice (6)
            val diceRoll = dice.roll()
            val drawableDice = when (diceRoll){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice1Image.setImageResource(drawableDice)

            val dice2 = Dice (6)
            val diceRoll2 = dice2.roll()
            val drawableDice1 = when (diceRoll2){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice2Image.setImageResource(drawableDice1)
        }
    }