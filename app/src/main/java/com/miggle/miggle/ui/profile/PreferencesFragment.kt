package com.miggle.miggle.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentPreferencesBinding

class PreferencesFragment : BaseFragment<FragmentPreferencesBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPreferencesBinding {
        return FragmentPreferencesBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.preferencesAppbar.appbarSearchButton.visibility = View.INVISIBLE
        binding.preferencesAppbar.appbarBellButton.visibility = View.INVISIBLE
        binding.preferencesAppbar.appbarSettingButton.visibility = View.INVISIBLE
    }

    override fun initClickListener() {

    }
}