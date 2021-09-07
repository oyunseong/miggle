package com.miggle.miggle.ui.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentProfileTabBinding

class ProfileTapFragment : BaseFragment<FragmentProfileTabBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProfileTabBinding {
        return FragmentProfileTabBinding.inflate(inflater,container,false)
    }
}