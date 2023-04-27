package com.example.multimodules.di

import android.content.Context
import com.example.core.di.CoreModule
import com.example.data.Database
import com.example.data.di.DataModule
import com.example.task.di.TaskComponentDependencies
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, CoreModule::class])
interface AppComponent: TaskComponentDependencies {

    override fun getDatabase(): Database

    @Component.Factory
    interface AppComponentFactory {
        fun create(@BindsInstance context: Context): AppComponent
    }

}