package com.example.task

import com.example.data.Database
import com.example.network.TaskApi

class TaskRepository(
    private val database: Database,
    private val taskApi: TaskApi
) {
}