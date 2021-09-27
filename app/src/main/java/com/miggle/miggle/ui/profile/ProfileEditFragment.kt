package com.miggle.miggle.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentProfileEditBinding

class ProfileEditFragment :BaseFragment<FragmentProfileEditBinding>(){
    override fun initClickListener() {
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.profileEditAppbar.appbarSearchButton.visibility = View.INVISIBLE
        binding.profileEditAppbar.appbarSettingButton.visibility = View.INVISIBLE
        binding.profileEditAppbar.appbarBellButton.visibility = View.INVISIBLE
    }
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProfileEditBinding {
        return FragmentProfileEditBinding.inflate(inflater,container,false)
    }
}