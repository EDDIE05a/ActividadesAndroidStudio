package com.example.project_1.view.ActivityOne

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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
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
fun VistaOne(navController: NavHostController) {
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
//            painter = painterResource(R.drawable.ic_launcher_parceroconpc),
//            contentDescription = null,
//            modifier = Modifier
//                .padding(25.dp)
//                .size(380.dp)
//        )
        Column(
            modifier = Modifier
                .padding(horizontal = 2.dp)
                .width(360.dp)
                .height(60.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "For students who want to \nbecome fight attendants",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
        Column ( modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 15.dp)
            .width(380.dp)
            .height(60.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Communicate with attendants",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "and find out useful information that",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "will help you fulfill your dream",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Composable
fun Horizontal(){
    val pagerState = rememberPagerState(pageCount = {3})
    HorizontalPager(state = pagerState){ page ->
        when(page){
            0 -> VistaOne(navController)
            1 -> VistaTwo(navController)
            2 -> VistaThree(navController)
            else -> Text(text = "No se encontro ventana")
        }
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 60.dp, horizontal = 30.dp),
        horizontalArrangement = Arrangement.Center
    ){
        repeat (3){ i ->
            Box(
                modifier = Modifier
                    .size(10.dp)
                    .padding(horizontal = 2.dp)
                    .background(if(pagerState.currentPage == i) Color.Black else Color.LightGray.copy(alpha = 0.5f),
                        shape = CircleShape)
            ){

            }

        }
    }
}

