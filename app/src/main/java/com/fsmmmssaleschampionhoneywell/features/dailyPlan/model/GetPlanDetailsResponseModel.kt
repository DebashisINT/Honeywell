package com.fsmmmssaleschampionhoneywell.features.dailyPlan.model

import com.fsmmmssaleschampionhoneywell.base.BaseResponse
import java.io.Serializable

/**
 * Created by Saikat on 24-12-2019.
 */
class GetPlanDetailsResponseModel : BaseResponse(), Serializable {
    var plan_data_details: ArrayList<GetPlanDetailsDataModel>? = null
}