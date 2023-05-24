package com.fsmmmssaleschampionhoneywell.features.location.shopRevisitStatus

import com.fsmmmssaleschampionhoneywell.features.location.shopdurationapi.ShopDurationApi
import com.fsmmmssaleschampionhoneywell.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}