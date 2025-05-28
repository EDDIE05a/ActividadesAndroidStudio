package com.example.project_1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State

class ClassEjercicio5 : ViewModel() {

    private val _password = mutableStateOf("")
    val password: State<String> = _password

    fun onPasswordChange(nueva: String) {
        _password.value = nueva
    }

    fun obtenerFortaleza(): Fortaleza {
        val length = _password.value.length
        return when {
            length < 6 -> Fortaleza.DEBIL
            length < 10 -> Fortaleza.MEDIA
            else -> Fortaleza.FUERTE
        }
    }

    enum class Fortaleza(val color: androidx.compose.ui.graphics.Color, val label: String) {
        DEBIL(androidx.compose.ui.graphics.Color.Red, "Débil"),
        MEDIA(androidx.compose.ui.graphics.Color(0xFFFFA000), "Media"), // Amarillo oscuro
        FUERTE(androidx.compose.ui.graphics.Color(0xFF388E3C), "Fuerte") // Verde fuerte
    }
}
