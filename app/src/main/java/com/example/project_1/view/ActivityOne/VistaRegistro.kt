package com.example.project_1.view.ActivityOne

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Registro(navController: NavHostController){
    // Estados locales para nombre, apellido, email y contraseña
    var name by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Margen interno
        verticalArrangement = Arrangement.Center, // Centrado vertical
        horizontalAlignment = Alignment.CenterHorizontally // Centrado horizontal
    ) {
        // Título
        Text(text = "Registro")


        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Blue,
                cursorColor = Color.Blue,
                focusedLabelColor = Color.Blue
            )
        )

        OutlinedTextField(
            value = lastname,
            onValueChange = { lastname = it },
            label = { Text("Apellido") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Blue,
                cursorColor = Color.Blue,
                focusedLabelColor = Color.Blue
            )
        )
        // Campo de email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Correo electrónico") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Blue,
                cursorColor = Color.Blue,
                focusedLabelColor = Color.Blue
            )
        )

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre campos

        // Campo de contraseña
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Blue,
                cursorColor = Color.Blue,
                focusedLabelColor = Color.Blue
            )
        )

        Spacer(modifier = Modifier.height(24.dp)) // Espacio antes del botón

        // Botón de registrarse
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent // fondo transparente
            ),
            border = BorderStroke(2.dp, Color.Blue),
            contentPadding = PaddingValues(vertical = 10.dp)
        ) {
            Text(text = "Registrarse",
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
    }
}