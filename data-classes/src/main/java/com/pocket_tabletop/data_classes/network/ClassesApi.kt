package com.pocket_tabletop.data_classes.network

import android.util.Log
import com.pocket_tabletop.core_network.BaseApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ClassesApi @Inject constructor(
    private val classesApiService: ClassesApiService
) : BaseApi()  {

    suspend fun getClassList() =
        doRequest(
            tag = "getClassList",
            request = {
                classesApiService.getAllClassesList()
            },
            mapper = {
                Log.d("CLASS_API", "${it?.results?.map { classApiEntity -> classApiEntity.name }}")
            }
        )
}