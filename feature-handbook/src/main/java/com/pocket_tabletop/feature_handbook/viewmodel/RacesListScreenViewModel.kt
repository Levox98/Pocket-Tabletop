package com.pocket_tabletop.feature_handbook.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewModelScope
import com.pocket_tabletop.core.AppError
import com.pocket_tabletop.core.BaseViewModel
import com.pocket_tabletop.feature_handbook.GetAllRacesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class RacesListScreenViewModel @Inject constructor(
    private val getAllRacesUseCase: GetAllRacesUseCase
) : BaseViewModel() {

    var raceNames by mutableStateOf<List<String>?>(listOf())
        private set

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getAllRacesUseCase().collect { state ->
                withContext(Dispatchers.Main) {
                    when {
                        state.isError() -> error(state.error ?: AppError.Unknown())
                        state.isLoading() -> showProgress()
                        state.isSuccess() -> {
                            hideProgress()
                            raceNames = state.data?.map { it.name }
                        }
                    }
                }
            }
        }
    }
}