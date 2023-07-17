package com.pocket_tabletop.data_races.network

import com.pocket_tabletop.data_races.network.entity.RaceListApiEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface RacesApiService {

    @Headers("Content-Type: application/json")
    @GET("/v1/races/?format=json")
    suspend fun getAllRaces(): Response<RaceListApiEntity>
}