package com.example.project_1.view
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy. LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Scroll(){
    LazyColumn(modifier = Modifier.fillMaxSize()
    ) {
        items(80) { index ->
            Box (
                modifier = Modifier
                    .width(300.dp)
                    .height(20.dp)
                    .background(color = if(index % 2 == 0) Color.Blue else Color.Red)
            ){
                Text(text = "Hola a todos $index", modifier = Modifier
                    .align(Alignment.Center))
            }
        }
    }
}

