package com.example.project_1.view.ActivityViewModel


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.viewmodel.ClassEjercicio5

@Composable
fun Ejercicio5(viewModel: ClassEjercicio5 = viewModel()) {
    val password by viewModel.password
    val fortaleza = viewModel.obtenerFortaleza()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = password,
            onValueChange = { viewModel.onPasswordChange(it) },
            label = { Text("Contraseña") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Fortaleza: ${fortaleza.label}",
            color = fortaleza.color
        )
    }
}
