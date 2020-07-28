package com.padcmyanmar.padcx.customprofile.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.customprofile.R
import com.padcmyanmar.padcx.customprofile.data.vos.UserVO
import com.padcmyanmar.padcx.customprofile.delegates.ProfileItemDelegate
import com.padcmyanmar.padcx.customprofile.views.viewholders.AbstractBaseViewHolder
import com.padcmyanmar.padcx.customprofile.views.viewholders.ProfileViewHolder
import com.padcmyanmar.padcx.customprofile.views.viewholders.TaskCreateViewHolder

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */
class ProfileListAdapter(delegate: ProfileItemDelegate) : BaseRecyclerAdapter<AbstractBaseViewHolder, UserVO>() {
    val mDelegate: ProfileItemDelegate = delegate

    val VIEW_TYPE_ADD = 0
    val VIEW_TYPE_PROFILE = 1

    override fun getItemViewType(position: Int): Int {
        when (position) {
            mData.size - 1 -> return VIEW_TYPE_ADD
            else -> return VIEW_TYPE_PROFILE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbstractBaseViewHolder {
        Log.d("Profile ViewHolder","Reached.")
        when (viewType) {
            VIEW_TYPE_PROFILE -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_profile, parent, false)
                return ProfileViewHolder(view, mDelegate)
            }

            VIEW_TYPE_ADD -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_plus, parent, false)
                return TaskCreateViewHolder(view, mDelegate)
            }

            else -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_profile, parent, false)
                return ProfileViewHolder(view, mDelegate)
            }

        }
    }

}