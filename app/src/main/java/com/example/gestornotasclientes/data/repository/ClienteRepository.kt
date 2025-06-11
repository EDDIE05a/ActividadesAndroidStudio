package com.example.gestornotasclientes.data.repository

import com.example.gestornotasclientes.data.local.Cliente
import com.example.gestornotasclientes.data.local.ClienteConNotas
import com.example.gestornotasclientes.data.local.ClienteDao

class ClienteRepository(private val clienteDao: ClienteDao) {

    suspend fun insertarCliente(cliente: Cliente) {
        clienteDao.insertar(cliente)
    }

    suspend fun eliminarCliente(cliente: Cliente) {
        clienteDao.eliminar(cliente)
    }

    suspend fun obtenerClientes(): List<Cliente> {
        return clienteDao.obtenerTodos()
    }

    suspend fun obtenerClienteConNotas(clienteId: Int): ClienteConNotas {
        return clienteDao.obtenerConNotas(clienteId)
    }
}
