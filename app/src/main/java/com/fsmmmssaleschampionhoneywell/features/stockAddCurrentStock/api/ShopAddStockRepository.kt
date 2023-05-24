package com.fsmmmssaleschampionhoneywell.features.stockAddCurrentStock.api

import com.fsmmmssaleschampionhoneywell.base.BaseResponse
import com.fsmmmssaleschampionhoneywell.features.location.model.ShopRevisitStatusRequest
import com.fsmmmssaleschampionhoneywell.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.fsmmmssaleschampionhoneywell.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.fsmmmssaleschampionhoneywell.features.stockAddCurrentStock.model.CurrentStockGetData
import com.fsmmmssaleschampionhoneywell.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}