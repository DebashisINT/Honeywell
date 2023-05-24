package com.fsmmmssaleschampionhoneywell.features.photoReg.present

import com.fsmmmssaleschampionhoneywell.app.domain.ProspectEntity
import com.fsmmmssaleschampionhoneywell.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}