package com.wakwak3125.viewpager2example

import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2Adapter(fragmentManager: FragmentManager, private val count: Int) : FragmentStateAdapter(fragmentManager) {

    override fun getItem(position: Int) = ViewPagerChildFragment.newInstance(position)

    override fun getItemCount() = count
}
