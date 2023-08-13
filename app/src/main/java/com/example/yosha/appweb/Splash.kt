package com.example.yosha.appweb

import android.media.MediaPlayer
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionResult
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.yosha.R
import com.example.yosha.ScreenSplash
import com.example.yosha.componentSetting.DataStoreUtil
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay

@OptIn(ExperimentalGlideComposeApi::class)
@Suppress("DEPRECATION")
@Composable
fun Splash(rememberHostSplash: NavHostController) {

    val context= LocalContext.current
    val mp:MediaPlayer=MediaPlayer.create(context,R.raw.clash)

    val contextForSplash = LocalContext.current
    val storeSplash = DataStoreUtil(contextForSplash)
    val splashToken = storeSplash.urlSplash.collectAsState(initial = "")

    val contextTitle = LocalContext.current
    val storeTitle = DataStoreUtil(contextTitle)
    val splashTitle = storeTitle.title.collectAsState(initial = "")

    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.isSystemBarsVisible=false
        systemUiController.isNavigationBarVisible=false
    }


    val composition: LottieCompositionResult = rememberLottieComposition(spec = LottieCompositionSpec.RawRes(
        R.raw.animation_lkiotkf1))

        val progress by animateLottieCompositionAsState(
            composition = composition.value,
            isPlaying = true,
            iterations = LottieConstants.IterateForever,
            speed = 1.0f
        )


        LaunchedEffect(key1 = true) {
            delay(5000)
            rememberHostSplash.popBackStack()
            rememberHostSplash.navigate(ScreenSplash.BottomNav.route)
        }

        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {
            if (splashToken.value.isBlank()){   LottieAnimation(
                composition = composition.value,
                progress = progress,
                contentScale = ContentScale.FillHeight
            )
            }else{
                GlideImage(model = splashToken.value,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillHeight
                    )
            }

        }

Box(modifier = Modifier.fillMaxSize()
    .padding(bottom = 40.dp),
    contentAlignment = Alignment.BottomCenter){
    Text(text = splashTitle.value,
        color = Color.White, fontSize = 50.sp)
}


}