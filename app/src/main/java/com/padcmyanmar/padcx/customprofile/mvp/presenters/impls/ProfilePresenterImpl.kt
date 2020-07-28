package com.padcmyanmar.padcx.customprofile.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customprofile.mvp.presenters.AbstractBasePresenter
import com.padcmyanmar.padcx.customprofile.mvp.presenters.ProfilePresenter
import com.padcmyanmar.padcx.customprofile.mvp.views.ProfileView

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/28/2020.
 */
class ProfilePresenterImpl: ProfilePresenter, AbstractBasePresenter<ProfileView>() {
    override fun onUiReady(lifecycleOwner: LifecycleOwner) {
        mView?.displayTaskList()
    }

    override fun onTapProfileItem() {
        mView?.navigateToProfile()
    }
}