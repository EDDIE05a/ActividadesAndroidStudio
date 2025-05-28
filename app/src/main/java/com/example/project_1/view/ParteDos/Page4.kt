package com.example.project_1.view.ParteDos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.viewmodel.ViewModel2

@Composable
fun Formulario(viewModel: ViewModel2 = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column {
            OutlinedTextField(
                value = viewModel.nombre,
                onValueChange = { viewModel.nombre = it},
                label = { Text("Nombre")}
            )
            OutlinedTextField(
                value = viewModel.edad,
                onValueChange = {viewModel.edad = it},
                label = { Text("Ingrese su edad") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )
            OutlinedTextField(
                value = viewModel.password,
                onValueChange = { viewModel.edad = it},
                label = { Text("Contraseña")},
                singleLine = true,
                visualTransformation = PasswordVisualTransformation()
            )

            Text(text = "Altura")
            OutlinedTextField(
                value = viewModel.altura.toString(),
                onValueChange = { viewModel.altura = it.toFloat() },
                label = { Text(text = "Altura")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )

            Text("Acepto los terminos y condiciones")
            Checkbox(checked = viewModel.terminos,
                onCheckedChange = { viewModel.terminos = it })
            Text("Genero")

            repeat(viewModel.generos.size){

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    RadioButton(selected = viewModel.genero == viewModel.generos[it],
                        onClick = {viewModel.genero = viewModel.generos[it]}
                    )
                    Text(viewModel.generos[it])
                }
            }
            Text(viewModel.genero)
            Button(
                onClick = { viewModel.guardar()}
            ) {
                Text("Guardar")
            }

        }
    }
}