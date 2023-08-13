package com.example.yosha.appweb

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.example.yosha.screenUi.WebBrowser

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun Duolingo(rememberHost: NavController) {

    WebBrowser(path = "https://www.duolingo.com/learn")
}