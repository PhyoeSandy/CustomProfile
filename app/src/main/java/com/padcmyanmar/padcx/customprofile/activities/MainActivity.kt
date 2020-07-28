package com.padcmyanmar.padcx.customprofile.activities

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.padcx.customprofile.R
import com.padcmyanmar.padcx.customprofile.adapters.ProfileListAdapter
import com.padcmyanmar.padcx.customprofile.adapters.TaskListAdapter
import com.padcmyanmar.padcx.customprofile.data.dummy_data.dummy_users_list
import com.padcmyanmar.padcx.customprofile.data.dummy_data.taskList
import com.padcmyanmar.padcx.customprofile.data.vos.TaskVO
import com.padcmyanmar.padcx.customprofile.data.vos.UserVO
import com.padcmyanmar.padcx.customprofile.mvp.presenters.MainPresenter
import com.padcmyanmar.padcx.customprofile.mvp.presenters.impls.MainPresenterImpl
import com.padcmyanmar.padcx.customprofile.mvp.views.MainView
import com.padcmyanmar.padcx.customprofile.utils.ItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseAcitivity(), MainView {

    private lateinit var mProfileAdapter: ProfileListAdapter
    private lateinit var mTaskAdapter: TaskListAdapter

    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupPresenter()
        setupRecycleView()
        setUpProgressBar()

        mPresenter.onUiReady(this)
    }

    private fun setUpProgressBar()
    {
        progressbar.setProgressColor(getResources().getColor(R.color.colorPrimary));
        progressbar.setProgressWidth(10)
        progressbar.setProgress(80)
    }

    private fun setupPresenter() {
        mPresenter = ViewModelProviders.of(this)
            .get(MainPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setupRecycleView() {
        // profile
        mProfileAdapter = ProfileListAdapter(mPresenter)

        rvProfile.apply {
            addItemDecoration(ItemDecoration())
            layoutManager = LinearLayoutManager(MainActivity(),LinearLayoutManager.HORIZONTAL,false)
            adapter = mProfileAdapter
        }

        // tasks
        mTaskAdapter = TaskListAdapter(mPresenter)
        rvTask.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvTask.adapter = mTaskAdapter
    }

    override fun displayTaskList() {
        mTaskAdapter.setNewData(taskList)
    }

    override fun displayProfileList() {
        mProfileAdapter.setNewData(dummy_users_list)
    }

    override fun navigateToCreateTask() {
        startActivity(TaskAcitivity.newIntent(this))
    }

    override fun navigateToProfile() {
        startActivity(ProfileAcitivity.newIntent(this))
    }
}
