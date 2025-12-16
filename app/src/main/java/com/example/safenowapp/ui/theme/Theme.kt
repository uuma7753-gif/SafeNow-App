package com.example.safenowapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// Light color set
private val LightColors = lightColorScheme(
    primary = Purple40,
    secondary = Purple80
)

@Composable
fun SafeNowTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = AppTypography,
        content = content
    )
}
