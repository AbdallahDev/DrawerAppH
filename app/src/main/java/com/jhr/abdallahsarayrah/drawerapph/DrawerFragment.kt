package com.jhr.abdallahsarayrah.drawerapph

import android.app.Activity
import android.app.Fragment
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_drawer.view.*

/**
 * A simple [Fragment] subclass.
 */
class DrawerFragment : Fragment(), NavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.home) navigationViewInterfaceVal?.onClick(1)
        else if (item.itemId == R.id.search) navigationViewInterfaceVal?.onClick(2)

        return false
    }

    private var navigationViewInterfaceVal: NavigationViewInterface? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_drawer, container, false)

        view.navigationView.setNavigationItemSelectedListener(this)

        return view
    }

    interface NavigationViewInterface {
        fun onClick(x: Int)
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)

        navigationViewInterfaceVal = activity as NavigationViewInterface
    }

}// Required empty public constructor
