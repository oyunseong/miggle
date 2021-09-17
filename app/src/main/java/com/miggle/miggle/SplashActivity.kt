package com.miggle.miggle

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.miggle.miggle.base.BaseActivity
import com.miggle.miggle.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>({ ActivitySplashBinding.inflate(it)}) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler().postDelayed({
//            startActivity(Intent(this,MainActivity::class.java))
            startActivity(Intent(this,TestActivity::class.java))
            finish()
        },800)

    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        Handler(Looper.getMainLooper()).postDelayed({
//            // TODO 메인 프래그먼트 호출
////            findNavController().navigate(R.id.HomeTapFragment)
//
//        },800)
    }
//    private fun isOnBoardingFinished() : Boolean{
//        val prefs = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
//        return prefs.getBoolean("finished",false)
//    }
