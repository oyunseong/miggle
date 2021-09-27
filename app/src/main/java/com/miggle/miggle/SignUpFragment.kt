package com.miggle.miggle

import android.view.LayoutInflater
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentSignUpBinding

class SignUpFragment :BaseFragment<FragmentSignUpBinding>(){
    override fun initClickListener() {
        binding.signUpButton.setOnClickListener {
            val dialog = MessageDialog(
                context = activity ?: return@setOnClickListener,
                title = R.string.comming_soon
            )
            dialog.show()
        }
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSignUpBinding {
        return FragmentSignUpBinding.inflate(inflater,container,false)
    }
}