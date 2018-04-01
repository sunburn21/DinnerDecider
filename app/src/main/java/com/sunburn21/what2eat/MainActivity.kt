package com.sunburn21.what2eat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Shahi Paneer","Matar Paneer","Biryani","Kali Dal")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decidebtn.setOnClickListener{
            var random = Random()
            var randomFood = random.nextInt(foodList.count())
            selectedfooditem.text = foodList[randomFood]
        }
        addfoodbtn.setOnClickListener{
            var foodtxt = addfoodtxt.text.toString()
            foodList.add(foodtxt)
            addfoodtxt.text.clear()

        }

    }
}
