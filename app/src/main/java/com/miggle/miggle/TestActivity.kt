package com.miggle.miggle

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.miggle.miggle.base.BaseActivity
import com.miggle.miggle.databinding.ActivityMainBinding
import com.miggle.miggle.databinding.ActivityTestBinding
import com.miggle.miggle.server.CallRetrofit

class TestActivity : BaseActivity<ActivityTestBinding>({ ActivityTestBinding.inflate(it) }) {
    private var callRetrofit = CallRetrofit()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.testButton.setOnClickListener {
            showToast("버튼 클릭")
            binding.testId.text
//            callRetrofit.callPhoneAlreadyCheck("01066952442")

        }

    }

}