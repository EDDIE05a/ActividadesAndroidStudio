package com.example.project_1.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ClassEjercicio10 : ViewModel() {

    var estadoTexto = mutableStateOf("Enviar")
        private set

    var estaCargando = mutableStateOf(false)
        private set

    fun simularCarga() {
        if (estaCargando.value) return

        estaCargando.value = true
        estadoTexto.value = "Cargando..."

        viewModelScope.launch {
            delay(2000)
            estadoTexto.value = "Listo"
            estaCargando.value = false
        }
    }
}
