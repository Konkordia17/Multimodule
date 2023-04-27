package com.example.task.di

import com.example.data.Database

interface TaskComponentDependencies {

    fun getDatabase(): Database
}