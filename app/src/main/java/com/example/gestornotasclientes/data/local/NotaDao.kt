package com.example.gestornotasclientes.data.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface NotaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertar(nota: Nota)

    @Update
    suspend fun actualizar(nota: Nota)

    @Query("SELECT * FROM notas WHERE clienteId = :clienteId")
    suspend fun obtenerPorClienteFlow(clienteId: Int): Flow<List<Nota>>

    @Delete
    suspend fun eliminar(nota: Nota)

    @Query("SELECT * FROM notas WHERE clienteId = :clienteId")
    suspend fun obtenerPorCliente(clienteId: Int): List<Nota>
}
