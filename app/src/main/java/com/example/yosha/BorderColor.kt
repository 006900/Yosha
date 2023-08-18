package com.example.yosha

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.yosha.componentSetting.DataStoreUtil
import com.example.yosha.dataClass.ListDataColor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BorderColor() {

    val contextBy = LocalContext.current
    val tokenColor = remember {
        mutableStateOf(TextFieldValue("Border Color"))
    }
    val storeColor = DataStoreUtil(contextBy)

    var exposed by remember {
        mutableStateOf(false)
    }


    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {

        ExposedDropdownMenuBox(expanded = exposed,
            onExpandedChange = { exposed = it }) {

            TextField(
                value = tokenColor.value,
                onValueChange = {}, readOnly = true,
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = exposed)
                },
                modifier = Modifier.fillMaxWidth().menuAnchor(),
                enabled = false
            )
            ExposedDropdownMenu(expanded = exposed, onDismissRequest = { exposed = false }) {
                ListDataColor.forEach {
                    DropdownMenuItem(text = { Text(it.name, color = it.color) },
                        onClick = {
                            exposed = false
                            tokenColor.value = TextFieldValue(it.name)
                            CoroutineScope(Dispatchers.IO).launch {
                                storeColor.saveBorderColor(
                                    tokenColor.value.text
                                )
                            }
                        })
                }
            }
        }
    }
}


