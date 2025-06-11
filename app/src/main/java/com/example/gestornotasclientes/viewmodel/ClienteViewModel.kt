package com.example.gestornotasclientes.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import kotlinx.coroutines.launch
import com.example.gestornotasclientes.data.local.Cliente
import com.example.gestornotasclientes.data.repository.ClienteRepository

class ClienteViewModel(private val repository: ClienteRepository) : ViewModel() {

    private val _clientes = mutableStateOf<List<Cliente>>(emptyList())
    val clientes: State<List<Cliente>> = _clientes

    fun cargarClientes() {
        viewModelScope.launch {
            _clientes.value = repository.obtenerClientes()
        }
    }

    fun agregarCliente(cliente: Cliente) {
        viewModelScope.launch {
            repository.insertarCliente(cliente)
            cargarClientes()
        }
    }

    fun eliminarCliente(cliente: Cliente) {
        viewModelScope.launch {
            repository.eliminarCliente(cliente)
            cargarClientes()
        }
    }
}

