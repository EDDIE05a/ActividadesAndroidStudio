package com.example.project_1.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ViewModel2: ViewModel() {
    var nombre by mutableStateOf("")
    var edad by mutableStateOf("")
    var password by mutableStateOf("")
    var terminos by mutableStateOf(false)
    var generos by mutableStateOf(listOf("Hombre", "Mujer", "Otros"))
    var genero by mutableStateOf("")
    var altura by mutableFloatStateOf(1.0f)

    fun guardar(){
        println("nombre: , $nombre")
        println("edad: , $edad")
    }
}