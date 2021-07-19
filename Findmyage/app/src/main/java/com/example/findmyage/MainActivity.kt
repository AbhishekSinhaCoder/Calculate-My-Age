package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun onClick(view : View){
        val userDOB:Int = Integer.parseInt(editTextDate.text.toString())
        val currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
        val viewuserAgeInYears:Int = currentYear - userDOB
        textView.text = "Your Age is $viewuserAgeInYears Years"
    }
}