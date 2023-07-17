package com.pocket_tabletop.data_races.domain.entity

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
