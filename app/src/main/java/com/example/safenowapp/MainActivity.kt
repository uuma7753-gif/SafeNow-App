package com.example.safenowapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.safenowapp.ui.theme.SafeNowAppTheme
import com.example.safenowapp.navigation.AppNavGraph
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafeNowAppTheme {
                AppNavGraph()
            }
        }
    }
}
