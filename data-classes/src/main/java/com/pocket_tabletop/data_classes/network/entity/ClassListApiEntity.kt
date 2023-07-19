package com.pocket_tabletop.data_classes.network.entity

data class ClassListApiEntity(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<ClassApiEntity>
)