package com.miggle.miggle.ui.community

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miggle.miggle.R
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentCommunityBinding
import com.miggle.miggle.model.Post
import com.miggle.miggle.model.PostCase
import com.miggle.miggle.ui.CommunityViewModel
import kotlinx.coroutines.delay

class CommunityTapFragment : BaseFragment<FragmentCommunityBinding>() {
    private lateinit var communityAdapter: CommunityAdapter
    var dataList = mutableListOf<Post>()

    val viewModel by lazy {
        ViewModelProvider(this).get(CommunityViewModel::class.java)
    }

    val TAG = "TAG1"
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCommunityBinding {

        return FragmentCommunityBinding.inflate(inflater, container, false)
    }

    override fun initClickListener() {
        binding.communityAppbar.appbarSearchButton.setOnClickListener {
            view?.findNavController()?.navigate(R.id.SearchFragment)
        }
        binding.stockInfoButton.setOnClickListener{
            communityAdapter.notifyDataSetChanged()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataList = mutableListOf()
        communityAdapter = CommunityAdapter(dataList, PostCase.STOCK_INFO)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(layoutInflater.context)
        binding.communityRecycler.layoutManager = layoutManager
        binding.communityRecycler.adapter = communityAdapter
        binding.communityRecycler.setHasFixedSize(true)

        viewModel.getPost() //
        viewModel.singlePost.observe(viewLifecycleOwner, {
            Log.d("single post", it.title)
        })

        viewModel.getPosts() //
        viewModel.postList.observe(viewLifecycleOwner, Observer {
            for (post in it) {
                Log.d(TAG, post.title)
                Log.d(TAG, post.id.toString())
                Log.d(TAG, post.userId.toString())
            }
        })

        communityAdapter.notifyDataSetChanged()
    }
}