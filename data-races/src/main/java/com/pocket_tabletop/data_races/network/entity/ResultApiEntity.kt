package com.pocket_tabletop.data_races.network.entity

data class ResultApiEntity(
    val age: String,
    val alignment: String,
    val asi: List<AsiApiEntity>,
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
    val subraces: List<SubraceApiEntity>,
    val traits: String,
    val vision: String
)