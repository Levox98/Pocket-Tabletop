package com.pocket_tabletop.core_network

import android.util.Log
import com.pocket_tabletop.core_network.service.SpellsApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SpellsApi @Inject constructor(
    private val spellsApiService: SpellsApiService
) : BaseApi() {

    suspend fun getSpells(
        search: String = ""
    ) = doRequest(
        tag = "getSpells",
        request = {
            spellsApiService.getSpells(search)
        },
        mapper = { spellResponse ->
            Log.d(
                "SPELL_RESPONSE",
                "${spellResponse?.results?.map { it.name }}"
            )
        }
    )
}