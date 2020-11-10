package cn.imppp.knowlege.entity

import cn.imppp.knowlege.constant.FileTagEnum

data class SecondLevelEntity(var currentFile : FileTagEnum,
                             var nextFile: FileTagEnum)