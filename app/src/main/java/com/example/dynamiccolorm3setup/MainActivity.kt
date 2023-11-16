package com.example.dynamiccolorm3setup

import android.content.res.Configuration
import android.graphics.text.LineBreaker
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.view.ContextThemeWrapper
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.ViewCompat
import androidx.core.widget.TextViewCompat
import com.example.dynamiccolorm3setup.databinding.ActivityMainBinding
import com.google.android.material.color.DynamicColors
import com.google.android.material.color.DynamicColorsOptions

class MainActivity : AppCompatActivity() {

    //viewBinding:
    private lateinit var binding: ActivityMainBinding

    private lateinit var tvAppInfo: TextView

    private lateinit var btDefaultTheme: Button
    private lateinit var btRedTheme: Button
    private lateinit var btBlueTheme: Button
    private lateinit var btGreenTheme: Button
    private lateinit var btPurpleTheme: Button
    private lateinit var btYellowTheme: Button

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //viewBinding:
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startingComponents()

        supportActionBar!!.hide()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            tvAppInfo.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD
        }

        tvAppInfo.text =
            " Dynamic Color, which was added in Android 12, enables users to personalize their devices to align tonally with the color scheme of their personal wallpaper or through a selected color in the wallpaper picker."



        btRedTheme.setOnClickListener { redTheme() }
        btBlueTheme.setOnClickListener { blueTheme() }
        btGreenTheme.setOnClickListener { greenTheme() }
        btYellowTheme.setOnClickListener { yellowTheme() }
        btPurpleTheme.setOnClickListener { purpleTheme() }
        btDefaultTheme.setOnClickListener { defaultTheme() }


    }

    private fun redTheme() {
        Toast.makeText(this,"RedTheme", Toast.LENGTH_SHORT).show()
    }

    private fun blueTheme() {
        Toast.makeText(this,"BlueTheme", Toast.LENGTH_SHORT).show()
    }

    private fun greenTheme() {
        Toast.makeText(this,"GreenTheme", Toast.LENGTH_SHORT).show()
    }

    private fun yellowTheme() {
        Toast.makeText(this,"YellowTheme", Toast.LENGTH_SHORT).show()
    }

    private fun purpleTheme() {
        Toast.makeText(this,"PurpleTheme", Toast.LENGTH_SHORT).show()
    }

    private fun defaultTheme() {
        Toast.makeText(this,"DefaultTheme", Toast.LENGTH_SHORT).show()
    }

    private fun startingComponents() {
        tvAppInfo = binding.tvAppInfo

        btDefaultTheme = binding.btDefault
        btRedTheme = binding.btRed
        btPurpleTheme = binding.btPurple
        btYellowTheme = binding.btYellow
        btGreenTheme = binding.btGreen
        btBlueTheme = binding.btBlue
    }
}