package com.example.safenowapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.safenowapp.navigation.AppNavGraph
import com.example.safenowapp.ui.theme.SafeNowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafeNowApp()
        }
    }
}

@Composable
fun SafeNowApp() {
    val navController = rememberNavController()
    SafeNowTheme {
        AppNavGraph(navController = navController)
    }
}
