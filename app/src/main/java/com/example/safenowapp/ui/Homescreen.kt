package com.example.safenowapp.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.safenowapp.ui.components.SOSButton

@Composable
fun HomeScreen(
    onSosClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Home")   // unga title / UI
        Spacer(modifier = Modifier.height(24.dp))

        SOSButton(onClick = onSosClick)
    }
}
