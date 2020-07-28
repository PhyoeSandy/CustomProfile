package com.padcmyanmar.padcx.customprofile.data.vos

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */
data class UserVO(
    var name: String = "",
    var position: String = "",
    var close_task: Int = 0,
    var open_task: Int = 0,
    var profile_image: Int = 0,
    var task_list: ArrayList<TaskVO> = arrayListOf()
)