package com.fsmmmssaleschampionhoneywell.features.viewAllOrder.interf

import com.fsmmmssaleschampionhoneywell.app.domain.NewOrderGenderEntity
import com.fsmmmssaleschampionhoneywell.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}