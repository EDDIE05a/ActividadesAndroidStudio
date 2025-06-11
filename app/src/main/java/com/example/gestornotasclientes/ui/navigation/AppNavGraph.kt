package com.example.gestornotasclientes.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.gestornotasclientes.ui.cliente.ClienteFormScreen
import com.example.gestornotasclientes.ui.cliente.ClienteListScreen
import com.example.gestornotasclientes.ui.nota.NotaFormScreen
import com.example.gestornotasclientes.ui.nota.NotaListScreen
import com.example.gestornotasclientes.viewmodel.ClienteViewModel
import com.example.gestornotasclientes.viewmodel.NotaViewModel

@Composable
fun AppNavGraph(
    navController: NavHostController,
    clienteViewModel: ClienteViewModel,
    notaViewModel: NotaViewModel
) {
    NavHost(navController = navController, startDestination = "clientes") {

        composable("clientes") {
            ClienteListScreen(
                clienteViewModel = clienteViewModel,
                onAgregarCliente = { navController.navigate("cliente_form") },
                onSeleccionarCliente = { cliente ->
                    navController.navigate("notas/${cliente.id}/${cliente.nombre}")
                }
            )
        }

        composable("cliente_form") {
            ClienteFormScreen(
                clienteViewModel = clienteViewModel,
                onClienteAgregado = { navController.popBackStack() }
            )
        }

        composable(
            route = "notas/{clienteId}/{clienteNombre}",
            arguments = listOf(
                navArgument("clienteId") { type = NavType.IntType },
                navArgument("clienteNombre") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val clienteId = backStackEntry.arguments?.getInt("clienteId") ?: 0
            val clienteNombre = backStackEntry.arguments?.getString("clienteNombre") ?: ""

            NotaListScreen(
                clienteId = clienteId,
                clienteNombre = clienteNombre,
                notaViewModel = notaViewModel,
                clienteViewModel = clienteViewModel,
                onNavigateBack = { navController.popBackStack() },
                onNavigateToForm = { notaId, clienteId ->
                    navController.navigate("nota_form/${notaId ?: -1}/$clienteId")
                }
            )
        }

        composable(
            route = "nota_form/{notaId}/{clienteId}",
            arguments = listOf(
                navArgument("notaId") { type = NavType.IntType },
                navArgument("clienteId") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val notaId = backStackEntry.arguments?.getInt("notaId") ?: -1
            val clienteId = backStackEntry.arguments?.getInt("clienteId") ?: 0

            NotaFormScreen(
                notaId = if (notaId == -1) null else notaId,
                clienteId = clienteId,
                notaViewModel = notaViewModel,
                onNotaGuardada = { navController.popBackStack() }
            )
        }
    }
}
