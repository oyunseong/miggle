package com.miggle.miggle

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>(){
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
            // TODO 메인 프래그먼트 호출
//            findNavController().navigate(R.id.HomeTapFragment)

        },800)
    }
    private fun isOnBoardingFinished() : Boolean{
        val prefs = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return prefs.getBoolean("finished",false)
    }
}