package com.example.yosha.listNavigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.yosha.ScreenSplash
import com.example.yosha.appweb.Splash
import com.example.yosha.buttonNav.BottomNav
import com.example.yosha.componentSetting.DataStoreUtil

@Composable
fun ScreenNavigationSplash(){

    val dataStore = DataStoreUtil(LocalContext.current)
    //retrieving the boolean value from the data store as a state
    val enabledSplash by dataStore.enabledSplash.collectAsState(initial = true)

    val dataConverter = DataStoreUtil(LocalContext.current)
    val dataConverterView by dataConverter.opacity.collectAsState(initial = false)

    val rememberHostSplash= rememberNavController()
    NavHost(navController = rememberHostSplash,
        startDestination =
        if (enabledSplash){
            ScreenSplash.Splash.route}
        else { ScreenSplash.BottomNav.route}
      ) {

        composable(ScreenSplash.Splash.route) {
            Splash(rememberHostSplash)
        }
        composable(ScreenSplash.BottomNav.route) {
            BottomNav()
        }

    }
}