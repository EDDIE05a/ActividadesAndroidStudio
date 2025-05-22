package com.example.project_1.view.ActivityOne

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun VistaThree(navController: NavHostController) {
//    Column (modifier = Modifier
//        .padding(25.dp)
//        .width(300.dp)
//        .height(60.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "bibi", fontSize = 60.sp, fontWeight = FontWeight.Bold)
//    }
    //---------------------------------------------------------------------
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround)
    {
//        Image(
//            painter = painterResource(R.drawable.maki),
//            contentDescription = null,
//            modifier = Modifier
//                .padding(horizontal = 25.dp)
//                .size(500.dp)
//        )
        Column ( modifier = Modifier
            .padding(bottom = 45.dp)
            .width(350.dp)
            .height(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Get Started!",
                fontSize = 25.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier
                .padding(25.dp)
                .width(350.dp)
                .height(60.dp)
                .border(width = 2.dp,color = Color.Blue, shape = RoundedCornerShape(50)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Registration",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }

        Column ( modifier = Modifier
            .width(380.dp)
            .height(60.dp)
            .padding(bottom = 25.dp),
        ) {
            Text(
                text = "Already have an account?",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Login",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            )

        }
    }
}