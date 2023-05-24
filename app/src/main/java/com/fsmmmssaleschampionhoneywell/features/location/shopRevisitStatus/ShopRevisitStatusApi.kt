package com.fsmmmssaleschampionhoneywell.features.location.shopRevisitStatus

import com.fsmmmssaleschampionhoneywell.app.NetworkConstant
import com.fsmmmssaleschampionhoneywell.base.BaseResponse
import com.fsmmmssaleschampionhoneywell.features.location.model.ShopDurationRequest
import com.fsmmmssaleschampionhoneywell.features.location.model.ShopRevisitStatusRequest
import com.fsmmmssaleschampionhoneywell.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface ShopRevisitStatusApi {

    @POST("Shopsubmission/OrderNotTakenReason")
    fun submShopRevisitStatus(@Body shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse>

    companion object Factory {
        fun create(): ShopRevisitStatusApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(ShopRevisitStatusApi::class.java)
        }
    }

}