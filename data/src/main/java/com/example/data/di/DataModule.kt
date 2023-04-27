package com.example.data.di

import android.content.Context
import com.example.core.FileManager
import com.example.data.Database
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideDatabase(context: Context, fileManager: FileManager): Database {
        return Database(context, fileManager)
    }
}