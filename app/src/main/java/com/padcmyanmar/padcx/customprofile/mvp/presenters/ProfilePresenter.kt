package com.padcmyanmar.padcx.customprofile.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customprofile.delegates.TaskItemDelegate
import com.padcmyanmar.padcx.customprofile.mvp.views.ProfileView

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/28/2020.
 */
interface ProfilePresenter : BasePresenter<ProfileView>, TaskItemDelegate {
    fun onUiReady(lifecycleOwner: LifecycleOwner)
}