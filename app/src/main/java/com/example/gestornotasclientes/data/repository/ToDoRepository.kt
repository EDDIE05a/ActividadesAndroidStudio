package com.example.gestornotasclientes.data.repository

class ToDoRepository (private val dao: ToDoDao){
    val allTodos: Flow<List<ToDo>> = dao.getAll()

    suspend fun insert(todo: ToDo){
        dao.insert(todo)
    }

    suspend fun delete(todo: ToDo){
        dao.delete(todo)
    }
}