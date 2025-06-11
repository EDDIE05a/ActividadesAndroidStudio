package com.example.gestornotasclientes.data.local

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "notas",
    foreignKeys = [ForeignKey(
        entity = Cliente::class,
        parentColumns = ["id"],
        childColumns = ["clienteId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index(value = ["clienteId"])]
)
data class Nota(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val contenido: String,
    val fecha: String,
    val clienteId: Int
)
