package com.pocket_tabletop.data_races.data.entity

import androidx.room.Entity
import com.pocket_tabletop.data_races.domain.entity.Subrace

@Entity(tableName = "subrace_table")
data class SubraceDataEntity(
    val asi_desc: String,
    val desc: String,
    val document__slug: String,
    val document__title: String,
    val document__url: String,
    val name: String,
    val slug: String,
    val traits: String
) {
    fun toDomain(asiList: List<AbilityScoreIncreaseDataEntity>) =
        Subrace(
            asi = asiList.toDomain(),
            asi_desc = asi_desc,
            desc = desc,
            document__slug = document__slug,
            document__title = document__title,
            document__url = document__url,
            name = name,
            slug = slug,
            traits = traits
        )
}

fun List<SubraceDataEntity>.toDomain(asi: List<List<AbilityScoreIncreaseDataEntity>>) =
    this.map { subraceDataEntity -> subraceDataEntity.toDomain(asi[this.indexOf(subraceDataEntity)]) }
