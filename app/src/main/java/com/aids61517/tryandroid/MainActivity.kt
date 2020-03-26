package com.aids61517.tryandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aids61517.tryandroid.productlist.Product

class MainActivity : AppCompatActivity() {
  private val viewModel by viewModels<MainViewModel>()
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    observeLiveData()
    viewModel.fetchData()
  }

  private fun observeLiveData() {
    viewModel.productList.observe(this, Observer { list: List<Product> ->
      Log.d("MainActivity", "ProductList = $list")
    })
  }
}
