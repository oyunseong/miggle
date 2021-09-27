package com.miggle.miggle.ui.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentSearchPasswordBinding

class SearchPasswordFragment : BaseFragment<FragmentSearchPasswordBinding>() {
    override fun initClickListener() {

    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchPasswordBinding {
        return FragmentSearchPasswordBinding.inflate(inflater,container,false)
    }
}