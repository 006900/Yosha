package com.example.yosha

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import com.example.yosha.componentSetting.DataStoreUtil

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationScreen(){
    Scaffold (topBar = { TopNavigation()},
        content = { NavigationContent()})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopNavigation(){
    val contextBy = LocalContext.current
    val tokenText = remember {
        mutableStateOf(TextFieldValue("Text Top"))
    }
    val storeColor = DataStoreUtil(contextBy)
    TopAppBar(title = { OutlinedTextField(value = tokenText.value,
        onValueChange = {},
        placeholder = { Text(text = "Search...")},
        trailingIcon = { IconButton(
        onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Default.Search, contentDescription = null)
    }}) })
}

@Composable
fun NavigationContent(){
Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

}
}