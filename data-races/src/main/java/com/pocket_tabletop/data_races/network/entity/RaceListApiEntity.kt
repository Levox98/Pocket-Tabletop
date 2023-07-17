package com.pocket_tabletop.data_races.network.entity

import com.pocket_tabletop.core_network.entity.ApiResponse

data class RaceListApiEntity(
    override val count: Int?,
    val next: String?,
    val previous: String?,
    val results: List<RaceApiEntity>
) : ApiResponse