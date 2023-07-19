package com.pocket_tabletop.data_classes

import com.pocket_tabletop.data_classes.data.ClassesRepositoryImpl
import com.pocket_tabletop.data_classes.domain.ClassesRepository
import com.pocket_tabletop.data_classes.network.ClassesApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ClassesDiModule {

    @Provides
    @Singleton
    fun bindClassesRepository(r: ClassesRepositoryImpl): ClassesRepository = r

    @Provides
    @Singleton
    fun provideClassesService(retrofit: Retrofit) =
        retrofit.create(ClassesApiService::class.java)
}