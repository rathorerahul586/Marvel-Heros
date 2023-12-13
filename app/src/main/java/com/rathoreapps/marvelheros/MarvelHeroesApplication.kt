package com.rathoreapps.marvelheros

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

/**
 * Copyright (C) 2023 RathoreApps Inc.
 *
 * Created by Rahul Kumar
 * @Date: 12/12/23
 * @Time: 7:03 pm
 * @Email: rathoreapps01@gmail.com
 *
 * Description: Application
 */

@HiltAndroidApp
class MarvelHeroesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {
        lateinit var appContext: Context
    }
}