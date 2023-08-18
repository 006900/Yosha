package com.example.yosha.buttonNav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.yosha.MainScreen
import com.example.yosha.componentSetting.DataStoreUtil
import com.example.yosha.converterThemperature.TempScreen
import com.example.yosha.converterThemperature.TempViewModel
import com.example.yosha.screenUi.SelectedWeb
import com.example.yosha.screenUi.Setting


@Composable
fun BottomNavGraph(
    navController: NavHostController
) {

    val dataStore = DataStoreUtil(LocalContext.current)
    val opacity by dataStore.opacity.collectAsState(initial = false)

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
        composable(route = BottomBarScreen.TempScreen.route) {
            TempScreen(tempViewModel = TempViewModel())
        }

    }
}