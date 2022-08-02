package com.scalewill.go.core

import android.app.Application
import com.scalewill.go.di.AppComponent
import com.scalewill.go.di.DaggerAppComponent

class GoApp: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

}