package com.example.project_1.view.ActivityOne

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project_1.Horizontal

@Composable
fun Navegar(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "horizontal"
    ) {
        composable("horizontal") {
            Horizontal(navController)
        }
        composable("vistaone") {
            VistaOne(navController)
        }
        composable("vistatwo") {
            VistaTwo(navController)
        }
        composable("vistathree") {
            VistaThree(navController)
        }
        composable("registro"){
            Registro(navController)
        }
        composable("login"){
            Login(navController)
        }
    }
}
