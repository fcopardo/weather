package com.pardo.evernoteweather.view

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import com.pardo.evernoteweather.Forecast
import kotlinx.android.synthetic.main.forecast_view.view.*

class WeatherLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : DataLinearLayout<Forecast>(context, attrs, defStyleAttr) {

    val forecastText : TextView by lazy{
        findViewById<TextView>(R.id.txt_forecast)
    }

    val degreeText : TextView by lazy{
        findViewById<TextView>(R.id.txt_degrees)
    }

    override fun setContent() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}