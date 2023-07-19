package com.pocket_tabletop.data_classes.data

import com.pocket_tabletop.core.Either
import com.pocket_tabletop.data_classes.domain.ClassesRepository
import com.pocket_tabletop.data_classes.network.ClassesApi
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ClassesRepositoryImpl @Inject constructor(
    private val classesApi: ClassesApi
) : ClassesRepository {

    override fun getClassesList(): Flow<Either<String>> {
        TODO("Not yet implemented")
    }
}