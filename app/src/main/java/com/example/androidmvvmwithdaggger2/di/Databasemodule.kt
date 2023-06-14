package com.example.androidmvvmwithdaggger2.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.androidmvvmwithdaggger2.db.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class Databasemodule {

    @Singleton
    @Provides
 fun provideFakerDB(context:Context):FakerDB{
     return Room.databaseBuilder(context ,FakerDB::class.java,"FakerDB").build()
 }
}