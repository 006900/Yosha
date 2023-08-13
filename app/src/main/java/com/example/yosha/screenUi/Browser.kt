package com.example.yosha.screenUi

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.util.Log
import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.google.accompanist.web.AccompanistWebViewClient
import com.google.accompanist.web.WebView
import com.google.accompanist.web.rememberWebViewNavigator
import com.google.accompanist.web.rememberWebViewState

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebBrowser(path:String) {

    val url by remember { mutableStateOf(path) }
    val state = rememberWebViewState(url = url)
    val navigator = rememberWebViewNavigator()


    // A custom WebViewClient and WebChromeClient can be provided via subclassing
    val webClient = remember {
        object : AccompanistWebViewClient() {

            override fun onPageStarted(view: WebView, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                Log.d("Accompanist WebView", "Page started loading for $url")
            }
        }
    }

    WebView(
        state = state,
        navigator = navigator,
        onCreated = { webView ->
            webView.settings.javaScriptEnabled = true
        },
        client = webClient, modifier = Modifier.fillMaxSize()
    )
}