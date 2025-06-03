package com.example.project_1.viewmodel

class ClassEjercicio8 {
    private val limite = 100

    fun obtenerLimite(): Int = limite

    fun estaDentroDelLimite(texto: String): Boolean {
        return texto.length <= limite
    }

    fun contarCaracteres(texto: String): String {
        return "${texto.length}/$limite"
    }
}
