package com.pocket_tabletop.data_races.domain.entity


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
