package com.pocket_tabletop.feature_handbook

import com.pocket_tabletop.data_races.domain.RacesRepository
import javax.inject.Inject

class GetAllRacesUseCase @Inject constructor(
    private val racesRepository: RacesRepository
) {
    operator fun invoke() = racesRepository.getRacesList()
}