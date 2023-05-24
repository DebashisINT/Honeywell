package com.fsmmmssaleschampionhoneywell.features.taskManagement

import com.fsmmmssaleschampionhoneywell.base.BaseResponse


data class PriorityTaskSel(var task_priority_list:ArrayList<TaskPriorityResponse> = ArrayList()): BaseResponse()

data class TaskPriorityResponse (var task_priority_id:String = "",
                                     var task_priority_name:String = "")


