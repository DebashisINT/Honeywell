package com.fsmmmssaleschampionhoneywell.features.location.api

import com.fsmmmssaleschampionhoneywell.features.location.shopdurationapi.ShopDurationApi
import com.fsmmmssaleschampionhoneywell.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}