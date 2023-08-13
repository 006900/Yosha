package com.example.yosha.componentSetting

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun Theme(){

    val scope = rememberCoroutineScope()
    //creating an object of your datastore
    val dataStore = DataStoreUtil(LocalContext.current)
    //retrieving the boolean value from the data store as a state
    val darkTheme by dataStore.darkThemeUi.collectAsState(initial = true)

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
    ){

        Row (modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically){
            Text(text = "Dark Theme",

                color = Color.LightGray,

                modifier = Modifier.padding(start = 15.dp))

            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(end = 20.dp),
                contentAlignment = Alignment.TopEnd) {
                Switch(checked = darkTheme, onCheckedChange = { scope.launch{
                    dataStore.saveForceDarkTheme(it)
                } })
            }
        }
    }
}