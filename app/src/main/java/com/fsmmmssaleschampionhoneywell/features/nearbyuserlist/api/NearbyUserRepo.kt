package com.fsmmmssaleschampionhoneywell.features.nearbyuserlist.api

import com.fsmmmssaleschampionhoneywell.app.Pref
import com.fsmmmssaleschampionhoneywell.features.nearbyuserlist.model.NearbyUserResponseModel
import com.fsmmmssaleschampionhoneywell.features.newcollection.model.NewCollectionListResponseModel
import com.fsmmmssaleschampionhoneywell.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}