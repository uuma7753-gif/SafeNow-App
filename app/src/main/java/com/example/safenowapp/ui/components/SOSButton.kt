package com.example.safenowapp.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp

@Composable
fun SOSButton(
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier.padding(all = 16.dp),
        onClick = onClick
    ) {
        Text(text = "SOS")
    }
}
