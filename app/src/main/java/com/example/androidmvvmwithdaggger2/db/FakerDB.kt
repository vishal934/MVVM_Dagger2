package com.example.androidmvvmwithdaggger2.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidmvvmwithdaggger2.models.Product

@Database(entities = [Product::class], version = 1)
abstract  class FakerDB :RoomDatabase(){
    abstract fun getFakerDao():FakerDAO
}