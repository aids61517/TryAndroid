package com.aids61517.tryandroid.productlist

import com.google.gson.annotations.SerializedName

data class Product(
  @SerializedName("name") val name: String,
  @SerializedName("price") val price: Int,
  @SerializedName("image_url") val imageUrl: String
)