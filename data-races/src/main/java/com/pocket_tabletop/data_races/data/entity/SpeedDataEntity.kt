package com.pocket_tabletop.data_races.data.entity

import androidx.room.Entity
import com.pocket_tabletop.data_races.domain.entity.Speed

@Entity(tableName = "speed_table")
data class SpeedDataEntity(
    val walk: Int
) {
    fun toDomain() = Speed(walk)
}
