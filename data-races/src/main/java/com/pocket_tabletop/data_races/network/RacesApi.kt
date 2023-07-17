package com.pocket_tabletop.data_races.network

import com.pocket_tabletop.core.Either
import com.pocket_tabletop.core_network.BaseApi
import com.pocket_tabletop.data_races.network.entity.RaceListApiEntity
import javax.inject.Inject

class RacesApi @Inject constructor(
    private val racesApiService: RacesApiService
) : BaseApi() {

    suspend fun getRacesList(): Either<RaceListApiEntity?> =
        doRequest(
            tag = "getRacesList",
            request = {
                racesApiService.getAllRaces()
            },
            mapper = {
                it
            }
        )
}