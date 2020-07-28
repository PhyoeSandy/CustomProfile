package com.padcmyanmar.padcx.customprofile.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.customprofile.R
import com.padcmyanmar.padcx.customprofile.data.vos.TaskVO
import com.padcmyanmar.padcx.customprofile.delegates.TaskItemDelegate
import com.padcmyanmar.padcx.customprofile.views.viewholders.TaskViewHolder

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/28/2020.
 */
class TaskAdapter(delegate: TaskItemDelegate) : BaseRecyclerAdapter<TaskViewHolder, TaskVO>() {
    private val mDelegate = delegate

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.acitivity_task, parent, false)
        return TaskViewHolder(view, mDelegate)
    }
}