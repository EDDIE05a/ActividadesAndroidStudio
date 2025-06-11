package com.example.gestornotasclientes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.gestornotasclientes.data.local.AppDatabase
import com.example.gestornotasclientes.data.repository.NotaRepository
import com.example.gestornotasclientes.ui.navigation.AppNavGraph
import com.example.gestornotasclientes.ui.theme.GestorNotasTheme
import com.example.gestornotasclientes.viewmodel.ClienteViewModel
import com.example.gestornotasclientes.viewmodel.ClienteViewModelFactory
import com.example.gestornotasclientes.viewmodel.NotaViewModel
import com.example.gestornotasclientes.viewmodel.NotaViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            GestorNotasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Inicializar base de datos y repository
                    val database = AppDatabase.getDatabase(this@MainActivity)
                    val repository = NotaRepository(
                        clienteDao = database.clienteDao(),
                        notaDao = database.notaDao()
                    )

                    // Crear ViewModels con Factory
                    val clienteViewModel: ClienteViewModel = viewModel(
                        factory = ClienteViewModelFactory(repository)
                    )
                    val notaViewModel: NotaViewModel = viewModel(
                        factory = NotaViewModelFactory(repository)
                    )

                    // Configurar navegación
                    val navController = rememberNavController()

                    AppNavGraph(
                        navController = navController,
                        clienteViewModel = clienteViewModel,
                        notaViewModel = notaViewModel
                    )
                }
            }
        }
    }
}
