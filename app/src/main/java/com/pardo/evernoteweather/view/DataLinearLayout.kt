package com.pardo.evernoteweather.view

import android.app.PendingIntent.getActivity
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.lifecycle.LifecycleOwner

abstract class DataLinearLayout<T> @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr), UI<T> {

    private var data : T? = null
    private lateinit var lifeCycleOwner : LifecycleOwner

    override fun setData(data: T) {
        this.data = data
        setContent()
    }

    override fun getData() : T? {
        return data
    }

    override fun asView(): View {
        return this
    }

    fun setLifeCycleOwner(owner : LifecycleOwner){
        this.lifeCycleOwner = owner
    }

    fun getLifeCycleOwner() : LifecycleOwner {
        if(lifeCycleOwner == null) lifeCycleOwner = getActivity()
        return lifeCycleOwner;
    }
}