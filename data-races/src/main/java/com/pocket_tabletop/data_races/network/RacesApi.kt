package com.pocket_tabletop.data_races.network

import com.pocket_tabletop.core.Either
import com.pocket_tabletop.core_network.BaseApi
import com.pocket_tabletop.data_races.domain.entity.Race
import com.pocket_tabletop.data_races.domain.entity.toDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RacesApi @Inject constructor(
    private val racesApiService: RacesApiService
) : BaseApi() {

    suspend fun getRacesList(): Either<List<Race>?> =
        doRequest(
            tag = "getRacesList",
            request = {
                racesApiService.getAllRaces()
            },
            mapper = { raceList ->
                raceList?.results?.map { it.toDomain() }
            }
        )
}