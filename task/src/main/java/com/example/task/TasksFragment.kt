package com.example.task

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.task.di.MyTaskComponent
import com.example.task.di.TaskComponentDependenciesProvider
import javax.inject.Inject

class TasksFragment : Fragment() {

    @Inject
    lateinit var taskRepository: TaskRepository

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val taskComponentDependencies =
            (context.applicationContext as TaskComponentDependenciesProvider)
                .getTaskComponentDependencies()
        val taskComponent = MyTaskComponent(taskComponentDependencies)
        taskComponent.injectTasksFragment(this)
//        (context.applicationContext as TasksComponentProvider)
//            .geTasksComponent()
//            .injectTasksFragment(this)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tasks, container, false)
    }
}