package com.example.yosha.componentSetting

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.yosha.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun TitleSplash() {
    val title = remember {
        mutableStateOf(TextFieldValue())
    }
    val contextTitle = LocalContext.current
    val storeTitle = DataStoreUtil(contextTitle)
    val context= LocalContext.current


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(70.dp),
    ) {

        Row(
            modifier = Modifier.fillMaxSize()
                .padding(start = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            OutlinedTextField(modifier = Modifier.size(height = 50.dp, width = 260.dp),
                value = title.value, onValueChange = { title.value = it },
                placeholder = { Text(text = "Title Splash...", color = Color.LightGray) },
                singleLine = true, shape = CircleShape
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                Row {

                    IconButton(onClick = { title.value= TextFieldValue() }) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_delete_24),
                            contentDescription = null, Modifier.size(50.dp)
                        )
                    }
                    IconButton(onClick = {
                        Toast.makeText(context,"Element Savable", Toast.LENGTH_LONG).show()
                        CoroutineScope(Dispatchers.IO).launch {
                            storeTitle.saveTitle(title.value.text)
                        }
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_save_24),
                            contentDescription = null, Modifier.size(50.dp)
                        )
                    }
                }
            }
        }
    }
}
