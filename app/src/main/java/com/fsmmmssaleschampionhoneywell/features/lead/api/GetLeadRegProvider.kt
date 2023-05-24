package com.fsmmmssaleschampionhoneywell.features.lead.api

import com.fsmmmssaleschampionhoneywell.features.NewQuotation.api.GetQuotListRegRepository
import com.fsmmmssaleschampionhoneywell.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}