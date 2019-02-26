package com.wakwak3125.viewpager2example

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fm: FragmentManager, private val count: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int) = ViewPagerChildFragment.newInstance(position)

    override fun getCount(): Int = count
}
