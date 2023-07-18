package com.pocket_tabletop.feature_handbook.viewmodel

import androidx.lifecycle.viewModelScope
import com.pocket_tabletop.core.BaseAction
import com.pocket_tabletop.core.BaseViewModel
import com.pocket_tabletop.data_races.domain.entity.Race
import com.pocket_tabletop.feature_handbook.GetAllRacesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

data class RacesListScreenState(
    val isLoading: Boolean,
    val isError: Boolean,
    val races: List<Race> = emptyList()
)

sealed class RacesListScreenAction : BaseAction()

sealed class RacesListScreenEvent {
    object GetRacesListEvent : RacesListScreenEvent()
}

@HiltViewModel
class RacesListScreenViewModel @Inject constructor(
    private val getAllRacesUseCase: GetAllRacesUseCase
) : BaseViewModel<RacesListScreenState, RacesListScreenAction, RacesListScreenEvent>(
    initialState = RacesListScreenState(isLoading = false, isError = false, races = emptyList())
) {

    init {
        obtainEvent(RacesListScreenEvent.GetRacesListEvent)
    }

    override fun obtainEvent(viewEvent: RacesListScreenEvent) {
        when (viewEvent) {
            is RacesListScreenEvent.GetRacesListEvent -> getAllRaces()
        }
    }

    private fun getAllRaces() {
        viewModelScope.launch(Dispatchers.IO) {
            getAllRacesUseCase().collect { state ->
                withContext(Dispatchers.Main) {
                    when {
                        state.isError() -> {
                            viewState = viewState.copy(isError = true)
                        }
                        state.isLoading() -> {
                            viewState = viewState.copy(isLoading = true)
                        }
                        state.isSuccess() -> {
                            viewState = viewState.copy(races = state.data ?: emptyList())
                        }
                    }
                }
            }
        }
    }
}