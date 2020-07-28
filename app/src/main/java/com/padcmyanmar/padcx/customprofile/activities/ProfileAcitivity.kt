package com.padcmyanmar.padcx.customprofile.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.padcmyanmar.padcx.customprofile.R
import com.padcmyanmar.padcx.customprofile.adapters.TabPagerAdapter
import com.padcmyanmar.padcx.customprofile.data.dummy_data.dummy_users_list
import kotlinx.android.synthetic.main.activity_profile.*


/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/25/2020.
 */
class ProfileAcitivity : BaseAcitivity(){

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ProfileAcitivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setupTabWithViewPager()
        bindData()
    }

    private fun setupTabWithViewPager() {
        val viewPagerAdapter = TabPagerAdapter(supportFragmentManager)
        viewPager.adapter = viewPagerAdapter
        viewPager.currentItem = 0

        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

        })
    }

    private fun bindData() {
        val data = dummy_users_list[0]
        name.text = data.name
        position.text = data.position
        tvCloseTask.text = data.close_task.toString()
        tvOpenTask.text = data.open_task.toString()
        ivProfile.setImageResource(data.profile_image)
    }
}


