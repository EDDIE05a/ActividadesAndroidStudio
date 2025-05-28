package com.example.project_1.view.ActivityOne

import androidx.compose.foundation.Image
import com.example.project_1.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
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
fun VistaOne(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp) // espacio entre items
    ) {
        item {
            // Título principal
            Text(
                text = "bibi",
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
            )
        }

        item {
            // Imagen principal
            Image(
                painter = painterResource(R.drawable.ic_launcher_parceroconpc),
                contentDescription = null,
                modifier = Modifier
                    .size(280.dp)
                    .padding(top = 16.dp)
//                    .align(Alignment.CenterHorizontally),
            )
        }

        item {
            // Subtítulo
            Text(
                text = "For students who want to\nbecome flight attendants",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                lineHeight = 24.sp
            )
        }

        item {
            // Descripción secundaria
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Communicate with attendants")
                Text(text = "and find out useful information that")
                Text(text = "will help you fulfill your dream")
            }
        }
    }
}



