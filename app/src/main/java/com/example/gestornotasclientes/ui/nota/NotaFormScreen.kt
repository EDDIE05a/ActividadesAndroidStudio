package com.example.gestornotasclientes.ui.nota

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gestornotasclientes.data.local.Nota
import com.example.gestornotasclientes.viewmodel.NotaViewModel

@Composable
fun NotaFormScreen(
    notaId: Int?, // Si es null, es nueva nota
    clienteId: Int,
    notaViewModel: NotaViewModel,
    onNotaGuardada: () -> Unit
) {
    val notaExistente = notaId?.let { notaViewModel.obtenerNotaPorId(it) }

    // Estados del formulario
    var fecha by remember { mutableStateOf(notaExistente?.fecha ?: "") }
    var contenido by remember { mutableStateOf(notaExistente?.contenido ?: "") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = if (notaId == null) "Nueva Nota" else "Editar Nota")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = fecha,
            onValueChange = { fecha = it },
            label = { Text("Fecha") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = contenido,
            onValueChange = { contenido = it },
            label = { Text("Contenido") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val nuevaNota = Nota(
                    id = notaId ?: 0, // el ID se ignora si se inserta
                    clienteId = clienteId,
                    fecha = fecha,
                    contenido = contenido
                )
                if (notaId == null) {
                    notaViewModel.agregarNota(nuevaNota, clienteId)
                } else {
                    notaViewModel.actualizarNota(nuevaNota, clienteId)
                }
                onNotaGuardada()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Guardar Nota")
        }
    }
}
