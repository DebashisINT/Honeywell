package com.fsmmmssaleschampionhoneywell.features.viewAllOrder.model

import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderColorEntity
import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderGenderEntity
import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderProductEntity
import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderSizeEntity
import com.fsmmmssaleschampionhoneywell.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

