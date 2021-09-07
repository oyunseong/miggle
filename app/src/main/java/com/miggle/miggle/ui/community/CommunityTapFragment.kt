package com.miggle.miggle.ui.community

import android.view.LayoutInflater
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentCommunityBinding

class CommunityTapFragment : BaseFragment<FragmentCommunityBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCommunityBinding {
        return FragmentCommunityBinding.inflate(inflater,container,false)
    }
}