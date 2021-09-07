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

class MainActivity : BaseActivity<ActivityMainBinding>({ ActivityMainBinding.inflate(it) }) {
//    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initNavigation()
        /*val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        navController = navHostFragment.findNavController()
        binding.mainBottomNavigation.setupWithNavController(navController)*/
    }

    private fun initNavigation() {
        var navController = findNavController(R.id.nav_host)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        navController = navHostFragment.findNavController()
        binding.mainBottomNavigation.setupWithNavController(navController)
        binding.mainBottomNavigation.itemIconTintList = null

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.HomeTapFragment ||
                destination.id == R.id.ValuationTapFragment ||
                destination.id == R.id.CommunityTapFragment ||
                destination.id == R.id.ProfileTapFragment
            ) {
                binding.mainBottomNavigation.visibility = View.VISIBLE
            }else{
                binding.mainBottomNavigation.visibility = View.GONE
            }
        }
    }
}