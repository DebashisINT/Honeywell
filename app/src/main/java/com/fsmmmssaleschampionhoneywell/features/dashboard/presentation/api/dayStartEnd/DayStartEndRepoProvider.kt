package com.fsmmmssaleschampionhoneywell.features.dashboard.presentation.api.dayStartEnd

import com.fsmmmssaleschampionhoneywell.features.stockCompetetorStock.api.AddCompStockApi
import com.fsmmmssaleschampionhoneywell.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}