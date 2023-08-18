package com.example.yosha.listNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.yosha.Screen
import com.example.yosha.appweb.Youtube

@Composable
fun ScreenNavigation(){

    val rememberHost= rememberNavController()

    NavHost(navController = rememberHost,
        startDestination = Screen.Youtube.route){

        composable(Screen.Youtube.route) {
            Youtube(rememberHost)
        }
    }
}