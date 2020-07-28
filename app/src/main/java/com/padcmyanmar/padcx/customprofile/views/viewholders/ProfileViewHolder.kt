package com.padcmyanmar.padcx.customprofile.views.viewholders

import android.util.Log
import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.customprofile.data.vos.UserVO
import com.padcmyanmar.padcx.customprofile.delegates.ProfileItemDelegate
import kotlinx.android.synthetic.main.activity_profile.view.*
import kotlinx.android.synthetic.main.activity_profile.view.ivProfile
import kotlinx.android.synthetic.main.item_profile.view.*

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */

class ProfileViewHolder(itemView: View, private val delegate: ProfileItemDelegate) : AbstractBaseViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            delegate.onTapProfileItem()
        }
    }

    override fun bindData(data: UserVO) {
        mData = data
        itemView.itemProfile.setImageResource(data.profile_image)
    }

}