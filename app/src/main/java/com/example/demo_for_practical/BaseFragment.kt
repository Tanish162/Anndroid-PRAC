package com.example.demo_for_practical

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment : Fragment() {

    private var _binding: ViewBinding? = null
    protected val binding: ViewBinding
        get() = _binding
            ?: throw IllegalStateException("Binding is null")

    abstract fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ViewBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: android.os.Bundle?
    ): View {

        _binding = getViewBinding(inflater, container)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}