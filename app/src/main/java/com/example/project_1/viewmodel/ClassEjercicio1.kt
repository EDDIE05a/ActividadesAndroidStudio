package com.example.project_1.viewmodel
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ClassEjercicio1: ViewModel(){
    private val _contador = mutableStateOf(0)
    val contador: State<Int> = _contador

    fun incrementar(){
        _contador.value++
    }
    fun decrementar(){
        _contador.value--
    }
}