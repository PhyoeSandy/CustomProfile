package com.padcmyanmar.padcx.customprofile.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customprofile.delegates.ProfileItemDelegate
import com.padcmyanmar.padcx.customprofile.delegates.TaskItemDelegate
import com.padcmyanmar.padcx.customprofile.mvp.views.MainView

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */

interface MainPresenter : BasePresenter<MainView>, ProfileItemDelegate, TaskItemDelegate{
    fun onUiReady(lifeCycleOwner: LifecycleOwner)
}