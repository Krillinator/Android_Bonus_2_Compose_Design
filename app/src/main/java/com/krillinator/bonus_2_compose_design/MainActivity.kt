package com.krillinator.bonus_2_compose_design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.krillinator.bonus_2_compose_design.ui.theme.Bonus_2_Compose_DesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bonus_2_Compose_DesignTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ParentPreview()
                }
            }
        }
    }
}


@Composable
fun ChildA() {
    Text(text = "Child A")
}

@Composable
@Preview(showBackground = true)
fun ChildB() {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Box(
            modifier = Modifier
                .background(color = Color.Yellow)
                .size(45.dp)
        ) {
            Text(text = "Hello")
            Icon(
                imageVector = Icons.Outlined.Add,
                contentDescription = "",
                modifier = Modifier.align(Alignment.BottomEnd)
            )
        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(25.dp)
                .background(color = Color.LightGray)
                .size(120.dp)
        ) {
            Text(text = "Child B")
            Text(text = "Child B")
            Text(text = "Child B")
        }
    }
}

@Composable
@Preview
fun ChildC() {

    // TODO - Add to slide

    Text(
        text = "Child C",
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Cyan)
            .padding(12.dp)
    )
}

@Composable
@Preview(showBackground = true)
fun ParentPreview() {
    Bonus_2_Compose_DesignTheme {

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ChildA()
                ChildB()
                ChildC()
            }
        }

    }
}