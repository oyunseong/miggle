package com.miggle.miggle.server

import com.miggle.miggle.model.Post
import retrofit2.http.GET

interface PostAPI {

    @GET("posts/1")
    suspend fun getPost(): Post

    @GET("posts")
    suspend fun getPosts(): List<Post>

}