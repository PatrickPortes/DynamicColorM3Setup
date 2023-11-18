package com.example.dynamiccolorm3setup

import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import com.google.android.material.color.DynamicColors

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        DynamicColors.applyToActivitiesIfAvailable(this)

    }
}