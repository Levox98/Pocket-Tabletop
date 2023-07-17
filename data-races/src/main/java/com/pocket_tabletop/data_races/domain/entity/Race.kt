package com.pocket_tabletop.data_races.domain.entity

import com.pocket_tabletop.data_races.network.entity.RaceApiEntity
import com.pocket_tabletop.data_races.network.entity.SpeedApiEntity

data class Race(
    val age: String,
    val alignment: String,
    val asi: List<AbilityScoreIncrease>,
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
    val speed: SpeedApiEntity,
    val speed_desc: String,
    val subraces: List<Subrace>,
    val traits: String,
    val vision: String
)

fun RaceApiEntity.toDomain() =
    Race(
        age = age,
        alignment = alignment,
        asi = asi.toDomain(),
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
        speed = speed,
        speed_desc = speed_desc,
        subraces = subraces.toDomain(),
        traits = traits,
        vision = vision
    )

fun List<RaceApiEntity>.toDomain() = this.map { it.toDomain() }