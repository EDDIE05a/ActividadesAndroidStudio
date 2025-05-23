package com.example.project_1.view.ActivityOne

import androidx.compose.foundation.Image
import com.example.project_1.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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

@Composable
fun VistaTwo(navController: NavHostController) {
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
            painter = painterResource(R.drawable.metricas),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
        )

        // Texto 1
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "For cabin crew who want",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "to train students",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }

        // Texto 2
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Share your knowledge with")
            Text(text = "students, recruit students and")
            Text(text = "earn money on it")
        }
    }
}
