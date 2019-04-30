package com.pardo.evernoteweather.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class GenericViewHolder<T : UI<X>, X> : RecyclerView.ViewHolder {

    constructor(view : T) : super(view as View)

    fun getView() : T {
        return this.itemView as T
    }

    fun resetData(data : X){
        getView().setData(data)
    }

    fun getData() : X?{
        return getView().getData()
    }
}