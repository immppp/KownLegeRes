package cn.imppp.knowlege.entity

import java.io.Serializable
import java.util.*

data class IBaseEntity(var createTime: Date,
                       var updateTime: Date,
                       var delFlag: Int = 0,
                       var createTimeStar: Date,
                       var createTimeEnd: Date) : Serializable