package com.example.task.di

import com.example.network.di.NetworkModule
import com.example.task.TasksFragment
import dagger.Component


@Component(modules = [TaskModule::class, NetworkModule::class], dependencies =[TaskComponentDependencies::class])
interface TaskComponent {

    fun  injectTasksFragment(tasksFragment: TasksFragment)
}