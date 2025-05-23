package com.example.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project_1.ui.theme.Project_1Theme
import com.example.project_1.view.ActivityOne.Navegar
import com.example.project_1.view.ActivityOne.VistaOne
import com.example.project_1.view.ActivityOne.VistaThree
import com.example.project_1.view.ActivityOne.VistaTwo
import com.example.project_1.view.ParteDos.Navigate
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                Navegar()
            }
        }
    }
}

@Composable
fun Horizontal(navController: NavHostController) {
    val pagerState = rememberPagerState(pageCount = { 3 })

    LaunchedEffect(Unit) {
        while (true) {
            delay(3000L)
            val nextPage = (pagerState.currentPage + 1) % 3
            pagerState.animateScrollToPage(nextPage)
        }
    }

    Column {
        HorizontalPager(state = pagerState) { page ->
            when (page) {
                0 -> VistaOne(navController)
                1 -> VistaTwo(navController)
                2 -> VistaThree(navController)
                else -> Text(text = "No se encontró ventana")
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp, horizontal = 10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            repeat(3) { i ->
                Box(
                    modifier = Modifier
                        .size(10.dp)
                        .padding(horizontal = 1.dp)
                        .background(
                            if (pagerState.currentPage == i) Color.Black else Color.LightGray.copy(alpha = 0.5f),
                            shape = CircleShape
                        )
                )
            }
        }
    }
}


// Scroll horizontal de vistas

//@Composable
//fun PrimeraVentana(){
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(0xffb6a7a4)),
//    ){
//        Text(text = "Hola desde ventana 1",
//            modifier = Modifier.align(Alignment.Center)
//        )
//    }
//}
//@Composable
//fun SegundaVentana(){
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(0xfff882fa)),
//    ){
//        Text(text = "Hola desde ventana 2",
//            modifier = Modifier.align(Alignment.Center)
//        )
//    }
//}
//@Composable
//fun TerceraVentana(){
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(0xff02b98d)),
//    ){
//        Text(text = "Hola desde ventana 3",
//            modifier = Modifier.align(Alignment.Center)
//        )
//    }
//}

@Preview
@Composable
fun GreetingPreview() {
    Project_1Theme {

    }
}

