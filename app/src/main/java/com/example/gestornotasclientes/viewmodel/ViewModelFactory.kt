package com.example.gestornotasclientes.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.gestornotasclientes.data.repository.NotaRepository

class ViewModelFactory(private val repository: NotaRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(ClienteViewModel::class.java) ->
                ClienteViewModel(repository) as T
            modelClass.isAssignableFrom(NotaViewModel::class.java) ->
                NotaViewModel(repository) as T
            else -> throw IllegalArgumentException("ViewModel desconocido")
        }
    }
}
