package com.example.yosha.appweb

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.example.yosha.screenUi.WebBrowser


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun Biblia(rememberHost:NavController) {

    WebBrowser(path = "https://www.vatican.va/archive/ESL0506/_INDEX.HTM")
}
