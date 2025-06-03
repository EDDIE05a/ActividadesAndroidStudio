package com.example.project_1.view.ActivityViewModel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.viewmodel.ClassEjercicio7

@Composable
fun Ejercicio7() {
    val tareasViewModel: ClassEjercicio7 = viewModel()

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        Text("Lista de Tareas", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn {
            items(tareasViewModel.listaTareas) { tarea ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                        .background(
                            if (tarea.completada) Color(0xFFD0F0C0) else Color(0xFFFFF8DC)
                        ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(tarea.titulo)
                        Checkbox(
                            checked = tarea.completada,
                            onCheckedChange = { isChecked ->
                                tareasViewModel.cambiarEstado(tarea.id, isChecked)
                            }
                        )
                    }
                }
            }
        }
    }
}
