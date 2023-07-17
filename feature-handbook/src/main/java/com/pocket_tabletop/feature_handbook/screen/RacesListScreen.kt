package com.pocket_tabletop.feature_handbook.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pocket_tabletop.feature_handbook.viewmodel.RacesListScreenViewModel

@Composable
fun RacesListScreen(vm: RacesListScreenViewModel) {

    val racesNames = vm.raceNames ?: listOf()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        itemsIndexed(items = racesNames) { index, name ->
            Text(text = name)
        }
    }
}