package com.pocket_tabletop.data_classes.network

import com.pocket_tabletop.data_classes.network.entity.ClassListApiEntity
import retrofit2.Response
import retrofit2.http.GET

interface ClassesApiService {

    @GET("/v1/classes/?format=json")
    suspend fun getAllClassesList(): Response<ClassListApiEntity>
}