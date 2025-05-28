package com.example.project_1.view.ActivityViewModel

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.viewmodel.ClassEjercicio3

@Composable
fun Ejercicio3(viewModel: ClassEjercicio3 = viewModel()) {
    val numero by viewModel.numero
    val esValido by viewModel.esValido

    val colorBorde = if (esValido) Color.Green else Color.Red

    val colores = TextFieldDefaults.colors(
        focusedIndicatorColor = colorBorde,
        unfocusedIndicatorColor = colorBorde,
        cursorColor = colorBorde,
        focusedLabelColor = colorBorde,
        unfocusedLabelColor = colorBorde,
        focusedContainerColor = Color.Transparent,
        unfocusedContainerColor = Color.Transparent
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = numero,
            onValueChange = { viewModel.onNumeroChange(it) },
            label = { Text("Número de teléfono") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = colores,
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { viewModel.validar() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Validar")
        }

        if (!esValido) {
            Spacer(modifier = Modifier.height(8.dp))
            Text("Debe tener exactamente 10 dígitos", color = Color.Red)
        }
    }
}
