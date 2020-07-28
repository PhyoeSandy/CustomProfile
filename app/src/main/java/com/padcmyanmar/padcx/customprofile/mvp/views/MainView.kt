package com.padcmyanmar.padcx.customprofile.mvp.views

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */
interface MainView : BaseView{
    fun displayTaskList()
    fun displayProfileList()
    fun navigateToCreateTask()
    fun navigateToProfile()
}