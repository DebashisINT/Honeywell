package com.fsmmmssaleschampionhoneywell.features.stockAddCurrentStock.api

import com.fsmmmssaleschampionhoneywell.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.fsmmmssaleschampionhoneywell.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}