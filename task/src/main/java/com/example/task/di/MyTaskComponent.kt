package com.example.task.di

import com.example.network.di.NetworkModule
import com.example.task.TasksFragment

class MyTaskComponent(private val taskComponentDependencies: TaskComponentDependencies) :
    TaskComponent {
    private val networkModule = NetworkModule()
    private val taskModule = TaskModule()

    override fun injectTasksFragment(tasksFragment: TasksFragment) {
        tasksFragment.taskRepository = taskModule.provideTaskRepository(
            database = taskComponentDependencies.getDatabase(),
            taskApi = networkModule.provideTaskApi()
        )
    }
}