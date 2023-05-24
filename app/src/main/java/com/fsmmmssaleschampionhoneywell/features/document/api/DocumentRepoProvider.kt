package com.fsmmmssaleschampionhoneywell.features.document.api

import com.fsmmmssaleschampionhoneywell.features.dymanicSection.api.DynamicApi
import com.fsmmmssaleschampionhoneywell.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}