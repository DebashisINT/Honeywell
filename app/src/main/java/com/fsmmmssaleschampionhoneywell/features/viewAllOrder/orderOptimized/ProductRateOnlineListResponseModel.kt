package com.fsmmmssaleschampionhoneywell.features.viewAllOrder.orderOptimized

import com.fsmmmssaleschampionhoneywell.app.domain.ProductOnlineRateTempEntity
import com.fsmmmssaleschampionhoneywell.base.BaseResponse
import com.fsmmmssaleschampionhoneywell.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}