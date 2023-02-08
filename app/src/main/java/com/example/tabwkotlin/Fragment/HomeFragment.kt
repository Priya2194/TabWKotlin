package com.example.tabwkotlin.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.tabwkotlin.Adapter
import com.example.tabwkotlin.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment()
{



    var title= arrayOf("Prime","Fashion","Kids","Mobile","AboutUs")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val view:View=inflater.inflate(R.layout.fragment_home, container, false)

        var pager=view.findViewById<ViewPager2>(R.id.viewpager)
        var tab=view.findViewById<TabLayout>(R.id.tablayout)

        pager.adapter= Adapter(childFragmentManager,lifecycle)


        TabLayoutMediator(tab,pager)
        {


                tab1,position ->
            tab1.text=title[position]
        }.attach()
        return view
    }



}