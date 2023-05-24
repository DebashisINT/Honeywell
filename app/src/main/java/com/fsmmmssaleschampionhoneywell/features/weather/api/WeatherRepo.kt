package com.fsmmmssaleschampionhoneywell.features.weather.api

import com.fsmmmssaleschampionhoneywell.base.BaseResponse
import com.fsmmmssaleschampionhoneywell.features.task.api.TaskApi
import com.fsmmmssaleschampionhoneywell.features.task.model.AddTaskInputModel
import com.fsmmmssaleschampionhoneywell.features.weather.model.ForeCastAPIResponse
import com.fsmmmssaleschampionhoneywell.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}