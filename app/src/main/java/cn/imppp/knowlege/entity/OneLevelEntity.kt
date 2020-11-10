package cn.imppp.knowlege.entity

import cn.imppp.knowlege.constant.FileTagEnum

data class OneLevelEntity(var currentFile : FileTagEnum,
                          var nextFile: FileTagEnum)
//                          var hasSort: Boolean = false