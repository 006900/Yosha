package com.example.yosha.buttonNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.yosha.MainScreen
import com.example.yosha.screenUi.SelectedWeb
import com.example.yosha.screenUi.Setting


@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            MainScreen()
        }
        composable(route = BottomBarScreen.Web.route) {
            SelectedWeb()
        }
        composable(route = BottomBarScreen.Setting.route) {
            Setting()
        }

    }
}