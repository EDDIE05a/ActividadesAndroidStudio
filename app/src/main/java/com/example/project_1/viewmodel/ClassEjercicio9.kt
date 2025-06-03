package com.example.project_1.viewmodel

class ClassEjercicio9 {

    fun esCorreoValido(correo: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(correo).matches()
    }
}
