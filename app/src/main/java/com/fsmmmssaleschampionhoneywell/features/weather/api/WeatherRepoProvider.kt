package com.fsmmmssaleschampionhoneywell.features.weather.api

import com.fsmmmssaleschampionhoneywell.features.task.api.TaskApi
import com.fsmmmssaleschampionhoneywell.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}