package com.example.project_1.view.ActivityViewModel

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.viewmodel.ClassEjercicio6

@Composable
fun Ejercicio6() {
    val validator = remember { ClassEjercicio6() }
    val context = LocalContext.current

    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    val nameValid = validator.isNameValid(name)
    val emailValid = validator.isEmailValid(email)
    val passwordValid = validator.isPasswordValid(password)
    val passwordsMatch = validator.doPasswordsMatch(password, confirmPassword)

    val formValid = nameValid && emailValid && passwordValid && passwordsMatch

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nombre") },
            isError = !nameValid,
            modifier = Modifier.fillMaxWidth()
        )
        if (!nameValid) Text("El nombre no puede estar vacío", color = Color.Red, fontSize = 12.sp)

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Correo") },
            isError = !emailValid,
            modifier = Modifier.fillMaxWidth()
        )
        if (!emailValid) Text("Correo inválido", color = Color.Red, fontSize = 12.sp)

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            isError = !passwordValid,
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        if (!passwordValid) Text("Mínimo 6 caracteres", color = Color.Red, fontSize = 12.sp)

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text("Confirmar Contraseña") },
            isError = !passwordsMatch,
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        if (!passwordsMatch) Text("Las contraseñas no coinciden", color = Color.Red, fontSize = 12.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { Toast.makeText(context, "Formulario válido", Toast.LENGTH_SHORT).show() },
            enabled = formValid,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Registrar")
        }
    }
}
