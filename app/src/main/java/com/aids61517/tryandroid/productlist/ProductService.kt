package com.aids61517.tryandroid.productlist

import retrofit2.http.GET

interface ProductService {
  @GET("/product.php")
  suspend fun getProductList(): ApiResult<Product>
}