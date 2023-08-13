package com.example.yosha.appweb

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.example.yosha.componentSetting.DataStoreUtil
import com.example.yosha.screenUi.WebBrowser

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun Youtube(rememberHost: NavController) {
    WebBrowser(path = "https://www.google.com/webhp?hl=es&sa=X&ved=0ahUKEwiFodb3-s2AAxVcupUCHe0kDroQPAgI")
}