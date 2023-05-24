package com.fsmmmssaleschampionhoneywell.features.viewAllOrder.interf

import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderGenderEntity
import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}