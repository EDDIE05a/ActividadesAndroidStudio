package com.example.project_1.view.ParteDos

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.project_1.Horizontal

@Composable
fun Navigate(){
    val navController = rememberNavController()
    Horizontal(navController = navController)
    NavHost(
        navController = navController,
        startDestination = "home",
//        enterTransition = {
//            slideInHorizontally(
//                animationSpec = tween(300)
//            )
//        }
        enterTransition = {
            slideInHorizontally(
                initialOffsetX = {it},
                animationSpec = tween(800)
            )
        }

    ){
        composable("home") {
            Home(navController)
        }

        composable(route = "info/{nombre}",
            arguments = listOf(navArgument("nombre"){
                type = NavType.StringType
            }))
        { data ->
            val nombre = data.arguments?.getString("nombre")
            Info(navController = navController, nombre)
        }

        composable("detalles") {
            Detalles(navController)
        }
    }
}