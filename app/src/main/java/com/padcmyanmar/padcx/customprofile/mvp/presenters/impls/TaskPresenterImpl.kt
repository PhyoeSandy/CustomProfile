package com.padcmyanmar.padcx.customprofile.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customprofile.mvp.presenters.AbstractBasePresenter
import com.padcmyanmar.padcx.customprofile.mvp.presenters.TaskPresenter
import com.padcmyanmar.padcx.customprofile.mvp.views.TasksView

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */
class TaskPresenterImpl : TaskPresenter, AbstractBasePresenter<TasksView>() {
    override fun onUiReady(lifeCycleOwner: LifecycleOwner) {
        mView?.displayTasksList()
    }

    override fun onTapProfileItem() {
        mView?.navigateToProfile()
    }

}