package com.miggle.miggle.ui.community

import android.view.LayoutInflater
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentDetailBoardBinding

class PostDetailFragment : BaseFragment<FragmentDetailBoardBinding>(){
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailBoardBinding {
        return FragmentDetailBoardBinding.inflate(inflater,container,false)
    }

    override fun initClickListener() {

    }
}