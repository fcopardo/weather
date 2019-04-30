package com.pardo.evernoteweather.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

fun View.getInflater() : LayoutInflater {
    return context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
}

fun ViewGroup.inflate(id : Int){
    getInflater().inflate(id, this)
}

fun ViewGroup.buildDefaultParams(fullScreen: Boolean){
    layoutParams = if(fullScreen) {
        ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
    }
    else{
        ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}

fun View.getActivity() : AppCompatActivity {
    return context as AppCompatActivity
}

fun View.Log(text : String){
    android.util.Log.e(javaClass::getSimpleName.toString(), text)
}