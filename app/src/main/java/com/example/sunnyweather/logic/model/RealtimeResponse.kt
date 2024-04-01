package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

data class RealtimeResponse(
    val status: String,
    val result: Result
){

    data class Result(
      val realtime:Realtime
    )

    data class Realtime(
        val skycon: String,
        val temeperature: Float,
        @SerializedName("air_quality")val air_quality: AirQuality
    )

    data class AirQuality(
        val aqi: Aqi
    )

    data class Aqi(
        val chn: Float
    )

}
