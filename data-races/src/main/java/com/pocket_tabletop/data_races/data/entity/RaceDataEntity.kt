package com.pocket_tabletop.data_races.data.entity

import androidx.room.Entity
import com.pocket_tabletop.data_races.domain.entity.Race

@Entity(tableName = "races_table")
data class RaceDataEntity(
    val age: String,
    val alignment: String,
    val asi_desc: String,
    val desc: String,
    val document__license_url: String,
    val document__slug: String,
    val document__title: String,
    val document__url: String,
    val languages: String,
    val name: String,
    val size: String,
    val slug: String,
    val speed_desc: String,
    val traits: String,
    val vision: String
) {
    fun toDomain(
        raceAsiList: List<AbilityScoreIncreaseDataEntity>,
        subraceAsiLists: List<List<AbilityScoreIncreaseDataEntity>>,
        speed: SpeedDataEntity,
        subraces: List<SubraceDataEntity>
    ) =
        Race(
            age = age,
            alignment = alignment,
            asi = raceAsiList.toDomain(),
            asi_desc = asi_desc,
            desc = desc,
            document__license_url = document__license_url,
            document__slug = document__slug,
            document__title = document__title,
            document__url = document__url,
            languages = languages,
            name = name,
            size = size,
            slug = slug,
            speed = speed.toDomain(),
            speed_desc = speed_desc,
            subraces = subraces.toDomain(subraceAsiLists),
            traits = traits,
            vision = vision
        )
}

