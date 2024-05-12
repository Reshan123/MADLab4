package com.example.taskmanagementapplication.repository

import com.example.taskmanagementapplication.database.TaskDatabase
import com.example.taskmanagementapplication.model.Task

class TaskRepository(private val db: TaskDatabase) {
    suspend fun insertTask(task: Task) = db.getTaskDao().insertTask(task)
    suspend fun deleteTask(task: Task) = db.getTaskDao().deleteTask(task)
    suspend fun updateTask(task: Task) = db.getTaskDao().updateTask(task)

    fun getAllDocs() = db.getTaskDao().getAllTasks()
    fun searchTask(query: String?) = db.getTaskDao().searchTasks(query)

}