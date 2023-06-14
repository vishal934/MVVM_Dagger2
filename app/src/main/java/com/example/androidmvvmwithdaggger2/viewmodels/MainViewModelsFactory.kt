package com.example.androidmvvmwithdaggger2.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidmvvmwithdaggger2.repository.ProductRepository
import javax.inject.Inject

class MainViewModelsFactory @Inject constructor(private val map:Map<Class<*>, @JvmSuppressWildcards ViewModel>):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return map[modelClass] as T
    }
}