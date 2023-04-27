package com.example.network.di

import com.example.network.TaskApi
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideTaskApi(): TaskApi {
        return object : TaskApi {}
    }
}