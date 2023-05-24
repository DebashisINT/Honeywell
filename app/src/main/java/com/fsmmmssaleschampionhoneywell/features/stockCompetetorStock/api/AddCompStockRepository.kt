package com.fsmmmssaleschampionhoneywell.features.stockCompetetorStock.api

import com.fsmmmssaleschampionhoneywell.base.BaseResponse
import com.fsmmmssaleschampionhoneywell.features.orderList.model.NewOrderListResponseModel
import com.fsmmmssaleschampionhoneywell.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.fsmmmssaleschampionhoneywell.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}