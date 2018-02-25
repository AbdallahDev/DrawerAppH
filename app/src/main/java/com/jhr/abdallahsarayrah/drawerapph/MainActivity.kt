package com.jhr.abdallahsarayrah.drawerapph

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DrawerFragment.NavigationViewInterface {
    @SuppressLint("CommitTransaction")
    override fun onClick(x: Int) {
        if (x == 1) {
            val tr = fragmentManager.beginTransaction()
            val obj = HomeFragment()
            tr.replace(R.id.fragmentContainer, obj)
            tr.commit()
        } else if (x == 2) {
            val tr = fragmentManager.beginTransaction()
            val obj = SearchFragment()
            tr.replace(R.id.fragmentContainer, obj)
            tr.commit()
        }
        drawerLayout.closeDrawer(GravityCompat.START)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open,
                R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }
}
