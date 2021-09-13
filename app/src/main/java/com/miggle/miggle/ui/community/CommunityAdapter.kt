package com.miggle.miggle.ui.community

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.miggle.miggle.databinding.ItemPostRecyclerBinding
import com.miggle.miggle.model.Post
import com.miggle.miggle.model.PostCase
import com.miggle.miggle.ui.community.holder.CommunityHolder
import com.miggle.miggle.ui.community.holder.NewsHolder
import com.miggle.miggle.ui.community.holder.PostHolder
import com.miggle.miggle.ui.community.holder.SearchHolder

class CommunityAdapter(postList: ArrayList<Post>?, postCase: PostCase) :
    RecyclerView.Adapter<CommunityHolder>() {
    private var postList: ArrayList<Post>? = null
    private val postCase: PostCase
    var itemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(v: View?, pos: Int)
    }

    fun setOnItemClickListener(itemClickListener: OnItemClickListener?) {
        this.itemClickListener = itemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommunityHolder {
        when (postCase) {
            PostCase.STOCK_INFO -> {
                return NewsHolder(
                    ItemPostRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false),
                    itemClickListener
                )
            }
            PostCase.FREE_BOARD -> {
                return PostHolder(
                    ItemPostRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false),
                    itemClickListener
                )
            }
            PostCase.POST_SEARCH -> {
                return SearchHolder(
                    ItemPostRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false),
                    itemClickListener
                )
            }
//            else -> return null
        }
    }

    override fun onBindViewHolder(holder: CommunityHolder, position: Int) {
        when (holder) {
            is NewsHolder -> {
                holder.onBind(postList!![position])
            }
            is PostHolder -> {
                holder.onBind(postList!![position])
            }
            is SearchHolder -> {
                holder.onBind(postList!![position])
            }
        }
    }

    override fun getItemCount(): Int {
        return postList!!.size
    }

    init {
        this.postList = postList
        this.postCase = postCase
    }
}