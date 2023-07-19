package com.pocket_tabletop.data_races.domain

import com.pocket_tabletop.core.Either
import com.pocket_tabletop.data_races.domain.entity.Race
import kotlinx.coroutines.flow.Flow

interface RacesRepository {
    fun getRacesList(): Flow<Either<List<Race>>>
}