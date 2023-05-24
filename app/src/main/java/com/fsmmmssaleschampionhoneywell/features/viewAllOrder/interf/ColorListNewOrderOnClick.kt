package com.fsmmmssaleschampionhoneywell.features.viewAllOrder.interf

import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderColorEntity
import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}