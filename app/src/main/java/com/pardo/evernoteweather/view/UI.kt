package com.pardo.evernoteweather.view

import android.view.View

/**
 * Represents a piece of UI
 */
interface UI<T> {
    fun setData(data : T)
    fun getData() : T?
    fun setContent()
    fun asView() : View
}