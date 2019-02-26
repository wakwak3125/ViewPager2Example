package com.wakwak3125.viewpager2example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.wakwak3125.viewpager2example.databinding.FragmentViewPagerChildBinding

private const val KEY_NUMBER = "key_number"

class ViewPagerChildFragment : Fragment() {

    companion object {
        fun newInstance(i: Int) = ViewPagerChildFragment().apply {
            arguments = bundleOf(KEY_NUMBER to i)
        }
    }

    private lateinit var binding: FragmentViewPagerChildBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentViewPagerChildBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.setText("${arguments?.getInt(KEY_NUMBER, 0)}")
    }
}
