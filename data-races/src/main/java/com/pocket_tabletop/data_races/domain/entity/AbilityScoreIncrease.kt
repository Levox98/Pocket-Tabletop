package com.pocket_tabletop.data_races.domain.entity

import com.pocket_tabletop.data_races.network.entity.AbilityScoreIncreaseApiEntity

data class AbilityScoreIncrease(
    val attributes: List<String>,
    val value: Int
)

fun AbilityScoreIncreaseApiEntity.toDomain() =
    AbilityScoreIncrease(
        attributes = attributes,
        value = value
    )

fun List<AbilityScoreIncreaseApiEntity>.toDomain() = this.map { it.toDomain() }
