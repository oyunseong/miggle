package com.miggle.miggle.ui.community

import android.view.LayoutInflater
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentPostBinding

class PostFragment : BaseFragment<FragmentPostBinding>(){
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPostBinding {
        return FragmentPostBinding.inflate(inflater,container,false)
    }

    override fun initClickListener() {

    }


}