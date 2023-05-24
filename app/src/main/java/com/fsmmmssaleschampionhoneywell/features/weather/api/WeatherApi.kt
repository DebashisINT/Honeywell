package com.fsmmmssaleschampionhoneywell.features.weather.api

import com.fsmmmssaleschampionhoneywell.app.NetworkConstant
import com.fsmmmssaleschampionhoneywell.app.utils.AppUtils
import com.fsmmmssaleschampionhoneywell.features.task.model.TaskListResponseModel
import com.fsmmmssaleschampionhoneywell.features.weather.model.ForeCastAPIResponse
import com.fsmmmssaleschampionhoneywell.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface WeatherApi {

    @GET("forecast?appid=a10a3857bd44e67c80282b38858d37fa&units=metric")
    fun getForecast(@Query("zip") zip: String): Observable<ForeCastAPIResponse>


    @POST("weather?appid=a10a3857bd44e67c80282b38858d37fa&units=metric")
    fun getTodayWeather(@Query("zip") zip: String): Observable<WeatherAPIResponse>


    companion object Factory {
        fun create(): WeatherApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.WEATHER_URL)
                    .build()

            return retrofit.create(WeatherApi::class.java)
        }
    }
}