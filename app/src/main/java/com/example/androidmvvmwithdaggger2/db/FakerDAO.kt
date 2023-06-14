package com.example.androidmvvmwithdaggger2.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.androidmvvmwithdaggger2.models.Product

@Dao
interface FakerDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     suspend  fun addProducts(product: List<Product>)

     @Query("SELECT * FROM Product")
     suspend fun getProduct():List<Product>
}