package com.wakwak3125.viewpager2example.vp1

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.wakwak3125.viewpager2example.common.ViewPagerChildFragment

class ViewPager1Adapter(
        fm: FragmentManager,
        private val count: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int) = ViewPagerChildFragment.newInstance(position)

    override fun getCount(): Int = count
}
