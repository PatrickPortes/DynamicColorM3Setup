package com.example.dynamiccolorm3setup

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import android.graphics.text.LineBreaker
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.dynamiccolorm3setup.databinding.ActivityMainBinding
import com.google.android.material.color.DynamicColors
import kotlin.properties.Delegates

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

    private var nightMode by Delegates.notNull<Boolean>()

    //SharedPreferences
    private lateinit var sharedPreferences: SharedPreferences

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchMode: Switch

    @SuppressLint("CommitPrefEdits", "SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //TODO:
//        when (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
//            Configuration.UI_MODE_NIGHT_NO -> {
//                // Light Mode:
//                Toast.makeText(this, "Switch Desativado: Day Mode", Toast.LENGTH_SHORT).show()
//            }
//
//            Configuration.UI_MODE_NIGHT_YES -> {
//                // Modo escuro
//                Toast.makeText(this, "Switch Ativado: Night Mode", Toast.LENGTH_SHORT).show()
//
//            }
//        }

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


        //SharedPreferences
        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE)
        nightMode = sharedPreferences.getBoolean("nightMode", true)

        if (nightMode) {
            switchMode.isChecked = true
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            switchMode.text = "NightTheme"
        }

        var editor: SharedPreferences.Editor

        switchMode.setOnClickListener {

            if (nightMode) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                editor = sharedPreferences.edit()
                editor.putBoolean("nightMode", false)

                switchMode.text = "DayTheme"
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                editor = sharedPreferences.edit()
                editor.putBoolean("nightMode", true)

                switchMode.text = "NightTheme"
            }
            editor.apply()
        }


        btRedTheme.setOnClickListener { redTheme() }
        btBlueTheme.setOnClickListener { blueTheme() }
        btGreenTheme.setOnClickListener { greenTheme() }
        btYellowTheme.setOnClickListener { yellowTheme() }
        btPurpleTheme.setOnClickListener { purpleTheme() }
        btDefaultTheme.setOnClickListener { defaultTheme() }

    }

    private fun redTheme() {
        Toast.makeText(this, "RedTheme", Toast.LENGTH_SHORT).show()
        //TODO
    }

    private fun blueTheme() {
        Toast.makeText(this, "BlueTheme", Toast.LENGTH_SHORT).show()
        //TODO
    }

    private fun greenTheme() {
        Toast.makeText(this, "GreenTheme", Toast.LENGTH_SHORT).show()
        //TODO
    }

    private fun yellowTheme() {
        Toast.makeText(this, "YellowTheme", Toast.LENGTH_SHORT).show()
        //TODO
    }

    private fun purpleTheme() {
        Toast.makeText(this, "PurpleTheme", Toast.LENGTH_SHORT).show()
        //TODO
    }

    private fun defaultTheme() {
        Toast.makeText(this, "DefaultTheme", Toast.LENGTH_SHORT).show()
        //TODO
    }

    private fun startingComponents() {
        tvAppInfo = binding.tvAppInfo

        btDefaultTheme = binding.btDefault
        btRedTheme = binding.btRed
        btPurpleTheme = binding.btPurple
        btYellowTheme = binding.btYellow
        btGreenTheme = binding.btGreen
        btBlueTheme = binding.btBlue

        //Testing
        switchMode = binding.switch1
    }
}