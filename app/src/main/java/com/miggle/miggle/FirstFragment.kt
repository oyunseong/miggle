package com.miggle.miggle

import android.view.LayoutInflater
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentImg1Binding

class FirstFragment : BaseFragment<FragmentImg1Binding>() {
    override fun initClickListener() {

    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentImg1Binding {
        return FragmentImg1Binding.inflate(inflater, container,false)
    }
}