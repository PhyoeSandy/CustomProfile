package com.padcmyanmar.padcx.customprofile.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customprofile.mvp.presenters.AbstractBasePresenter
import com.padcmyanmar.padcx.customprofile.mvp.presenters.CreateTaskPresenter
import com.padcmyanmar.padcx.customprofile.mvp.views.CreateTaskView

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/28/2020.
 */
class CreateTaskPresenterImpl : CreateTaskPresenter, AbstractBasePresenter<CreateTaskView>() {
    override fun onUiReady(lifeCycleOwner: LifecycleOwner) {
        mView?.displayAssigneeList()
    }

    override fun onTapProfileItem() {
        mView?.navigateToProfile()
    }

    override fun onTapPlusItem() {

    }

}