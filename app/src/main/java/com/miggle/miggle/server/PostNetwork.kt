package com.miggle.miggle.server

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * https://dev.to/theimpulson/making-get-requests-with-retrofit2-on-android-using-kotlin-4e4c
 */
object PostNetwork {

    val retrofit by lazy {
        Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PostAPI::class.java)
    }

}