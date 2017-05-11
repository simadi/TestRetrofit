package com.feng.testretrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * 作者: feng on 2017/5/11.
 * 网址:http://www.cnblogs.com/simadi/  https://github.com/simadi
 */

interface gitapi {

    @GET("/users/{user}") // here is the other url part.best way is to start using /
    fun getFeed(@Path("user") user: String): Call<gitmodel>
}