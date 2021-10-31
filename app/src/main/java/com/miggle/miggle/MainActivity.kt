package com.miggle.miggle

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.miggle.miggle.base.BaseActivity
import com.miggle.miggle.databinding.ActivityMainBinding
import com.miggle.miggle.model.DartResponse
import com.miggle.miggle.server.PostAPI
import com.miggle.miggle.server.RetrofitClient
import retrofit2.Call
import retrofit2.Response

class MainActivity : BaseActivity<ActivityMainBinding>({ ActivityMainBinding.inflate(it) }) {
    val postApiClient: PostAPI by lazy {
        RetrofitClient.getPostService()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initNavigation()
        /*val navHostFragment =
            sudpportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        navController = navHostFragment.findNavController()
        binding.mainBottomNavigation.setupWithNavController(navController)*///

        postApiClient.getDart(
            crtfc_key = "b2ee4ac66008d7ebb5e87165604bae92cf554783",
            corp_code = "00164779",
            bsns_year = 2020,
            reprt_code = 11011,
        )!!.enqueue(object : retrofit2.Callback<DartResponse?> {
            override fun onResponse(call: Call<DartResponse?>, response: Response<DartResponse?>) {
                val response: DartResponse? = response.body()
                Log.d("dartResponse", response.toString())
            }

            override fun onFailure(call: Call<DartResponse?>, t: Throwable) {
                Log.d("dartResponse", t.message.toString())
            }

        })
    }


    private fun initNavigation() {
        var navController = findNavController(R.id.main_nav_host)
        binding.mainBottomNavigation.setupWithNavController(navController)
        binding.mainBottomNavigation.itemIconTintList = null

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.HomeTapFragment ||
                destination.id == R.id.ValuationTapFragment ||
                destination.id == R.id.CommunityTapFragment ||
                destination.id == R.id.ProfileTapFragment
            ) {
                binding.mainBottomNavigation.visibility = View.VISIBLE
            } else {
                binding.mainBottomNavigation.visibility = View.GONE
            }
        }
    }
}