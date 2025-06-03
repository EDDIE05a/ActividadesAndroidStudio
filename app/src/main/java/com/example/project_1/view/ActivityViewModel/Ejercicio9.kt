package com.example.project_1.view.ActivityViewModel

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext
import com.example.project_1.viewmodel.ClassEjercicio9

@Composable
fun Ejercicio9() {
    val validador = remember { ClassEjercicio9() }
    var email by remember { mutableStateOf("") }
    val esValido = validador.esCorreoValido(email)

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Correo electrónico") },
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = {
                if (email.isNotEmpty()) {
                    Icon(
                        imageVector = if (esValido) Icons.Default.CheckCircle else Icons.Default.Clear,
                        contentDescription = null,
                        tint = if (esValido) Color.Green else Color.Red
                    )
                }
            },
            isError = email.isNotEmpty() && !esValido
        )
    }
}
