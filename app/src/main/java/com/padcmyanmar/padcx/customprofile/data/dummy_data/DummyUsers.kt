package com.padcmyanmar.padcx.customprofile.data.dummy_data

import com.padcmyanmar.padcx.customprofile.R
import com.padcmyanmar.padcx.customprofile.data.vos.TaskVO
import com.padcmyanmar.padcx.customprofile.data.vos.UserVO

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/28/2020.
 */

val taskList = arrayListOf(
    TaskVO("In Progress","BackEnd","Contact Page","3","5",R.drawable.pro1),
    TaskVO("Done","FrontEnd","Main Page","1","10",R.drawable.pro4),
    TaskVO("Review","Design","Home Page","3","5",R.drawable.pro1),
    TaskVO("Checked","UserExperience","Shopping Page","5","10",R.drawable.pro4),
    TaskVO("In Progress","Testing","Techinical Task","2","2",R.drawable.pro1)
)

val dummy_users_list = arrayListOf(
    UserVO("Rose Mary","Software Developer",200,5, R.drawable.pro1,taskList),
    UserVO("Jackcy Luis","UI Designer",40,3,R.drawable.pro4,taskList),
    UserVO("Erin","BackEnd Developer",100,15,R.drawable.pro1,taskList),
    UserVO("Kathy","QA Engineer",50,10,R.drawable.pro4,taskList),
    UserVO("","",0,0,0, arrayListOf())
)