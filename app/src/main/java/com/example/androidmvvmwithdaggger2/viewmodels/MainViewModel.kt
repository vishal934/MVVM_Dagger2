package com.example.androidmvvmwithdaggger2.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidmvvmwithdaggger2.models.Product
import com.example.androidmvvmwithdaggger2.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: ProductRepository, private  val  randomSize: RandomSize ) :ViewModel() {

 val productsLiveData:LiveData<List<Product>>
     get()=repository.product

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }
}
class RandomSize @Inject constructor(){
    fun doAction(){
        Log.d("TAG","Random ACtion")
    }
}