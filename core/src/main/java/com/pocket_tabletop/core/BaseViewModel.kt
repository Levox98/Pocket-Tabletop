package com.pocket_tabletop.core

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

abstract class BaseViewModel(): ViewModel() {

    var showProgress: Boolean by mutableStateOf(false)
        private set

    var errorMessage: String? by mutableStateOf("")
        private set

    fun showProgress() {
        showProgress = true
    }

    fun hideProgress() {
        showProgress = false
    }

    fun error(message: String) {
        hideProgress()
        errorMessage = message
    }

    fun clearError() {
        errorMessage = null
    }
}
