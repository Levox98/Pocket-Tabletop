package com.pocket_tabletop.data_races.domain.entity

import com.pocket_tabletop.data_races.network.entity.SubraceApiEntity


data class Subrace(
    val asi: List<AbilityScoreIncrease>,
    val asi_desc: String,
    val desc: String,
    val document__slug: String,
    val document__title: String,
    val document__url: String,
    val name: String,
    val slug: String,
    val traits: String
)

fun SubraceApiEntity.toDomain() =
    Subrace(
        asi = asi.toDomain(),
        asi_desc = asi_desc,
        desc = desc,
        document__slug = document__slug,
        document__title = document__title,
        document__url = document__url,
        name = name,
        slug = slug,
        traits = traits
    )

fun List<SubraceApiEntity>.toDomain() = this.map { it.toDomain() }
