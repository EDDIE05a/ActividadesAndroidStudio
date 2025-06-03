package com.example.project_1.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

data class Tarea(
    val id: Int,
    val titulo: String,
    var completada: Boolean
)

class ClassEjercicio7 : ViewModel() {
    // Lista de tareas en memoria (simulación)
    var listaTareas = mutableStateListOf(
        Tarea(1, "Comprar comida", false),
        Tarea(2, "Estudiar Kotlin", true),
        Tarea(3, "Hacer ejercicio", false)
    )

    fun cambiarEstado(id: Int, nuevoEstado: Boolean) {
        val index = listaTareas.indexOfFirst { it.id == id }
        if (index != -1) {
            listaTareas[index] = listaTareas[index].copy(completada = nuevoEstado)
        }
    }
}
