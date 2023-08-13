package com.example.yosha.listNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.yosha.Screen
import com.example.yosha.appweb.Biblia
import com.example.yosha.appweb.Discord
import com.example.yosha.appweb.Duolingo
import com.example.yosha.appweb.Google
import com.example.yosha.appweb.NavigationRadio
import com.example.yosha.appweb.Pinterest
import com.example.yosha.appweb.PornHub
import com.example.yosha.appweb.Xvideos
import com.example.yosha.appweb.Youtube
import com.example.yosha.componentSetting.ImageTop

@Composable
fun ScreenNavigation(){

    val rememberHost= rememberNavController()

    NavHost(navController = rememberHost,
        startDestination = Screen.NavRadio.route){

        composable(Screen.Youtube.route) {
            Youtube(rememberHost)
        }
        composable(Screen.NavRadio.route){
            NavigationRadio(rememberHost)
        }
    }
}