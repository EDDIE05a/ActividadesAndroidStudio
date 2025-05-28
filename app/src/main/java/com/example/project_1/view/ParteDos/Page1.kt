package com.example.project_1.view.ParteDos

import android.content.res.Configuration
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun orientation(): Boolean {
    val configuration = LocalConfiguration.current
    val maxwidht = configuration.screenWidthDp
    val maxheight = configuration.screenHeightDp
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            return true
        }

        Configuration.ORIENTATION_PORTRAIT -> {
            return false
        }

        else -> {
            return false
        }
    }
    /* BoxWithConstraints{
        if (maxWidth > 600.dp) {
            print("Es una tablet")
        } else if (maxWidth > 700.dp) {
            print("Es una computador")
        } else {
            print("Es un movil")
        }
    } */
}



@Composable
fun Home(navController: NavHostController) {

    var data by rememberSaveable { mutableStateOf("") }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text("Hola desde Page 1")
            TextField(
                value = data,
                onValueChange = { data = it },
                label = { Text ("Nombre")}
            )
            Button(onClick = {navController.navigate("info/$data")}) {
                Text("Ir Page 2",
                    color = if(orientation() == true){
                        Color(0xFFf882fa)
                    }
                    else{
                        Color(0xFF06251a)
                    }
                )
            }
        }
    }
}