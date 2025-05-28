package com.example.project_1.viewmodel


import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State

class ClassEjercicio3 : ViewModel() {

    private val _numero = mutableStateOf("")
    val numero: State<String> = _numero

    private val _esValido = mutableStateOf(true)
    val esValido: State<Boolean> = _esValido

    fun onNumeroChange(nuevo: String) {
        // Solo permite dígitos
        if (nuevo.all { it.isDigit() }) {
            _numero.value = nuevo
        }
    }

    fun validar() {
        _esValido.value = _numero.value.length == 10
    }
}
