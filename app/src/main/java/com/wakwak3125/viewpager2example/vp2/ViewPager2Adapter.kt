package com.wakwak3125.viewpager2example.vp2

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.wakwak3125.viewpager2example.common.ViewPagerChildFragment

class ViewPager2Adapter(
        fragmentManager: FragmentManager,
        var count: Int
) : FragmentStateAdapter(fragmentManager) {

    override fun getItem(position: Int) = ViewPagerChildFragment.newInstance(position)

    override fun getItemCount() = count
}
