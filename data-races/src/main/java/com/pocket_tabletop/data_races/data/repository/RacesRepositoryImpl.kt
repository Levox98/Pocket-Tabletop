package com.pocket_tabletop.data_races.data.repository

import com.pocket_tabletop.core.Either
import com.pocket_tabletop.data_races.domain.entity.Race
import com.pocket_tabletop.data_races.domain.repository.RacesRepository
import com.pocket_tabletop.data_races.network.RacesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RacesRepositoryImpl @Inject constructor(
    private val racesApi: RacesApi
) : RacesRepository {

    override fun getRacesList(): Flow<Either<List<Race>>> = flow {
        emit(Either.loading())

        val result = racesApi.getRacesList()

        result.onError {
            emit(Either.error(it))
        }

        result.onSuccess {
            emit(Either.success(it))
        }
    }
}