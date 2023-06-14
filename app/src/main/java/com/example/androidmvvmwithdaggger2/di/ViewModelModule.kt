package com.example.androidmvvmwithdaggger2.di

import androidx.lifecycle.ViewModel
import com.example.androidmvvmwithdaggger2.viewmodels.MainViewModel
import com.example.androidmvvmwithdaggger2.viewmodels.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
 abstract  class ViewModelModule {

      @Binds
      @ClassKey(MainViewModel::class)
      @IntoMap
     abstract fun mainViewModel(mainViewModel: MainViewModel):ViewModel

     @Binds
     @IntoMap
     @ClassKey(MainViewModel2::class)
     abstract fun mainViewModel2(mainViewModel2: MainViewModel2):ViewModel

 }