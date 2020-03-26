package com.aids61517.tryandroid.productlist

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
  private val okHttpClient by lazy {
    OkHttpClient.Builder()
        .build()
  }

  private val retrofit by lazy {
    Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl("https://course.aids61517.tw")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
  }

  suspend fun getProductList(): ApiResult<Product> {
    return retrofit.create(ProductService::class.java).run {
      getProductList()
    }
  }
}