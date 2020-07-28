package com.padcmyanmar.padcx.customprofile.mvp.presenters

import com.padcmyanmar.padcx.customprofile.mvp.views.BaseView

interface BasePresenter<T : BaseView> {
    fun initPresenter(view: T)
}