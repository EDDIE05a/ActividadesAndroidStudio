package com.example.gestornotasclientes.data.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ClienteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertar(cliente: Cliente)

    @Delete
    suspend fun eliminar(cliente: Cliente)

    @Query("SELECT * FROM clientes")
    suspend fun obtenerTodos(): List<Cliente>

    @Transaction
    @Query("SELECT * FROM clientes WHERE id = :clienteId")
    suspend fun obtenerConNotas(clienteId: Int): ClienteConNotas
}
