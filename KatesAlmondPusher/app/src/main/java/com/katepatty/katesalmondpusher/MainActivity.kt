package com.katepatty.katesalmondpusher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

//The type of binding, the ActivityMainBinding class,
//is created by the compiler specifically for this main activity.
//The name is derived from the name of the layout file,
//that is, activity_main + Binding.
import com.katepatty.katesalmondpusher.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val kFood: MyFood = MyFood("Almond Chocolate","",0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.kFood = kFood

        binding.apply {
            binding.txt1.visibility = View.VISIBLE
            binding.number.visibility = View.VISIBLE
            binding.btn.visibility = View.GONE
            binding.btn.visibility = View.VISIBLE
            binding.btn.setOnClickListener { showCalories() }
        }

    }

    private fun showCalories(){

        val kFood: MyFood = MyFood("Almond Chocolate","",0)

        binding.apply {

            kFood.g = number.text.toString()
            kFood.calories = (parseInt(kFood.g) * 5.456).toInt()
            total.text = kFood.calories.toString() +"kcal"
            // update data
            //invalidateAll()

        }


    }



}