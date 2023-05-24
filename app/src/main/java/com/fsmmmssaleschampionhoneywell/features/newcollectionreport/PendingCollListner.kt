package com.fsmmmssaleschampionhoneywell.features.newcollectionreport

import com.fsmmmssaleschampionhoneywell.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}