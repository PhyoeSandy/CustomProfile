package com.padcmyanmar.padcx.customprofile.views.viewholders

import android.view.View
import com.padcmyanmar.padcx.customprofile.data.vos.UserVO
import com.padcmyanmar.padcx.customprofile.delegates.ProfileItemDelegate
import kotlinx.android.synthetic.main.item_profile.view.*

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */
class TaskCreateViewHolder(itemView: View, private val delegate: ProfileItemDelegate) : AbstractBaseViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            delegate.onTapPlusItem()
        }
    }

    override fun bindData(data: UserVO) {
        mData = data
    }


}