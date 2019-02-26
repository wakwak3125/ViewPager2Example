package com.wakwak3125.viewpager2example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.wakwak3125.viewpager2example.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.setButton1ClickListener { it.findNavController().navigate(R.id.main_to_view_pager_1) }
        binding.setButton2ClickListener { it.findNavController().navigate(R.id.main_to_view_pager_2) }
        return binding.root
    }
}
