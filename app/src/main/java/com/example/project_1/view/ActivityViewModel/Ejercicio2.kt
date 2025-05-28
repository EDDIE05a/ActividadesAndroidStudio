package com.example.project_1.view.ActivityViewModel

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.viewmodel.ClassEjercicio2

@Composable
fun Ejercicio2(viewModel: ClassEjercicio2 = viewModel()) {
    val correo by viewModel.correo
    val contrasena by viewModel.contrasena
    val correoValido by viewModel.correoValido
    val contrasenaValida by viewModel.contrasenaValida

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = correo,
            onValueChange = { viewModel.verficacionCorreo(it) },
            label = { Text("Correo") },
            isError = !correoValido,
            modifier = Modifier.fillMaxWidth()
        )
        if (!correoValido) {
            Text("Correo inválido", color = Color.Red, style = MaterialTheme.typography.bodySmall)
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = contrasena,
            onValueChange = { viewModel.verificacionContrasena(it) },
            label = { Text("Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            isError = !contrasenaValida,
            modifier = Modifier.fillMaxWidth()
        )
        if (!contrasenaValida) {
            Text("Contraseña debe tener al menos 6 caracteres", color = Color.Red, style = MaterialTheme.typography.bodySmall)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Por el momento nada xd */ },
            enabled = viewModel.camposValidos(),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Iniciar sesión")
        }
    }
}