package com.miggle.miggle.ui.valuation

import android.view.LayoutInflater
import android.view.ViewGroup
import com.miggle.miggle.base.BaseFragment
import com.miggle.miggle.databinding.FragmentValuationBinding

class ValuationTabFragment : BaseFragment<FragmentValuationBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentValuationBinding {
        return FragmentValuationBinding.inflate(inflater,container,false)
    }
}