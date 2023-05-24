package com.fsmmmssaleschampionhoneywell.features.activities.api

import com.fsmmmssaleschampionhoneywell.features.member.api.TeamApi
import com.fsmmmssaleschampionhoneywell.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}