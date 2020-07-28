package com.padcmyanmar.padcx.customprofile.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.customprofile.R
import com.padcmyanmar.padcx.customprofile.data.vos.TaskVO
import com.padcmyanmar.padcx.customprofile.delegates.TaskItemDelegate
import com.padcmyanmar.padcx.customprofile.views.viewholders.TaskCardViewHolder

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/25/2020.
 */
class TaskListAdapter(delegate: TaskItemDelegate): BaseRecyclerAdapter<TaskCardViewHolder, TaskVO>(){
    private val mDelegate = delegate

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskCardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_card, parent, false)
        return TaskCardViewHolder(view, mDelegate)
    }
}