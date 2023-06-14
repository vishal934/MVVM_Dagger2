package com.example.androidmvvmwithdaggger2.retrofit

import com.example.androidmvvmwithdaggger2.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakeAPI {
    @GET("products")
  suspend  fun getProducts():Response<List<Product>>
}