package com.example.composeprueba

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable


sealed class Screens(val route: String) {
    object Home : Screens("home")
    object Detail : Screens("detail")
}

@ExperimentalMaterialApi
@Composable
fun Screens(navController: NavController): NavGraphBuilder.() -> Unit = {
    composable(Screens.Home.route) { Greeting(navController) }
    composable(Screens.Detail.route) { DetailPreview() }
}
