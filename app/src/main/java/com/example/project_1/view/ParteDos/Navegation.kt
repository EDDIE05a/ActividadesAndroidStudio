//package com.example.project_1.view.ParteDos
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//
//@Composable
//
//fun Navigate(){
//    val navController = rememberNavController()
//
//    NavHost(
//        navController = navController,
//        startDestination = "home"
//    ){
//        composable("home") {
//            Home(navController)
//        }
//        composable("info") {
//            Info(navController)
//        }
//        composable("detalles") {
//            Detalles(navController)
//        }
//    }
//}