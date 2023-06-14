package com.example.androidmvvmwithdaggger2.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidmvvmwithdaggger2.db.FakerDB
import com.example.androidmvvmwithdaggger2.models.Product
import com.example.androidmvvmwithdaggger2.retrofit.FakeAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakeAPI: FakeAPI,private val fakerDB: FakerDB){

    private val _products = MutableLiveData<List<Product>>()
    val product:LiveData<List<Product>>
        get() = _products


    suspend fun getProducts(){
        val result = fakeAPI.getProducts()
        if(result.isSuccessful && result.body()!=null){
            fakerDB.getFakerDao().addProducts(result.body()!!)
            _products.postValue(result.body())
        }
    }

}