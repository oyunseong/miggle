package com.miggle.miggle

import android.os.Bundle
import com.miggle.miggle.base.BaseActivity
import com.miggle.miggle.databinding.ActivityTestBinding

class TestActivity : BaseActivity<ActivityTestBinding>({ ActivityTestBinding.inflate(it) }) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.testButton.setOnClickListener {
            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager,bottomSheetFragment.tag)
        }

    }

}