package com.example.dynamiccolorm3setup

import android.graphics.text.LineBreaker
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val tvAppInfo = findViewById<TextView>(R.id.tvAppInfo)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                tvAppInfo.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD
            }

            tvAppInfo.text = " Dynamic Color, which was added in Android 12, enables users to personalize their devices to align tonally with the color scheme of their personal wallpaper or through a selected color in the wallpaper picker."

    }
}