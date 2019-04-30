package com.pardo.evernoteweather.view

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pardo.evernoteweather.Forecast

class WeatherAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var elements : ArrayList<Forecast> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return elements.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}