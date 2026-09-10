package com.example.ubimytherapist

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    var storeHistory by remember { mutableStateOf(true) }
    var enableWearableData by remember { mutableStateOf(false) }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "Settings",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            Text(
                text = "Data & Privacy",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Store conversation history", style = MaterialTheme.typography.bodyLarge)
                Switch(
                    checked = storeHistory,
                    onCheckedChange = { storeHistory = it }
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Enable wearable data", style = MaterialTheme.typography.bodyLarge)
                Switch(
                    checked = enableWearableData,
                    onCheckedChange = { enableWearableData = it }
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { /* Non-functional */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Clear local data")
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "This app uses personal data for wellness purposes only.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
