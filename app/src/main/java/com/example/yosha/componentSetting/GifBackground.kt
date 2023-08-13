package com.example.yosha.componentSetting

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.yosha.R
import com.example.yosha.imageUri


@Composable
fun GifBackGround() {

    val launcher =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) { uri: Uri? ->
            imageUri = uri
        }
val context= LocalContext.current

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .height(70.dp),

        colors = CardDefaults.cardColors(
            Color.DarkGray)
        , shape = RoundedCornerShape(topStart = 0.dp ,
            topEnd = 40.dp,
            bottomEnd = 0.dp,
            bottomStart = 40.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxSize().background(Color(0xA4BE0000)),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Selected Image",

                color =
                Color.LightGray,

                modifier = Modifier.padding(start = 15.dp)
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                contentAlignment = Alignment.TopEnd
            ) {

                IconButton(onClick = {
                    Toast.makeText(context,"Element Savable", Toast.LENGTH_LONG).show()
                    launcher.launch("image/*") }) {
                    Icon(painter = painterResource(id = R.drawable.baseline_image_24) ,
                        contentDescription = null,Modifier.size(60.dp))
                }
            }
        }
    }}




