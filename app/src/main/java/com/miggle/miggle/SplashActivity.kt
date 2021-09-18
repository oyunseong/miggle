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
            startActivity(Intent(this,MainActivity::class.java))
            // 테스트를 위한 Activity
//            startActivity(Intent(this, TestActivity::class.java))
            finish()
        }, 800)

    }
}
