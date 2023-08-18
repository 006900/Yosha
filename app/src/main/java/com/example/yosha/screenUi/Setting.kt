package com.example.yosha.screenUi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.yosha.Banner
import com.example.yosha.BorderColor
import com.example.yosha.componentSetting.FountColorButton
import com.example.yosha.componentSetting.AlignmentTop
import com.example.yosha.componentSetting.Border
import com.example.yosha.componentSetting.CircleButton
import com.example.yosha.componentSetting.ColorTextButton
import com.example.yosha.componentSetting.TextTop
import com.example.yosha.componentSetting.GifBackGround
import com.example.yosha.componentSetting.ImageSize
import com.example.yosha.componentSetting.ImageTop
import com.example.yosha.componentSetting.OnSplash
import com.example.yosha.componentSetting.Theme
import com.example.yosha.componentSetting.TitleSplash
import com.example.yosha.componentSetting.TransparentButton
import com.example.yosha.componentSetting.Url
import com.example.yosha.componentSetting.UrlSplash
import com.example.yosha.componentSetting.UrlTop


@Composable
fun Setting() {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            item {
                ImageTop()
                Banner(modifier = Modifier
                    .fillMaxWidth()
                    .height(75.dp), adId = "ca-app-pub-3940256099942544/6300978111")
                Spacer(modifier = Modifier.height(10.dp))
                TextTop()
                Spacer(modifier = Modifier.height(10.dp))
                ColorTextButton()
                Spacer(modifier = Modifier.height(10.dp))
                FountColorButton()
                Spacer(modifier = Modifier.height(10.dp))
                BorderColor()
                Spacer(modifier = Modifier.height(10.dp))
                TransparentButton()
                Spacer(modifier = Modifier.height(10.dp))
                ModeView()
                Spacer(modifier = Modifier.height(10.dp))
                Theme()
                Spacer(modifier = Modifier.height(10.dp))
                CircleButton()
                Spacer(modifier = Modifier.height(10.dp))
                ImageSize()
                Spacer(modifier = Modifier.height(10.dp))
                Border()
                Spacer(modifier = Modifier.height(10.dp))
                OnSplash()
                Spacer(modifier = Modifier.height(10.dp))
                AlignmentTop()
                Spacer(modifier = Modifier.height(10.dp))
                GifBackGround()
                Spacer(modifier = Modifier.height(10.dp))
                UrlTop()
                Spacer(modifier = Modifier.height(10.dp))
                Url()
                Spacer(modifier = Modifier.height(10.dp))
                TitleSplash()
                Spacer(modifier = Modifier.height(10.dp))
                UrlSplash()


            }
        }
    }





























