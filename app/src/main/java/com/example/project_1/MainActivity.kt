package com.example.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project_1.ui.theme.Project_1Theme
import com.example.project_1.view.Scroll
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                Scroll()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}

//------------------------------------------


//------------------------------------------
@Composable
fun Base(){
    Row (modifier = Modifier.fillMaxWidth().padding(0.5.dp),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Texto (text = "A", Modifier.width(50.dp))
        Texto (text = "A", Modifier.width(50.dp))
    }
    Row (modifier = Modifier.fillMaxHeight().padding(all = 50.dp),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Texto (text = "A", Modifier.width(1100.dp))
    }
    Row (modifier = Modifier.fillMaxWidth().padding(80.dp),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Texto (text = "A", Modifier.width(10.dp))
        Texto (text = "A", Modifier.width(10.dp))
    }
}


// Ingresar imagen sgv a proyecto
@Composable
fun Body(){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround)
    {
        Image(
            painter = painterResource(R.drawable.ic_launcher_card),
            contentDescription = null
        )
    }
}


@Composable
fun Texto(text: String, modifier: Modifier){
    Text(text = text, modifier = modifier, textAlign = TextAlign.Center)
}

@Preview (showSystemUi = true, showBackground = true)
@Composable
fun GreatingPreview(){
    Project_1Theme {
        Scroll()
    }
}