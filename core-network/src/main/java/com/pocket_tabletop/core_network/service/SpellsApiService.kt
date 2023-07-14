package com.pocket_tabletop.core_network.service

import com.pocket_tabletop.core_network.entity.SpellResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SpellsApiService {

    @GET("/v1/spells/?format=json")
    fun getSpells(
        @Query("search")
        search: String = ""
    ): Response<SpellResponse>
}