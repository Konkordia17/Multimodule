package com.example.task.di

import com.example.data.Database
import com.example.network.TaskApi
import com.example.task.TaskRepository
import dagger.Module
import dagger.Provides

@Module
class TaskModule {

    @Provides
    fun provideTaskRepository(database: Database, taskApi: TaskApi): TaskRepository {
        return TaskRepository(database, taskApi)
    }
}