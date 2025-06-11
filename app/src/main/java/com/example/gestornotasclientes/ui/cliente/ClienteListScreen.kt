package com.example.gestornotasclientes.ui.cliente

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.gestornotasclientes.data.local.Cliente
import com.example.gestornotasclientes.viewmodel.ClienteViewModel

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ClienteListScreen(
    viewModel: ClienteViewModel,
    onAgregarCliente: () -> Unit,
    onSeleccionarCliente: (Cliente) -> Unit
) {
    val clientes by viewModel.clientes

    LaunchedEffect(Unit) {
        viewModel.cargarClientes()
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Clientes") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onAgregarCliente) {
                Icon(Icons.Default.Add, contentDescription = "Agregar Cliente")
            }
        }
    ) { padding ->
        LazyColumn(contentPadding = padding) {
            items(clientes) { cliente ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { onSeleccionarCliente(cliente) },
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = cliente.nombre, style = MaterialTheme.typography.titleMedium)
                        Text(text = cliente.correo, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}
