package com.padcmyanmar.padcx.customprofile.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customprofile.mvp.presenters.AbstractBasePresenter
import com.padcmyanmar.padcx.customprofile.mvp.presenters.MainPresenter
import com.padcmyanmar.padcx.customprofile.mvp.views.MainView

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */
class MainPresenterImpl : MainPresenter, AbstractBasePresenter<MainView>() {
    override fun onUiReady(lifeCycleOwner: LifecycleOwner) {
        mView?.displayTaskList()
        mView?.displayProfileList()
    }

    override fun onTapProfileItem() {
        mView?.navigateToProfile()
    }

    override fun onTapPlusItem() {
        mView?.navigateToCreateTask()
    }
}