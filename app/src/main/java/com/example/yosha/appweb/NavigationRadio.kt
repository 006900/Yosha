@file:Suppress("DEPRECATION")

package com.example.yosha.appweb

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.yosha.Screen

@Composable
fun NavigationRadio(rememberHost: NavController){

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(
            color =
            Color.DarkGray
        )
        .padding(bottom = 50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        item {

            Row(modifier = Modifier
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {

                ImageYoutube(rememberHost)

            }

        }
    }


}



@Composable
fun ImageYoutube(rememberHost: NavController){

    Card(modifier = Modifier
        .size(200.dp)
        .padding(50.dp)
        .clickable {
            rememberHost.navigate(Screen.Youtube.route) {
                popUpTo(Screen.NavRadio.route)
            }
        }) {
        Box(modifier = Modifier
            .fillMaxSize(),
            contentAlignment = Alignment.Center){
            Icon(imageVector = Icons.Default.Add, contentDescription = null, modifier = Modifier.size(64.dp))
        }
    }
}