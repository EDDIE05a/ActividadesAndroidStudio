package com.example.gestornotasclientes.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.example.gestornotasclientes.data.local.Cliente
import kotlinx.coroutines.launch
import com.example.gestornotasclientes.data.local.Nota
import com.example.gestornotasclientes.data.repository.NotaRepository

class NotaViewModel(private val repository: NotaRepository) : ViewModel() {

    private val _clienteActual = mutableStateOf<Cliente?>(null)
    val clienteActual: State<Cliente?> = _clienteActual

    private val _notas = mutableStateOf<List<Nota>>(emptyList())
    val notas: State<List<Nota>> = _notas

    fun setClienteActual(cliente: Cliente) {
        _clienteActual.value = cliente
    }

    fun cargarNotas(clienteId: Int) {
        viewModelScope.launch {
            _notas.value = repository.obtenerNotasPorCliente(clienteId)
        }
    }

    fun agregarNota(nota: Nota, clienteId: Int) {
        viewModelScope.launch {
            repository.insertarNota(nota)
            cargarNotas(clienteId)
        }
    }

    fun eliminarNota(nota: Nota, clienteId: Int) {
        viewModelScope.launch {
            repository.eliminarNota(nota)
            cargarNotas(clienteId)
        }
    }

    fun actualizarNota(nota: Nota, clienteId: Int) {
        viewModelScope.launch {
            repository.actualizarNota(nota)
            cargarNotas(clienteId)
        }
    }


    fun obtenerNotaPorId(notaId: Int): Nota? {
        return _notas.value.find { it.id == notaId }
    }

}
