package com.example.tabwkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.FrameLayout
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.tabwkotlin.Fragment.Dashboard
import com.example.tabwkotlin.Fragment.HomeFragment
import com.example.tabwkotlin.Fragment.Notifications
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var bottomNav=findViewById<BottomNavigationView>(R.id.bottomnav)


        replaceFragment(HomeFragment())





       // pager.isInvisible

       bottomNav.setOnItemSelectedListener {



            when(it.itemId)
            {
                R.id.homme->replaceFragment(HomeFragment())
                R.id.dashboard->replaceFragment(Dashboard())
                R.id.notification->replaceFragment(Notifications())

                else ->
                {

                }


            }
            true


        }


    }
   private fun replaceFragment(fragment:Fragment)
    {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }
}