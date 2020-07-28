package com.padcmyanmar.padcx.customprofile.views.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/24/2020.
 */
class TaskCardViewPods @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {





    interface Delegate {
        fun onTapProfile()
    }
}