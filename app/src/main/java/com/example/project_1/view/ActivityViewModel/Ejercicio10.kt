package com.example.project_1.view.ActivityViewModel

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.viewmodel.ClassEjercicio10

@Composable
fun Ejercicio10() {
    val vm: ClassEjercicio10 = viewModel()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { vm.simularCarga() },
            enabled = !vm.estaCargando.value,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(vm.estadoTexto.value)
        }
    }
}
