package com.miggle.miggle.base

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<B : ViewBinding> : Fragment() {
    private var _binding: B? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(tag, "++onCreateView")
        _binding = getFragmentBinding(inflater, container)
        return binding.root
    }

    abstract fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "++onCreate")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(tag, "++onDestroyView")
        _binding = null
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(tag, "++onAttach")
    }


    fun showToast(str: String) {
        Toast.makeText(activity, str, Toast.LENGTH_SHORT).show();
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "++onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.d(tag, "++onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "++onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "++onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "++onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(tag, "++onDetach")
    }


}