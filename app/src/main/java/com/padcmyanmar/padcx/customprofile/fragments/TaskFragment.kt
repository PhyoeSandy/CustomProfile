package com.padcmyanmar.padcx.customprofile.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.padcx.customprofile.R
import com.padcmyanmar.padcx.customprofile.activities.ProfileAcitivity
import com.padcmyanmar.padcx.customprofile.adapters.TaskListAdapter
import com.padcmyanmar.padcx.customprofile.data.dummy_data.taskList
import com.padcmyanmar.padcx.customprofile.mvp.presenters.ProfilePresenter
import com.padcmyanmar.padcx.customprofile.mvp.presenters.impls.ProfilePresenterImpl
import com.padcmyanmar.padcx.customprofile.mvp.views.ProfileView
import kotlinx.android.synthetic.main.fragment_tasks.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class TaskFragment : Fragment(), ProfileView {
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var mTaskAdapter: TaskListAdapter

    private lateinit var mPresenter: ProfilePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tasks, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupPresenter()
        setupRecyclerView()
        mPresenter.onUiReady(this)
    }

    private fun setupPresenter() {
        mPresenter = ViewModelProviders.of(this)
            .get(ProfilePresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setupRecyclerView() {
        mTaskAdapter = TaskListAdapter(mPresenter)
        rvTask.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        rvTask.adapter = mTaskAdapter
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TaskFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun displayTaskList() {
        mTaskAdapter.setNewData(taskList)
    }

    override fun navigateToProfile() {
        startActivity(ProfileAcitivity.newIntent(requireContext()))
    }
}
