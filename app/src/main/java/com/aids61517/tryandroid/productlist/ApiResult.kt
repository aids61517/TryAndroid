package com.aids61517.tryandroid.productlist

import com.google.gson.annotations.SerializedName

class ApiResult<T> (
  @SerializedName("result") val result: List<T>
)