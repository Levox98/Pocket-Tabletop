package com.pocket_tabletop.data_classes.network.entity

data class ClassApiEntity(
    val archetypes: List<ArchetypeApiEntity>,
    val desc: String,
    val document__license_url: String,
    val document__slug: String,
    val document__title: String,
    val document__url: String,
    val equipment: String,
    val hit_dice: String,
    val hp_at_1st_level: String,
    val hp_at_higher_levels: String,
    val name: String,
    val prof_armor: String,
    val prof_saving_throws: String,
    val prof_skills: String,
    val prof_tools: String,
    val prof_weapons: String,
    val slug: String,
    val spellcasting_ability: String,
    val subtypes_name: String,
    val table: String
)