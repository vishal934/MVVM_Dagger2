package com.example.androidmvvmwithdaggger2.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.androidmvvmwithdaggger2.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class,Databasemodule::class,ViewModelModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    fun getMap():Map<Class<*>,ViewModel>

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context):ApplicationComponent
    }
}
