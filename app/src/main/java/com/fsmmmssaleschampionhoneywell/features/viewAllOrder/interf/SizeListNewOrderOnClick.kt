package com.fsmmmssaleschampionhoneywell.features.viewAllOrder.interf

import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderProductEntity
import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}