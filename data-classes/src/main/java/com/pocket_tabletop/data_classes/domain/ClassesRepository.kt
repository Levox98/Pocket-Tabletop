package com.pocket_tabletop.data_classes.domain

import com.pocket_tabletop.core.Either
import kotlinx.coroutines.flow.Flow

interface ClassesRepository {
    fun getClassesList(): Flow<Either<String>>
}