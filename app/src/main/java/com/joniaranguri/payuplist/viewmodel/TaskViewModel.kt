package com.joniaranguri.payuplist.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.joniaranguri.payuplist.data.model.Task

class TaskViewModel : ViewModel() {
    private var nextId = 0
    var taskList = mutableStateListOf<Task>()
        private set

    fun addTask(title: String) {
        if (title.isNotBlank()) {
            taskList.add(Task(id = nextId++, title = title))
        }
    }

    fun removeTask(Task: Task) {
        taskList.remove(Task)
    }
}
