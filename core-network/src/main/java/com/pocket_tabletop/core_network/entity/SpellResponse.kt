package com.pocket_tabletop.core_network.entity

data class SpellResponse(
    override val count: Int?,
    val next: String,
    val previous: Any,
    val results: List<Result>
) : ApiResponse