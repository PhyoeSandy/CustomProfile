package com.padcmyanmar.padcx.customprofile.data.vos

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */
data class TaskVO(
    var status: String = "",
    var type: String = "",
    var task: String = "",
    var comment: String = "",
    var attach_file: String = "",
    var image: Int = 0
)