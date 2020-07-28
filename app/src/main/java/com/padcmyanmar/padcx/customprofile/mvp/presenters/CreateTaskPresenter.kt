package com.padcmyanmar.padcx.customprofile.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customprofile.delegates.ProfileItemDelegate
import com.padcmyanmar.padcx.customprofile.mvp.views.CreateTaskView

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/28/2020.
 */
interface CreateTaskPresenter : BasePresenter<CreateTaskView>, ProfileItemDelegate {
    fun onUiReady(lifeCycleOwner: LifecycleOwner)
}