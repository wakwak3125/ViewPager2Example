package com.wakwak3125.viewpager2example.vp1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wakwak3125.viewpager2example.databinding.FragmentViewPager1Binding

class ViewPager1Fragment : Fragment() {

    private lateinit var binding: FragmentViewPager1Binding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentViewPager1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.pager.adapter = ViewPager1Adapter(childFragmentManager, 5)
    }
}
