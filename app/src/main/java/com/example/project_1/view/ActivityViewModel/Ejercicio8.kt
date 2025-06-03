package com.example.project_1.view.ActivityViewModel

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.viewmodel.ClassEjercicio8

@Composable
fun Ejercicio8() {
    val validador = remember { ClassEjercicio8() }
    var texto by remember { mutableStateOf("") }

    val dentroLimite = validador.estaDentroDelLimite(texto)
    val contadorTexto = validador.contarCaracteres(texto)

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        OutlinedTextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("Escribe algo...") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = contadorTexto,
            color = if (dentroLimite) Color.Gray else Color.Red,
            fontSize = 14.sp
        )
    }
}
