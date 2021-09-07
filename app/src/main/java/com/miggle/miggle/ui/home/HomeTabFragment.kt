package com.miggle.miggle.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentHomeBinding

class HomeTabFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater,container,false)
    }
}