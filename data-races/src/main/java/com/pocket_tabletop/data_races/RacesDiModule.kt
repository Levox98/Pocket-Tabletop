package com.pocket_tabletop.data_races

import com.pocket_tabletop.data_races.network.RacesApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RacesDiModule {

    @Provides
    @Singleton
    fun provideRacesService(retrofit: Retrofit): RacesApiService =
        retrofit.create(RacesApiService::class.java)
}