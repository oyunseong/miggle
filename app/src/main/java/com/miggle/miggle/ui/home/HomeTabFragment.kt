package com.miggle.miggle.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.miggle.miggle.BottomSheetFragment
import com.miggle.miggle.R
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.BottomSheetDialogBinding
import com.miggle.miggle.databinding.FragmentHomeBinding

class HomeTabFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.homeAppbar.appbarSearchButton.visibility = View.INVISIBLE
        binding.homeAppbar.appbarSettingButton.visibility = View.INVISIBLE
    }

    override fun initClickListener() {
        binding.calculatorCard.setOnClickListener {
            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.show(parentFragmentManager,bottomSheetFragment.tag)
        }
        binding.homeAppbar.appbarBellButton.setOnClickListener {
            view?.findNavController()?.navigate(R.id.NotionFragment)
        }
        binding.reportCard.setOnClickListener {
            view?.findNavController()?.navigate(R.id.DailyReportFragment)
        }
        binding.guideCard.setOnClickListener {
            view?.findNavController()?.navigate(R.id.GuidanceFragment)
        }
        binding.homeAppbar.appbarMainLogo.setOnClickListener {
            view?.findNavController()?.navigate(R.id.LoginFragment)
        }
    }
}