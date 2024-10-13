package com.example.asm_ph45931.Account


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.asm_ph45931.R
import com.example.asm_ph45931.ui.theme.Asm_PH45931Theme


class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Asm_PH45931Theme {
                PreviewSplash()
            }
        }
    }
}

@Composable
fun Splash() {
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "main image",
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(40.dp)
    )
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSplash() {
    Asm_PH45931Theme {
        Splash()
    }
}