package com.example.dicerolleraplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val luckyNumber = 4

        //    val secondDice = Dice(6)


        val rollButton: Button = findViewById(R.id.button)


        rollButton.setOnClickListener { rollDice() }
        rollDice()
    }
        fun rollDice() {
            val dice = Dice(6)
            val dice2 = Dice(6)
            val diceroll = dice.roll()
            val diceroll2 = dice2.roll()

            val diceImage : ImageView = findViewById(R.id.imageView)
            val diceImage2 : ImageView = findViewById(R.id.imageView2)

            val dravableResource2 = when(diceroll2){
                1-> R.drawable.dice_1
                2-> R.drawable.dice_2
                3-> R.drawable.dice_3
                4-> R.drawable.dice_4
                5-> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage2.setImageResource(dravableResource2)
            diceImage2.contentDescription = diceroll2.toString()

            val drawableResource =
                when (diceroll) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }

            diceImage.setImageResource(drawableResource)
            diceImage.contentDescription= diceroll.toString()




        }





   /*     rollButton.setOnClickListener {
            var diceRoll = firstDice.roll()

            val drawableResource when(diceRoll){
            1 -> (R.drawable.dice_1)
            2 -> (R.drawable.dice_2)
            3 -> (R.drawable.dice_3)
            4 -> (R.drawable.dice_4)
            5 -> (R.drawable.dice_5)
            else -> (R.drawable.dice_6)
        }

            val imageView : ImageView = findViewById(R.id.imageView)

            imageView.setImageDrawable(drawableResource)


*/




       //     var diceRoll2 = secondDice.roll()

       /*     val resultTextView1 : TextView = findViewById(R.id.textView)
            resultTextView1.text = diceRoll.toString() */

          /*  val resultTextView2 : TextView = findViewById(R.id.textView2)
            resultTextView2.text = diceRoll2.toString()

            if (diceRoll== luckyNumber){
                val toast = Toast.makeText(this,"You WON 12x !!!!",Toast.LENGTH_SHORT)
                toast.show()
                }
            else if(diceRoll >   4){
                val toast = Toast.makeText(this,"Your WON!!",Toast.LENGTH_SHORT)
                toast.show()
            }
            else{
                val toast = Toast.makeText(this,"Your lost",Toast.LENGTH_SHORT)
                toast.show()


            }
            */



        }

    class Dice( val numSides : Int){
        fun roll() : Int {
            return (1..numSides).random()

     }
    }
