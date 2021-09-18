package com.miggle.miggle.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.miggle.miggle.model.Post
import com.miggle.miggle.server.PostNetwork
import kotlinx.coroutines.launch

class CommunityViewModel : ViewModel() {

    val singlePost: MutableLiveData<Post> = MutableLiveData()
    val postList: MutableLiveData<List<Post>> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            singlePost.value = PostNetwork.retrofit.getPost()
        }
    }

    fun getPosts() {
        viewModelScope.launch {
            postList.value = PostNetwork.retrofit.getPosts()
        }
    }
}