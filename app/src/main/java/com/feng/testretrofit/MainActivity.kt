package com.feng.testretrofit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.ScrollingMovementMethod
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    internal var API = "https://api.github.com"    // BASE URL
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pbar.visibility = View.INVISIBLE
        button.setOnClickListener {
            val user = edit.text.toString()
            pbar.visibility = View.VISIBLE

            val retrofit = Retrofit.Builder()
                 .baseUrl(API)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            val service = retrofit.create(gitapi::class.java)
            service.getFeed(user).enqueue(object : Callback<gitmodel> {

                override fun onResponse(call: Call<gitmodel>, response: Response<gitmodel>) {
                   var u = response.body()//这里的response就可以提取数据了
                    tv.text=Util.GetObjectValues(u)
                    tv.movementMethod = ScrollingMovementMethod.getInstance()//可以滚动
                    pbar.visibility = View.INVISIBLE
                }
                override fun onFailure(call: Call<gitmodel>, t: Throwable) {
                    tv.text=t.message
                    pbar.visibility = View.INVISIBLE
                }
            })
        }
    }
}