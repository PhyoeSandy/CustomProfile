package com.padcmyanmar.padcx.customprofile.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.padcx.customprofile.R
import com.padcmyanmar.padcx.customprofile.adapters.ProfileListAdapter
import com.padcmyanmar.padcx.customprofile.data.dummy_data.dummy_users_list
import com.padcmyanmar.padcx.customprofile.mvp.presenters.CreateTaskPresenter
import com.padcmyanmar.padcx.customprofile.mvp.presenters.impls.CreateTaskPresenterImpl
import com.padcmyanmar.padcx.customprofile.mvp.views.CreateTaskView
import com.padcmyanmar.padcx.customprofile.utils.ItemDecoration
import kotlinx.android.synthetic.main.acitivity_task.*

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/25/2020.
 */
class TaskAcitivity : BaseAcitivity(), CreateTaskView {

    private lateinit var mAdapter: ProfileListAdapter

    private lateinit var mPresenter: CreateTaskPresenter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, TaskAcitivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.acitivity_task)
        super.onCreate(savedInstanceState)

        setupPresenter()
        setupRecycleView()

        mPresenter.onUiReady(this)
    }

    private fun setupPresenter() {
        mPresenter = ViewModelProviders.of(this)
            .get(CreateTaskPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setupRecycleView() {
        mAdapter = ProfileListAdapter(mPresenter)

        rvProfile.apply {
            addItemDecoration(ItemDecoration())
            layoutManager = LinearLayoutManager(TaskAcitivity(),LinearLayoutManager.HORIZONTAL,false)
            adapter = mAdapter
        }
    }

    override fun displayAssigneeList() {
        mAdapter.setNewData(dummy_users_list)
    }

    override fun navigateToProfile() {
        startActivity(ProfileAcitivity.newIntent(this))
    }
}