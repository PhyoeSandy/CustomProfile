package com.padcmyanmar.padcx.customprofile.views.viewholders

import android.view.View
import com.padcmyanmar.padcx.customprofile.data.vos.TaskVO
import com.padcmyanmar.padcx.customprofile.delegates.TaskItemDelegate
import kotlinx.android.synthetic.main.item_profile.view.*

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/28/2020.
 */
class TaskViewHolder(itemView: View, delegate: TaskItemDelegate) : BaseViewHolder<TaskVO>(itemView) {

    init {
        itemView.setOnClickListener {
            delegate?.onTapProfileItem()
        }
    }

    override fun bindData(data: TaskVO) {
        mData = data
        itemView.itemProfile.setImageResource(data.image)
    }
}