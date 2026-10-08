package com.example.demo_for_practical.fragments

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.example.demo_for_practical.BaseFragment
import com.example.demo_for_practical.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment() {
    private var bindingVAR: FragmentHomeBinding? = null

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ViewBinding {
        return FragmentHomeBinding.inflate(
            inflater,
            container,
            false
        )    }

    override fun onViewCreated(
        view: android.view.View,
        savedInstanceState: android.os.Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        bindingVAR = binding as FragmentHomeBinding
        Log.d("TAG", "onViewCreated: 12312313321 ")
    }
}