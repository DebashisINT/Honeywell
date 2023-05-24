package com.fsmmmssaleschampionhoneywell.features.viewAllOrder.interf

import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderGenderEntity
import com.fsmmmssaleschampionhoneywell.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}