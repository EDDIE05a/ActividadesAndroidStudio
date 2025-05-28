package com.example.project_1.view.ActivityViewModel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.viewmodel.ClassEjercicio4

@Composable
fun Ejercicio4(viewModel: ClassEjercicio4 = viewModel()) {
    val isDarkTheme by viewModel.isDarkTheme

    val backgroundColor = if (isDarkTheme) Color.Black else Color.White
    val textColor = if (isDarkTheme) Color.White else Color.Black

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = { viewModel.toggleTheme() }) {
            Text(
                text = if (isDarkTheme) "Cambiar a tema claro" else "Cambiar a tema oscuro",
                color = textColor
            )
        }
    }
}
