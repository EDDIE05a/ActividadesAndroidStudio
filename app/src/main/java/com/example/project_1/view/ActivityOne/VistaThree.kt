package com.example.project_1.view.ActivityOne

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.project_1.R

@Composable
fun VistaThree(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título
        Text(
            text = "bibi",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold
        )

        // Imagen
        Image(
            painter = painterResource(R.drawable.maki),
            contentDescription = null,
            modifier = Modifier.size(300.dp) // ajustado para que no se corte en pantallas pequeñas
        )

        // Texto: Get Started!
        Text(
            text = "Get Started!",
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        // Botón Registration
        Button(
            onClick = { navController.navigate("registro") },
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(60.dp),
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent // fondo transparente
            ),
            border = BorderStroke(2.dp, Color.Blue),
            contentPadding = PaddingValues(vertical = 10.dp)
        ) {
            Text(
                text = "Registration",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }


        // Texto inferior: Login
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Already have an account?")
            Text(
                text = "Login",
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    navController.navigate("login") // <- o el nombre de la vista que tengas
                }
            )
        }
    }
}
