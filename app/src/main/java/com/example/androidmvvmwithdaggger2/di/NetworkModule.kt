package com.example.androidmvvmwithdaggger2.di

import com.example.androidmvvmwithdaggger2.retrofit.FakeAPI
import com.example.androidmvvmwithdaggger2.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class NetworkModule {
    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesFakeAPI(retrofit: Retrofit):FakeAPI{
       return retrofit.create(FakeAPI::class.java)
    }
}