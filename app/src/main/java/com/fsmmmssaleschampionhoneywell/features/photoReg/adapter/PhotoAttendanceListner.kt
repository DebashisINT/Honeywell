package com.fsmmmssaleschampionhoneywell.features.photoReg.adapter

import com.fsmmmssaleschampionhoneywell.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}