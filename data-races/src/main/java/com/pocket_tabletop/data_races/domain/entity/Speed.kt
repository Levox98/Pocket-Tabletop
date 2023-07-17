package com.pocket_tabletop.data_races.domain.entity

import com.pocket_tabletop.data_races.network.entity.SpeedApiEntity

data class Speed(
    val walk: Int
)

fun SpeedApiEntity.toDomain() = Speed(walk = walk)