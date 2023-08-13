@file:Suppress("PropertyName")

package com.example.yosha.buttonNav

import com.example.yosha.R


sealed class BottomBarScreen(
    val route: String,
    val title: String?=null,
    val icon: Int?=null,
    val icon_focused: Int?=null
) {

    // for home
    object Home: BottomBarScreen(
        route = "MainScreen",
        title = "Home",
        icon = R.drawable.calculadora,
        icon_focused = R.drawable.calculadoraonfocused

    )

    // for report
    object Web: BottomBarScreen(
        route = "Web",
        title = "Web",
        icon = R.drawable.redmundial,
        icon_focused = R.drawable.redmundialonfocused
    )

    // for report
    object Setting: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.configuraciones,
        icon_focused = R.drawable.configurationonfocused
    )

    object ScreenNavigation: BottomBarScreen(
        route = "ScreenNavigation"
    )


}

