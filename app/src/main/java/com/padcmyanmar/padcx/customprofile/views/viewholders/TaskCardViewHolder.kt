package com.padcmyanmar.padcx.customprofile.views.viewholders

import android.view.View
import com.padcmyanmar.padcx.customprofile.R
import com.padcmyanmar.padcx.customprofile.data.vos.TaskVO
import com.padcmyanmar.padcx.customprofile.delegates.TaskItemDelegate
import kotlinx.android.synthetic.main.item_task_card.view.*

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */
class TaskCardViewHolder(itemView: View, private val delegate: TaskItemDelegate) : BaseViewHolder<TaskVO>(itemView) {

    init {
        itemView.btnProfile.setOnClickListener {
            delegate.onTapProfileItem()
        }
    }

    override fun bindData(data: TaskVO) {
        mData = data

        itemView.tvTitle.text = data.status
        itemView.tvType.text = data.type
        itemView.tvPageName.text = data.task
        itemView.tvComment.text = data.comment
        itemView.tvAttach.text = data.attach_file

    }
}

