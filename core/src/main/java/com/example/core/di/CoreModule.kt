package com.example.core.di

import com.example.core.FileManager
import dagger.Module
import dagger.Provides

@Module
class CoreModule {

    @Provides
    fun provideFileManager(): FileManager {
        return FileManager()
    }
}