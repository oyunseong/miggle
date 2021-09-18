package com.miggle.miggle.ui.profile

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
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

    override fun initClickListener() {
        binding.myPageNotionConstraint.setOnClickListener {
            Log.d(tag1, "++notion button click")
            val dialog = MessageDialog(
                context = activity ?: return@setOnClickListener,
                title = R.string.send_to_complete
            )
            dialog.show()
        }
    }
}