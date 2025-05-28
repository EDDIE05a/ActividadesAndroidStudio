package com.example.project_1.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ClassEjercicio2: ViewModel() {

    private val _correo = mutableStateOf("")
    val correo: State<String> = _correo

    private val _contrasena = mutableStateOf("")
    val contrasena: State<String> = _contrasena

    private val _correoValido = mutableStateOf(true)
    val correoValido: State<Boolean> = _correoValido

    private val _contrasenaValida = mutableStateOf(true)
    val contrasenaValida: State<Boolean> = _contrasenaValida

    fun verficacionCorreo(nuevo: String){
        _correo.value = nuevo
        _correoValido.value = nuevo.contains("@") && nuevo.contains(".com")
    }
    fun verificacionContrasena(nuevo: String){
        _contrasena.value = nuevo
        _contrasenaValida.value = nuevo.length >= 6
    }
    fun camposValidos(): Boolean{
        return _correoValido.value && _contrasenaValida.value
    }

}