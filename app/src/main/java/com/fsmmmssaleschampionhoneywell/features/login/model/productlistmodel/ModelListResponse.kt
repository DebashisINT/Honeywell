package com.fsmmmssaleschampionhoneywell.features.login.model.productlistmodel

import com.fsmmmssaleschampionhoneywell.app.domain.ModelEntity
import com.fsmmmssaleschampionhoneywell.app.domain.ProductListEntity
import com.fsmmmssaleschampionhoneywell.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}