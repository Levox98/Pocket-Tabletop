package com.pocket_tabletop.data_races.data.entity

import androidx.room.Entity
import com.pocket_tabletop.data_races.domain.entity.AbilityScoreIncrease

@Entity(tableName = "asi_table")
data class AbilityScoreIncreaseDataEntity(
    val attributes: List<String>,
    val value: Int
) {
    fun toDomain() = AbilityScoreIncrease(attributes = attributes, value = value)
}

fun List<AbilityScoreIncreaseDataEntity>.toDomain() = this.map { it.toDomain() }
