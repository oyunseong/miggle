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
            startActivity(Intent(this,GuideActivity::class.java))
            finish()
        }, 800)

    }
}
