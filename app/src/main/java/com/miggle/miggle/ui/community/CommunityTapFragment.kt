package com.miggle.miggle.ui.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.miggle.miggle.R
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentCommunityBinding

class CommunityTapFragment : BaseFragment<FragmentCommunityBinding>() {
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
    }
}