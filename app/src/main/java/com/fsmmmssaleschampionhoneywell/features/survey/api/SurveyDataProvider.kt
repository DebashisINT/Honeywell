package com.fsmmmssaleschampionhoneywell.features.survey.api

import com.fsmmmssaleschampionhoneywell.features.photoReg.api.GetUserListPhotoRegApi
import com.fsmmmssaleschampionhoneywell.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}