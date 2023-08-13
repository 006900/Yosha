package com.example.yosha.appweb

import androidx.compose.runtime.Composable
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.example.yosha.screenUi.WebBrowser


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PornHub() {
    WebBrowser(path = "https://es.pornhub.com/")
}
