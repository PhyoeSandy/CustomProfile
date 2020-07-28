package com.padcmyanmar.padcx.customprofile.adapters

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padcx.customprofile.views.viewholders.BaseViewHolder

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/26/2020.
 */
abstract class BaseRecyclerAdapter<T : BaseViewHolder<W>,W> : RecyclerView.Adapter<T>() {

    var mData : MutableList<W> = arrayListOf()

    override fun getItemCount(): Int {
        Log.d("Item count is: ", mData.count().toString())
        return mData.count()
    }

    override fun onBindViewHolder(holder: T, position: Int) {
        holder.bindData(mData[position])
    }

    fun setNewData(data : MutableList<W>){
        mData = data
        notifyDataSetChanged()
    }

    fun appendNewData(data : List<W>){
        mData.addAll(data)
        notifyDataSetChanged()
    }
}