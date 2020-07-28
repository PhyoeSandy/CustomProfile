package com.padcmyanmar.padcx.customprofile.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.padcmyanmar.padcx.customprofile.fragments.AboutFragment
import com.padcmyanmar.padcx.customprofile.fragments.ContactsFragment
import com.padcmyanmar.padcx.customprofile.fragments.TaskFragment

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/25/2020.
 */
class TabPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> TaskFragment.newInstance("a", "b")
            1 -> ContactsFragment.newInstance("a", "b")
            else -> AboutFragment.newInstance("a", "b")
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Project Tasks"
            1 -> "Contacts"
            else -> "About you"
        }
    }
}