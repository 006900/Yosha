package com.example.yosha.componentSetting

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.yosha.Screen

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ImageTop(){

    val contextFor = LocalContext.current
    val store = DataStoreUtil(contextFor)
    val tokenText = store.top.collectAsState(initial = "")

    Box (modifier = Modifier.fillMaxWidth().background(Color.Black).clickable {  },
        contentAlignment = Alignment.TopCenter){
        Card (modifier = Modifier
            .fillMaxWidth()
            .height(230.dp), shape = RoundedCornerShape(topStart = 0.dp ,
            topEnd = 0.dp,
            bottomEnd = 0.dp,
            bottomStart = 0.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 25.dp)
        ){

            GlideImage(model = tokenText.value,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillBounds)
        }
    }
}
