package com.example.multimodules

import android.app.Application
import com.example.multimodules.di.AppComponent
import com.example.multimodules.di.MyAppComponent
import com.example.task.di.TaskComponent
import com.example.task.di.TaskComponentDependencies
import com.example.task.di.TaskComponentDependenciesProvider
import com.example.task.di.TasksComponentProvider

class App: Application(), TaskComponentDependenciesProvider {
    lateinit var appComponent: AppComponent
    lateinit var myAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
//        appComponent = DaggerAppComponent.factory().create(this)
        myAppComponent = MyAppComponent(this)
    }

    override fun getTaskComponentDependencies(): TaskComponentDependencies {
        return appComponent
    }
}