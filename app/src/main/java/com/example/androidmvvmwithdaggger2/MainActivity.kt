package com.example.androidmvvmwithdaggger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidmvvmwithdaggger2.viewmodels.MainViewModel
import com.example.androidmvvmwithdaggger2.viewmodels.MainViewModelsFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var mainViewModelsFactory: MainViewModelsFactory
    private val products:TextView
        get() = findViewById(R.id.products)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as FakerApplication).applicationComponent.inject(this)
        mainViewModel = ViewModelProvider(this,mainViewModelsFactory).get(MainViewModel::class.java)
        mainViewModel.productsLiveData.observe(this, Observer {
            products.text= it.joinToString { x-> x.title + "\n\n" }
        })

    }
}