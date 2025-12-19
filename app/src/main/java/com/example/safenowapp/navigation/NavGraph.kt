package com.example.safenowapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.safenowapp.ui.screens.SplashScreen
import com.example.safenowapp.ui.screens.SosScreen
import com.example.safenowapp.ui.screens.ContactsScreen
import com.example.safenowapp.ui.screens.EmergencyActiveScreen
import com.example.safenowapp.ui.screens.PermissionGateScreen
import com.example.safenowapp.ui.screens.SettingsScreen

const val SPLASH = "splash"
const val PERMISSIONS = "permissions"
const val SOS = "sos"
const val CONTACTS = "contacts"
const val EMERGENCY_ACTIVE = "emergency_active"
const val SETTINGS = "settings"

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = SPLASH
    ) {
        composable(SPLASH) {
            SplashScreen(
                onFinished = {
                    navController.navigate(PERMISSIONS) {
                        popUpTo(SPLASH) { inclusive = true }
                    }
                }
            )
        }

        composable(PERMISSIONS) {
            PermissionGateScreen(
                onAllGranted = {
                    navController.navigate(SOS) {
                        popUpTo(PERMISSIONS) { inclusive = true }
                    }
                }
            )
        }

        composable(SOS) {
            SosScreen(
                onContactsClick = { navController.navigate(CONTACTS) },
                onTrackMeClick = { /* TODO later */ },
                onHistoryClick = { /* TODO later */ },
                onSettingsClick = { navController.navigate(SETTINGS) },
                onSosClick = { navController.navigate(EMERGENCY_ACTIVE) }
            )
        }

        composable(CONTACTS) {
            ContactsScreen(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(EMERGENCY_ACTIVE) {
            EmergencyActiveScreen(
                onCancelClick = { navController.popBackStack() }
            )
        }

        composable(SETTINGS) {
            SettingsScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
