package com.aids61517.tryandroid

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aids61517.tryandroid.productlist.ApiClient
import com.aids61517.tryandroid.productlist.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {
  val productList by lazy {
    MutableLiveData<List<Product>>()
  }
  fun fetchData() {
    viewModelScope.launch {
      val productList = withContext(Dispatchers.IO){
        ApiClient.getProductList().result
      }
      this@MainViewModel.productList.value = productList
    }
  }
}