package com.example.androidmvvmwithdaggger2

import android.app.Application
import com.example.androidmvvmwithdaggger2.di.ApplicationComponent
import com.example.androidmvvmwithdaggger2.di.DaggerApplicationComponent

class FakerApplication:Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}