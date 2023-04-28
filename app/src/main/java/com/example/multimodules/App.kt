package com.example.multimodules

import android.app.Application
import com.example.multimodules.di.AppComponent
import com.example.multimodules.di.DaggerAppComponent
import com.example.task.di.TaskComponentDependencies
import com.example.task.di.TaskComponentDependenciesProvider

class App: Application(), TaskComponentDependenciesProvider {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this)
    }

    override fun getTaskComponentDependencies(): TaskComponentDependencies {
        return appComponent
    }
}