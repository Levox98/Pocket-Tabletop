package com.pocket_tabletop.data_races.network.entity

import com.pocket_tabletop.core_network.entity.ApiResponse

data class RaceListApiEntity(
    override val count: Int,
    val next: Any,
    val previous: Any,
    val results: List<ResultApiEntity>
) : ApiResponse