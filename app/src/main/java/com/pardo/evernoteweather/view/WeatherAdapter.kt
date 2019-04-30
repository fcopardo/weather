package com.pardo.evernoteweather.view

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pardo.evernoteweather.Forecast

class WeatherAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var elements : ArrayList<Forecast> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        //Here we would create a GenericViewHolder<UI<Forecast>> and put the desired UI<Forecast>
        //implementation view inside
    }

    override fun getItemCount(): Int {
        return elements.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        //Here we cast the viewHolder to GenericViewHolder<UI<Forecast>> and call the data set method, so the
        // housed view is updated.
    }
}