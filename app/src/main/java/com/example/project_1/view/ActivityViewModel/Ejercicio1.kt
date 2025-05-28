package com.example.project_1.view.ActivityViewModel

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.viewmodel.ClassEjercicio1

// 1. Contador básico con ViewModel
@Composable
fun Ejercicio1(viewModel: ClassEjercicio1 = viewModel()) {

    // Se crean variables para: 1) Traer el valor del estado contador 2) Cambiar el color segun el resultado del modulo
    val numero = viewModel.contador.value
    val color = if (numero % 2 == 0) Color.Green else Color.Red

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Text(
            text = numero.toString(),
            color = color,
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = { viewModel.decrementar() }) {
                Text("-")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(onClick = { viewModel.incrementar() }) {
                Text("+")
            }
        }
    }
}