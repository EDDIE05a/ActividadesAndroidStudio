package com.example.project_1.view.ParteDos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.lifecycle.DEFAULT_ARGS_KEY

@Composable
fun TemaDinamico(){
    var isDarkTheme by rememberSaveable { mutableStateOf(false) }
    val colorScheme = if (isDarkTheme) darkColorScheme() else lightColorScheme()
    MaterialTheme ( colorScheme = colorScheme) {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Hey")
            Button(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary),
                onClick = {isDarkTheme = !isDarkTheme}
            ) {
                Text(text = "Cambiar Tema")
            }
        }

    }

}