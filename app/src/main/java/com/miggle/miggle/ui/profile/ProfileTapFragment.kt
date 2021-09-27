package com.miggle.miggle.ui.profile

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.miggle.miggle.MessageDialog
import com.miggle.miggle.R
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentProfileTabBinding

class ProfileTapFragment : BaseFragment<FragmentProfileTabBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProfileTabBinding {
        return FragmentProfileTabBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.myPageAppbar.appbarSearchButton.visibility = View.INVISIBLE
        binding.myPageAppbar.appbarBellButton.visibility = View.INVISIBLE
    }

    override fun initClickListener() {
        binding.myPageAppbar.appbarSettingButton.setOnClickListener {
            view?.findNavController()?.navigate(R.id.PreferencesFragment)
        }
        binding.profileTapMyInfoCard.setOnClickListener {
            view?.findNavController()?.navigate(R.id.ProfileEditFragment)
        }
        binding.profileTapLikeStockCard.setOnClickListener {
            val dialog = MessageDialog(
                context = activity ?: return@setOnClickListener,
                title = R.string.comming_soon
            )
            dialog.show()
        }
        binding.myPageNotionConstraint.setOnClickListener {
            Log.d(tag1, "++notion button click")
            val dialog = MessageDialog(
                context = activity ?: return@setOnClickListener,
                title = R.string.comming_soon
            )
            dialog.show()
        }
        binding.profileTapNotionSettingCard.setOnClickListener {
            val dialog = MessageDialog(
                context = activity ?: return@setOnClickListener,
                title = R.string.comming_soon
            )
            dialog.show()
        }
    }
}