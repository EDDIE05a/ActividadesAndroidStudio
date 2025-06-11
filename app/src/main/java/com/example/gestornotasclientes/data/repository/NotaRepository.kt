package com.example.gestornotasclientes.data.repository

import com.example.gestornotasclientes.data.local.*
import kotlinx.coroutines.flow.Flow

class NotaRepository(
    private val clienteDao: ClienteDao,
    private val notaDao: NotaDao
) {

    suspend fun insertarNota(nota: Nota) {
        notaDao.insertar(nota)
    }

    suspend fun eliminarNota(nota: Nota) {
        notaDao.eliminar(nota)
    }

    suspend fun obtenerNotasPorClienteFlow(clienteId: Int): Flow<List<Nota>> {
        return notaDao.obtenerPorClienteFlow(clienteId)
    }


    suspend fun actualizarNota(nota: Nota) {
        notaDao.actualizar(nota)
    }

    suspend fun obtenerNotasPorCliente(clienteId: Int): List<Nota> {
        return notaDao.obtenerPorCliente(clienteId)
    }
}
