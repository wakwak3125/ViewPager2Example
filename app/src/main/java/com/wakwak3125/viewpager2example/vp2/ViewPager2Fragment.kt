package com.wakwak3125.viewpager2example.vp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wakwak3125.viewpager2example.databinding.FragmentViewPager2Binding

class ViewPager2Fragment : Fragment() {

    private lateinit var binding: FragmentViewPager2Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentViewPager2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.pager.adapter = ViewPager2Adapter(childFragmentManager, 5)
    }
}
