package com.example.androidmvvmwithdaggger2.viewmodels

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel2 @Inject constructor(private val randomSize: RandomSize)   :ViewModel() {
    init {
        randomSize.doAction()
    }
}