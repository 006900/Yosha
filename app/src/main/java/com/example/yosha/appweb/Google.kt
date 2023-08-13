package com.example.yosha.appweb

import android.media.MediaPlayer
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.yosha.R
import com.example.yosha.screenUi.WebBrowser

@Composable
fun Google(rememberHost: NavController) {
    WebBrowser(path = "https://www.google.com/")
}