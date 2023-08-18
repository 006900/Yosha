package com.example.yosha.converterThemperature
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yosha.R
import com.example.yosha.componentSetting.DataStoreUtil
import com.example.yosha.ui.theme.Brown_600
import com.example.yosha.ui.theme.amber_050
import com.example.yosha.ui.theme.amber_100
import com.example.yosha.ui.theme.amber_200
import com.example.yosha.ui.theme.amber_300
import com.example.yosha.ui.theme.amber_400
import com.example.yosha.ui.theme.amber_500
import com.example.yosha.ui.theme.amber_600
import com.example.yosha.ui.theme.amber_700
import com.example.yosha.ui.theme.amber_800
import com.example.yosha.ui.theme.amber_900
import com.example.yosha.ui.theme.amber_a100
import com.example.yosha.ui.theme.amber_a200
import com.example.yosha.ui.theme.amber_a400
import com.example.yosha.ui.theme.amber_a700
import com.example.yosha.ui.theme.blue_050
import com.example.yosha.ui.theme.blue_100
import com.example.yosha.ui.theme.blue_200
import com.example.yosha.ui.theme.blue_300
import com.example.yosha.ui.theme.blue_400
import com.example.yosha.ui.theme.blue_500
import com.example.yosha.ui.theme.blue_600
import com.example.yosha.ui.theme.blue_700
import com.example.yosha.ui.theme.blue_800
import com.example.yosha.ui.theme.blue_900
import com.example.yosha.ui.theme.blue_a100
import com.example.yosha.ui.theme.blue_a200
import com.example.yosha.ui.theme.blue_a400
import com.example.yosha.ui.theme.blue_a700
import com.example.yosha.ui.theme.blue_grey_050
import com.example.yosha.ui.theme.blue_grey_100
import com.example.yosha.ui.theme.blue_grey_200
import com.example.yosha.ui.theme.blue_grey_300
import com.example.yosha.ui.theme.blue_grey_400
import com.example.yosha.ui.theme.blue_grey_500
import com.example.yosha.ui.theme.blue_grey_600
import com.example.yosha.ui.theme.blue_grey_700
import com.example.yosha.ui.theme.blue_grey_800
import com.example.yosha.ui.theme.blue_grey_900
import com.example.yosha.ui.theme.brown_050
import com.example.yosha.ui.theme.brown_100
import com.example.yosha.ui.theme.brown_200
import com.example.yosha.ui.theme.brown_300
import com.example.yosha.ui.theme.brown_400
import com.example.yosha.ui.theme.brown_500
import com.example.yosha.ui.theme.brown_700
import com.example.yosha.ui.theme.brown_800
import com.example.yosha.ui.theme.brown_900
import com.example.yosha.ui.theme.cyan_050
import com.example.yosha.ui.theme.cyan_100
import com.example.yosha.ui.theme.cyan_200
import com.example.yosha.ui.theme.cyan_300
import com.example.yosha.ui.theme.cyan_400
import com.example.yosha.ui.theme.cyan_500
import com.example.yosha.ui.theme.cyan_600
import com.example.yosha.ui.theme.cyan_700
import com.example.yosha.ui.theme.cyan_800
import com.example.yosha.ui.theme.cyan_900
import com.example.yosha.ui.theme.cyan_a100
import com.example.yosha.ui.theme.cyan_a200
import com.example.yosha.ui.theme.cyan_a400
import com.example.yosha.ui.theme.cyan_a700
import com.example.yosha.ui.theme.deep_orange_050
import com.example.yosha.ui.theme.deep_orange_100
import com.example.yosha.ui.theme.deep_orange_200
import com.example.yosha.ui.theme.deep_orange_300
import com.example.yosha.ui.theme.deep_orange_400
import com.example.yosha.ui.theme.deep_orange_500
import com.example.yosha.ui.theme.deep_orange_600
import com.example.yosha.ui.theme.deep_orange_700
import com.example.yosha.ui.theme.deep_orange_800
import com.example.yosha.ui.theme.deep_orange_900
import com.example.yosha.ui.theme.deep_orange_a100
import com.example.yosha.ui.theme.deep_orange_a200
import com.example.yosha.ui.theme.deep_orange_a400
import com.example.yosha.ui.theme.deep_orange_a700
import com.example.yosha.ui.theme.deep_purple_050
import com.example.yosha.ui.theme.deep_purple_100
import com.example.yosha.ui.theme.deep_purple_200
import com.example.yosha.ui.theme.deep_purple_300
import com.example.yosha.ui.theme.deep_purple_400
import com.example.yosha.ui.theme.deep_purple_500
import com.example.yosha.ui.theme.deep_purple_600
import com.example.yosha.ui.theme.deep_purple_700
import com.example.yosha.ui.theme.deep_purple_800
import com.example.yosha.ui.theme.deep_purple_900
import com.example.yosha.ui.theme.deep_purple_a100
import com.example.yosha.ui.theme.deep_purple_a200
import com.example.yosha.ui.theme.deep_purple_a400
import com.example.yosha.ui.theme.deep_purple_a700
import com.example.yosha.ui.theme.green_050
import com.example.yosha.ui.theme.green_100
import com.example.yosha.ui.theme.green_200
import com.example.yosha.ui.theme.green_300
import com.example.yosha.ui.theme.green_400
import com.example.yosha.ui.theme.green_500
import com.example.yosha.ui.theme.green_600
import com.example.yosha.ui.theme.green_700
import com.example.yosha.ui.theme.green_800
import com.example.yosha.ui.theme.green_900
import com.example.yosha.ui.theme.green_a100
import com.example.yosha.ui.theme.green_a200
import com.example.yosha.ui.theme.green_a400
import com.example.yosha.ui.theme.green_a700
import com.example.yosha.ui.theme.grey_050
import com.example.yosha.ui.theme.grey_100
import com.example.yosha.ui.theme.grey_1000_b
import com.example.yosha.ui.theme.grey_1000_w
import com.example.yosha.ui.theme.grey_200
import com.example.yosha.ui.theme.grey_300
import com.example.yosha.ui.theme.grey_400
import com.example.yosha.ui.theme.grey_500
import com.example.yosha.ui.theme.grey_600
import com.example.yosha.ui.theme.grey_700
import com.example.yosha.ui.theme.grey_800
import com.example.yosha.ui.theme.grey_900
import com.example.yosha.ui.theme.indigo_050
import com.example.yosha.ui.theme.indigo_100
import com.example.yosha.ui.theme.indigo_200
import com.example.yosha.ui.theme.indigo_300
import com.example.yosha.ui.theme.indigo_400
import com.example.yosha.ui.theme.indigo_500
import com.example.yosha.ui.theme.indigo_600
import com.example.yosha.ui.theme.indigo_700
import com.example.yosha.ui.theme.indigo_800
import com.example.yosha.ui.theme.indigo_900
import com.example.yosha.ui.theme.indigo_a100
import com.example.yosha.ui.theme.indigo_a200
import com.example.yosha.ui.theme.indigo_a400
import com.example.yosha.ui.theme.indigo_a700
import com.example.yosha.ui.theme.light_blue_050
import com.example.yosha.ui.theme.light_blue_100
import com.example.yosha.ui.theme.light_blue_200
import com.example.yosha.ui.theme.light_blue_300
import com.example.yosha.ui.theme.light_blue_400
import com.example.yosha.ui.theme.light_blue_500
import com.example.yosha.ui.theme.light_blue_600
import com.example.yosha.ui.theme.light_blue_700
import com.example.yosha.ui.theme.light_blue_800
import com.example.yosha.ui.theme.light_blue_900
import com.example.yosha.ui.theme.light_blue_a100
import com.example.yosha.ui.theme.light_blue_a200
import com.example.yosha.ui.theme.light_blue_a400
import com.example.yosha.ui.theme.light_blue_a700
import com.example.yosha.ui.theme.light_green_050
import com.example.yosha.ui.theme.light_green_100
import com.example.yosha.ui.theme.light_green_200
import com.example.yosha.ui.theme.light_green_300
import com.example.yosha.ui.theme.light_green_400
import com.example.yosha.ui.theme.light_green_500
import com.example.yosha.ui.theme.light_green_600
import com.example.yosha.ui.theme.light_green_700
import com.example.yosha.ui.theme.light_green_800
import com.example.yosha.ui.theme.light_green_900
import com.example.yosha.ui.theme.light_green_a100
import com.example.yosha.ui.theme.light_green_a200
import com.example.yosha.ui.theme.light_green_a400
import com.example.yosha.ui.theme.light_green_a700
import com.example.yosha.ui.theme.lime_050
import com.example.yosha.ui.theme.lime_100
import com.example.yosha.ui.theme.lime_200
import com.example.yosha.ui.theme.lime_300
import com.example.yosha.ui.theme.lime_400
import com.example.yosha.ui.theme.lime_500
import com.example.yosha.ui.theme.lime_600
import com.example.yosha.ui.theme.lime_700
import com.example.yosha.ui.theme.lime_800
import com.example.yosha.ui.theme.lime_900
import com.example.yosha.ui.theme.lime_a100
import com.example.yosha.ui.theme.lime_a200
import com.example.yosha.ui.theme.lime_a400
import com.example.yosha.ui.theme.lime_a700
import com.example.yosha.ui.theme.orange_050
import com.example.yosha.ui.theme.orange_100
import com.example.yosha.ui.theme.orange_200
import com.example.yosha.ui.theme.orange_300
import com.example.yosha.ui.theme.orange_400
import com.example.yosha.ui.theme.orange_500
import com.example.yosha.ui.theme.orange_600
import com.example.yosha.ui.theme.orange_700
import com.example.yosha.ui.theme.orange_800
import com.example.yosha.ui.theme.orange_900
import com.example.yosha.ui.theme.orange_a100
import com.example.yosha.ui.theme.orange_a200
import com.example.yosha.ui.theme.orange_a400
import com.example.yosha.ui.theme.orange_a700
import com.example.yosha.ui.theme.pink_050
import com.example.yosha.ui.theme.pink_100
import com.example.yosha.ui.theme.pink_200
import com.example.yosha.ui.theme.pink_300
import com.example.yosha.ui.theme.pink_400
import com.example.yosha.ui.theme.pink_500
import com.example.yosha.ui.theme.pink_600
import com.example.yosha.ui.theme.pink_700
import com.example.yosha.ui.theme.pink_800
import com.example.yosha.ui.theme.pink_900
import com.example.yosha.ui.theme.pink_a100
import com.example.yosha.ui.theme.pink_a200
import com.example.yosha.ui.theme.pink_a400
import com.example.yosha.ui.theme.pink_a700
import com.example.yosha.ui.theme.purple_050
import com.example.yosha.ui.theme.purple_100
import com.example.yosha.ui.theme.purple_200
import com.example.yosha.ui.theme.purple_300
import com.example.yosha.ui.theme.purple_400
import com.example.yosha.ui.theme.purple_500
import com.example.yosha.ui.theme.purple_600
import com.example.yosha.ui.theme.purple_700
import com.example.yosha.ui.theme.purple_800
import com.example.yosha.ui.theme.purple_900
import com.example.yosha.ui.theme.purple_a100
import com.example.yosha.ui.theme.purple_a200
import com.example.yosha.ui.theme.purple_a400
import com.example.yosha.ui.theme.purple_a700
import com.example.yosha.ui.theme.red_050
import com.example.yosha.ui.theme.red_100
import com.example.yosha.ui.theme.red_200
import com.example.yosha.ui.theme.red_300
import com.example.yosha.ui.theme.red_400
import com.example.yosha.ui.theme.red_500
import com.example.yosha.ui.theme.red_600
import com.example.yosha.ui.theme.red_700
import com.example.yosha.ui.theme.red_800
import com.example.yosha.ui.theme.red_900
import com.example.yosha.ui.theme.red_a100
import com.example.yosha.ui.theme.red_a200
import com.example.yosha.ui.theme.red_a400
import com.example.yosha.ui.theme.red_a700
import com.example.yosha.ui.theme.teal_050
import com.example.yosha.ui.theme.teal_100
import com.example.yosha.ui.theme.teal_200
import com.example.yosha.ui.theme.teal_300
import com.example.yosha.ui.theme.teal_400
import com.example.yosha.ui.theme.teal_500
import com.example.yosha.ui.theme.teal_600
import com.example.yosha.ui.theme.teal_700
import com.example.yosha.ui.theme.teal_800
import com.example.yosha.ui.theme.teal_900
import com.example.yosha.ui.theme.teal_a100
import com.example.yosha.ui.theme.teal_a200
import com.example.yosha.ui.theme.teal_a400
import com.example.yosha.ui.theme.teal_a700
import com.example.yosha.ui.theme.yellow_050
import com.example.yosha.ui.theme.yellow_100
import com.example.yosha.ui.theme.yellow_200
import com.example.yosha.ui.theme.yellow_300
import com.example.yosha.ui.theme.yellow_400
import com.example.yosha.ui.theme.yellow_500
import com.example.yosha.ui.theme.yellow_600
import com.example.yosha.ui.theme.yellow_700
import com.example.yosha.ui.theme.yellow_800
import com.example.yosha.ui.theme.yellow_900
import com.example.yosha.ui.theme.yellow_a100
import com.example.yosha.ui.theme.yellow_a200
import com.example.yosha.ui.theme.yellow_a400
import com.example.yosha.ui.theme.yellow_a700

@Composable
fun TempScreen(
    tempViewModel: TempViewModel
) {
    val tempUiState by tempViewModel.uiState.collectAsState()

    TempLayout (
        currentTemperature = tempUiState.currentTemperature,
        tempTypeOpposite = tempUiState.currentTempTypeOpposite,
        tempType = tempUiState.currentTempType,
        convertTempInput = { tempViewModel.convertTempInput(it) },
        switchChange = { tempViewModel.switchChange() },
        switchTemp = tempUiState.switchTemp
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TempLayout(
    currentTemperature: String,
    tempTypeOpposite: String,
    tempType: String,
    convertTempInput: (String) -> Unit,
    switchChange: () -> Unit,
    switchTemp: Boolean
){
    var fieldValue by remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current

    val contextButton = LocalContext.current
    val storeColorButton = DataStoreUtil(contextButton)
    val colorButton = storeColorButton.colorButton.collectAsState(initial = "")


    val contextColorTop = LocalContext.current
    val storeColorTop = DataStoreUtil(contextColorTop)
    val colorTextTop = storeColorTop.colorTextTop.collectAsState(initial = "")

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(top = 50.dp),
        contentAlignment = Alignment.TopCenter) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                stringResource(R.string.temperature_converter),
                fontSize = 30.sp,
                modifier = Modifier.padding(20.dp)
            )
            Row(
                modifier = Modifier.padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = fieldValue,
                    onValueChange = { fieldValue = it },
                    label = { Text(stringResource(R.string.enter_the_temperature)) },
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        when(colorTextTop.value){
                            "amber_050"->{
                                amber_050
                            }
                            "amber_100"->{
                                amber_100
                            }
                            "amber_200"->{
                                amber_200
                            }
                            "amber_300"->{
                                amber_300
                            }
                            "amber_400"->{
                                amber_400
                            }
                            "amber_500"->{
                                amber_500
                            }
                            "amber_600"->{
                                amber_600
                            }
                            "amber_700"->{
                                amber_700
                            }
                            "amber_800"->{
                                amber_800
                            }
                            "amber_900"->{
                                amber_900
                            }
                            "amber_a100"->{
                                amber_a100
                            }
                            "amber_a200"->{
                                amber_a200
                            }
                            "amber_a400"->{
                                amber_a400
                            }
                            "amber_a700"->{
                                amber_a700
                            }
                            "blue_050"->{
                                blue_050
                            }
                            "blue_100"->{
                                blue_100
                            }
                            "blue_200"->{
                                blue_200
                            }
                            "blue_300"->{
                                blue_300
                            }
                            "blue_400"->{
                                blue_400
                            }
                            "blue_500"->{
                                blue_500
                            }
                            "blue_600"->{
                                blue_600
                            }
                            "blue_700"->{
                                blue_700
                            }
                            "blue_800"->{
                                blue_800
                            }
                            "blue_900"->{
                                blue_900
                            }
                            "blue_a100"->{
                                blue_a100
                            }
                            "blue_a200"->{
                                blue_a200
                            }
                            "blue_a400"->{
                                blue_a400
                            }
                            "blue_a700"->{
                                blue_a700
                            }
                            "blue_grey_050"->{
                                blue_grey_050
                            }
                            "blue_grey_100"->{
                                blue_grey_100
                            }
                            "blue_grey_200"->{
                                blue_grey_200
                            }
                            "blue_grey_300"->{
                                blue_grey_300
                            }
                            "blue_grey_400"->{
                                blue_grey_400
                            }
                            "blue_grey_500"->{
                                blue_grey_500
                            }
                            "blue_grey_600"->{
                                blue_grey_600
                            }
                            "blue_grey_700"->{
                                blue_grey_700
                            }
                            "blue_grey_800"->{
                                blue_grey_800
                            }
                            "blue_grey_900"->{
                                blue_grey_900
                            }
                            "brown_050"->{
                                brown_050
                            }
                            "brown_100"->{
                                brown_100
                            }
                            "brown_200"->{
                                brown_200
                            }
                            "brown_300"->{
                                brown_300
                            }
                            "brown_400"->{
                                brown_400
                            }
                            "brown_500"->{
                                brown_500
                            }
                            "Brown_600"->{
                                Brown_600
                            }
                            "brown_700"->{
                                brown_700
                            }
                            "brown_800"->{
                                brown_800
                            }
                            "brown_900"->{
                                brown_900
                            }
                            "cyan_050"->{
                                cyan_050
                            }
                            "cyan_100"->{
                                cyan_100
                            }
                            "cyan_200"->{
                                cyan_200
                            }
                            "cyan_300"->{
                                cyan_300
                            }
                            "cyan_400"->{
                                cyan_400
                            }
                            "cyan_500"->{
                                cyan_500
                            }
                            "cyan_600"->{
                                cyan_600
                            }
                            "cyan_700"->{
                                cyan_700
                            }
                            "cyan_800"->{
                                cyan_800
                            }
                            "cyan_900"->{
                                cyan_900
                            }
                            "cyan_a100"->{
                                cyan_a100
                            }
                            "cyan_a200"->{
                                cyan_a200
                            }
                            "cyan_a400"->{
                                cyan_a400
                            }
                            "cyan_a700"->{
                                cyan_a700
                            }
                            "deep_purple_050"->{
                                deep_purple_050
                            }
                            "deep_purple_100"->{
                                deep_purple_100
                            }
                            "deep_purple_200"->{
                                deep_purple_200
                            }
                            "deep_purple_300"->{
                                deep_purple_300
                            }
                            "deep_purple_400"->{
                                deep_purple_400
                            }
                            "deep_purple_500"->{
                                deep_purple_500
                            }
                            "deep_purple_600"->{
                                deep_purple_600
                            }
                            "deep_purple_700"->{
                                deep_purple_700
                            }
                            "deep_purple_800"->{
                                deep_purple_800
                            }
                            "deep_purple_900"->{
                                deep_purple_900
                            }
                            "deep_purple_a100"->{
                                deep_purple_a100
                            }
                            "deep_purple_a200"->{
                                deep_purple_a200
                            }
                            "deep_purple_a400"->{
                                deep_purple_a400
                            }
                            "deep_purple_a700"->{
                                deep_purple_a700
                            }
                            "deep_orange_050"->{
                                deep_orange_050
                            }
                            "deep_orange_100"->{
                                deep_orange_100
                            }
                            "deep_orange_200"->{
                                deep_orange_200
                            }
                            "deep_orange_300"->{
                                deep_orange_300
                            }
                            "deep_orange_400"->{
                                deep_orange_400
                            }
                            "deep_orange_500"->{
                                deep_orange_500
                            }
                            "deep_orange_600"->{
                                deep_orange_600
                            }
                            "deep_orange_700"->{
                                deep_orange_700
                            }
                            "deep_orange_800"->{
                                deep_orange_800
                            }
                            "deep_orange_900"->{
                                deep_orange_900
                            }
                            "deep_orange_a100"->{
                                deep_orange_a100
                            }
                            "deep_orange_a200"->{
                                deep_orange_a200
                            }
                            "deep_orange_a400"->{
                                deep_orange_a400
                            }
                            "deep_orange_a700"->{
                                deep_orange_a700
                            }
                            "grey_050"->{
                                grey_050
                            }
                            "grey_100"->{
                                grey_100
                            }
                            "grey_200"->{
                                grey_200
                            }
                            "grey_300"->{
                                grey_300
                            }
                            "grey_400"->{
                                grey_400
                            }
                            "grey_500"->{
                                grey_500
                            }
                            "grey_600"->{
                                grey_600
                            }
                            "grey_700"->{
                                grey_700
                            }
                            "grey_800"->{
                                grey_800
                            }
                            "grey_900"->{
                                grey_900
                            }
                            "grey_1000_b"->{
                                grey_1000_b
                            }
                            "grey_1000_w"->{
                                grey_1000_w
                            }
                            "green_050"->{
                                green_050
                            }
                            "green_100"->{
                                green_100
                            }
                            "green_200"->{
                                green_200
                            }
                            "green_300"->{
                                green_300
                            }
                            "green_400"->{
                                green_400
                            }
                            "green_500"->{
                                green_500
                            }
                            "green_600"->{
                                green_600
                            }
                            "green_700"->{
                                green_700
                            }
                            "green_800"->{
                                green_800
                            }
                            "green_900"->{
                                green_900
                            }
                            "green_a100"->{
                                green_a100
                            }
                            "green_a200"->{
                                green_a200
                            }
                            "green_a400"->{
                                green_a400
                            }
                            "green_a700"->{
                                green_a700
                            }
                            "indigo_050"->{
                                indigo_050
                            }
                            "indigo_100"->{
                                indigo_100
                            }
                            "indigo_200"->{
                                indigo_200
                            }
                            "indigo_300"->{
                                indigo_300
                            }
                            "indigo_400"->{
                                indigo_400
                            }
                            "indigo_500"->{
                                indigo_500
                            }
                            "indigo_600"->{
                                indigo_600
                            }
                            "indigo_700"->{
                                indigo_700
                            }
                            "indigo_800"->{
                                indigo_800
                            }
                            "indigo_900"->{
                                indigo_900
                            }
                            "indigo_a100"->{
                                indigo_a100
                            }
                            "indigo_a200"->{
                                indigo_a200
                            }
                            "indigo_a400"->{
                                indigo_a400
                            }
                            "indigo_a700"->{
                                indigo_a700
                            }
                            "light_blue_050"->{
                                light_blue_050
                            }
                            "light_blue_100"->{
                                light_blue_100
                            }
                            "light_blue_200"->{
                                light_blue_200
                            }
                            "light_blue_300"->{
                                light_blue_300
                            }
                            "light_blue_400"->{
                                light_blue_400
                            }
                            "light_blue_500"->{
                                light_blue_500
                            }
                            "light_blue_600"->{
                                light_blue_600
                            }
                            "light_blue_700"->{
                                light_blue_700
                            }
                            "light_blue_800"->{
                                light_blue_800
                            }
                            "light_blue_900"->{
                                light_blue_900
                            }
                            "light_blue_a100"->{
                                light_blue_a100
                            }
                            "light_blue_a200"->{
                                light_blue_a200
                            }
                            "light_blue_a400"->{
                                light_blue_a400
                            }
                            "light_blue_a700"->{
                                light_blue_a700
                            }
                            "light_green_050"->{
                                light_green_050
                            }
                            "light_green_100"->{
                                light_green_100
                            }
                            "light_green_200"->{
                                light_green_200
                            }
                            "light_green_300"->{
                                light_green_300
                            }
                            "light_green_400"->{
                                light_green_400
                            }
                            "light_green_500"->{
                                light_green_500
                            }
                            "light_green_600"->{
                                light_green_600
                            }
                            "light_green_700"->{
                                light_green_700
                            }
                            "light_green_800"->{
                                light_green_800
                            }
                            "light_green_900"->{
                                light_green_900
                            }
                            "light_green_a100"->{
                                light_green_a100
                            }
                            "light_green_a200"->{
                                light_green_a200
                            }
                            "light_green_a400"->{
                                light_green_a400
                            }
                            "light_green_a700"->{
                                light_green_a700
                            }
                            "lime_050"->{
                                lime_050
                            }
                            "lime_100"->{
                                lime_100
                            }
                            "lime_200"->{
                                lime_200
                            }
                            "lime_300"->{
                                lime_300
                            }
                            "lime_400"->{
                                lime_400
                            }
                            "lime_500"->{
                                lime_500
                            }
                            "lime_600"->{
                                lime_600
                            }
                            "lime_700"->{
                                lime_700
                            }
                            "lime_800"->{
                                lime_800
                            }
                            "lime_900"->{
                                lime_900
                            }
                            "lime_a100"->{
                                lime_a100
                            }
                            "lime_a200"->{
                                lime_a200
                            }
                            "lime_a400"->{
                                lime_a400
                            }
                            "lime_a700"->{
                                lime_a700
                            }
                            "orange_050"->{
                                orange_050
                            }
                            "orange_100"->{
                                orange_100
                            }
                            "orange_200"->{
                                orange_200
                            }
                            "orange_300"->{
                                orange_300
                            }
                            "orange_400"->{
                                orange_400
                            }
                            "orange_500"->{
                                orange_500
                            }
                            "orange_600"->{
                                orange_600
                            }
                            "orange_700"->{
                                orange_700
                            }
                            "orange_800"->{
                                orange_800
                            }
                            "orange_900"->{
                                orange_900
                            }
                            "orange_a100"->{
                                orange_a100
                            }
                            "orange_a200"->{
                                orange_a200
                            }
                            "orange_a400"->{
                                orange_a400
                            }
                            "orange_a700"->{
                                orange_a700
                            }
                            "pink_050"->{
                                pink_050
                            }
                            "pink_100"->{
                                pink_100
                            }
                            "pink_200"->{
                                pink_200
                            }
                            "pink_300"->{
                                pink_300
                            }
                            "pink_400"->{
                                pink_400
                            }
                            "pink_500"->{
                                pink_500
                            }
                            "pink_600"->{
                                pink_600
                            }
                            "pink_700"->{
                                pink_700
                            }
                            "pink_800"->{
                                pink_800
                            }
                            "pink_900"->{
                                pink_900
                            }
                            "pink_a100"->{
                                pink_a100
                            }
                            "pink_a200"->{
                                pink_a200
                            }
                            "pink_a400"->{
                                pink_a400
                            }
                            "pink_a700"->{
                                pink_a700
                            }
                            "purple_050"->{
                                purple_050
                            }
                            "purple_100"->{
                                purple_100
                            }
                            "purple_200"->{
                                purple_200
                            }
                            "purple_300"->{
                                purple_300
                            }
                            "purple_400"->{
                                purple_400
                            }
                            "purple_500"->{
                                purple_500
                            }
                            "purple_600"->{
                                purple_600
                            }
                            "purple_700"->{
                                purple_700
                            }
                            "purple_800"->{
                                purple_800
                            }
                            "purple_900"->{
                                purple_900
                            }
                            "purple_a100"->{
                                purple_a100
                            }
                            "purple_a200"->{
                                purple_a200
                            }
                            "purple_a400"->{
                                purple_a400
                            }
                            "purple_a700"->{
                                purple_a700
                            }
                            "red_050"->{
                                red_050
                            }
                            "red_100"->{
                                red_100
                            }
                            "red_200"->{
                                red_200
                            }
                            "red_300"->{
                                red_300
                            }
                            "red_400"->{
                                red_400
                            }
                            "red_500"->{
                                red_500
                            }
                            "red_600"->{
                                red_600
                            }
                            "red_700"->{
                                red_700
                            }
                            "red_800"->{
                                red_800
                            }
                            "red_900"->{
                                red_900
                            }
                            "red_a100"->{
                                red_a100
                            }
                            "red_a200"->{
                                red_a200
                            }
                            "red_a400"->{
                                red_a400
                            }
                            "red_a700"->{
                                red_a700
                            }
                            "teal_050"->{
                                teal_050
                            }
                            "teal_100"->{
                                teal_100
                            }
                            "teal_200"->{
                                teal_200
                            }
                            "teal_300"->{
                                teal_300
                            }
                            "teal_400"->{
                                teal_400
                            }
                            "teal_500"->{
                                teal_500
                            }
                            "teal_600"->{
                                teal_600
                            }
                            "teal_700"->{
                                teal_700
                            }
                            "teal_800"->{
                                teal_800
                            }
                            "teal_900"->{
                                teal_900
                            }
                            "teal_a100"->{
                                teal_a100
                            }
                            "teal_a200"->{
                                teal_a200
                            }
                            "teal_a400"->{
                                teal_a400
                            }
                            "teal_a700"->{
                                teal_a700
                            }
                            "yellow_050"->{
                                yellow_050
                            }
                            "yellow_100"->{
                                yellow_100
                            }
                            "yellow_200"->{
                                yellow_200
                            }
                            "yellow_300"->{
                                yellow_300
                            }
                            "yellow_400"->{
                                yellow_400
                            }
                            "yellow_500"->{
                                yellow_500
                            }
                            "yellow_600"->{
                                yellow_600
                            }
                            "yellow_700"->{
                                yellow_700
                            }
                            "yellow_800"->{
                                yellow_800
                            }
                            "yellow_900"->{
                                yellow_900
                            }
                            "yellow_a100"->{
                                yellow_a100
                            }
                            "yellow_a200"->{
                                yellow_a200
                            }
                            "yellow_a400"->{
                                yellow_a400
                            }
                            "yellow_a700"->{
                                yellow_a700
                            }
                            else-> Color.White

                        }
                    ),
                    modifier = Modifier.padding(10.dp),
                    textStyle = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    ),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Number
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = { focusManager.clearFocus() }
                    )
                )
                Text(
                    text = tempType,
                    fontSize = 30.sp
                )
            }
            Text(
                text = currentTemperature + tempTypeOpposite, // "20" + "ºC"
                fontSize = 30.sp
            )
            Row(
                modifier = Modifier.padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.celsius),
                    modifier = Modifier.padding(10.dp)
                )
                Switch(
                    checked = switchTemp,
                    onCheckedChange = {
                        switchChange()
                        convertTempInput(fieldValue)
                    }
                )
                Text(
                    text = stringResource(R.string.fahrenheit),
                    modifier = Modifier.padding(10.dp)
                )
            }
            Button(
                onClick = { convertTempInput(fieldValue) }, colors = ButtonDefaults.buttonColors(
                    when(colorButton.value){
                        "amber_050"->{
                            amber_050
                        }
                        "amber_100"->{
                            amber_100
                        }
                        "amber_200"->{
                            amber_200
                        }
                        "amber_300"->{
                            amber_300
                        }
                        "amber_400"->{
                            amber_400
                        }
                        "amber_500"->{
                            amber_500
                        }
                        "amber_600"->{
                            amber_600
                        }
                        "amber_700"->{
                            amber_700
                        }
                        "amber_800"->{
                            amber_800
                        }
                        "amber_900"->{
                            amber_900
                        }
                        "amber_a100"->{
                            amber_a100
                        }
                        "amber_a200"->{
                            amber_a200
                        }
                        "amber_a400"->{
                            amber_a400
                        }
                        "amber_a700"->{
                            amber_a700
                        }
                        "blue_050"->{
                            blue_050
                        }
                        "blue_100"->{
                            blue_100
                        }
                        "blue_200"->{
                            blue_200
                        }
                        "blue_300"->{
                            blue_300
                        }
                        "blue_400"->{
                            blue_400
                        }
                        "blue_500"->{
                            blue_500
                        }
                        "blue_600"->{
                            blue_600
                        }
                        "blue_700"->{
                            blue_700
                        }
                        "blue_800"->{
                            blue_800
                        }
                        "blue_900"->{
                            blue_900
                        }
                        "blue_a100"->{
                            blue_a100
                        }
                        "blue_a200"->{
                            blue_a200
                        }
                        "blue_a400"->{
                            blue_a400
                        }
                        "blue_a700"->{
                            blue_a700
                        }
                        "blue_grey_050"->{
                            blue_grey_050
                        }
                        "blue_grey_100"->{
                            blue_grey_100
                        }
                        "blue_grey_200"->{
                            blue_grey_200
                        }
                        "blue_grey_300"->{
                            blue_grey_300
                        }
                        "blue_grey_400"->{
                            blue_grey_400
                        }
                        "blue_grey_500"->{
                            blue_grey_500
                        }
                        "blue_grey_600"->{
                            blue_grey_600
                        }
                        "blue_grey_700"->{
                            blue_grey_700
                        }
                        "blue_grey_800"->{
                            blue_grey_800
                        }
                        "blue_grey_900"->{
                            blue_grey_900
                        }
                        "brown_050"->{
                            brown_050
                        }
                        "brown_100"->{
                            brown_100
                        }
                        "brown_200"->{
                            brown_200
                        }
                        "brown_300"->{
                            brown_300
                        }
                        "brown_400"->{
                            brown_400
                        }
                        "brown_500"->{
                            brown_500
                        }
                        "Brown_600"->{
                            Brown_600
                        }
                        "brown_700"->{
                            brown_700
                        }
                        "brown_800"->{
                            brown_800
                        }
                        "brown_900"->{
                            brown_900
                        }
                        "cyan_050"->{
                            cyan_050
                        }
                        "cyan_100"->{
                            cyan_100
                        }
                        "cyan_200"->{
                            cyan_200
                        }
                        "cyan_300"->{
                            cyan_300
                        }
                        "cyan_400"->{
                            cyan_400
                        }
                        "cyan_500"->{
                            cyan_500
                        }
                        "cyan_600"->{
                            cyan_600
                        }
                        "cyan_700"->{
                            cyan_700
                        }
                        "cyan_800"->{
                            cyan_800
                        }
                        "cyan_900"->{
                            cyan_900
                        }
                        "cyan_a100"->{
                            cyan_a100
                        }
                        "cyan_a200"->{
                            cyan_a200
                        }
                        "cyan_a400"->{
                            cyan_a400
                        }
                        "cyan_a700"->{
                            cyan_a700
                        }
                        "deep_purple_050"->{
                            deep_purple_050
                        }
                        "deep_purple_100"->{
                            deep_purple_100
                        }
                        "deep_purple_200"->{
                            deep_purple_200
                        }
                        "deep_purple_300"->{
                            deep_purple_300
                        }
                        "deep_purple_400"->{
                            deep_purple_400
                        }
                        "deep_purple_500"->{
                            deep_purple_500
                        }
                        "deep_purple_600"->{
                            deep_purple_600
                        }
                        "deep_purple_700"->{
                            deep_purple_700
                        }
                        "deep_purple_800"->{
                            deep_purple_800
                        }
                        "deep_purple_900"->{
                            deep_purple_900
                        }
                        "deep_purple_a100"->{
                            deep_purple_a100
                        }
                        "deep_purple_a200"->{
                            deep_purple_a200
                        }
                        "deep_purple_a400"->{
                            deep_purple_a400
                        }
                        "deep_purple_a700"->{
                            deep_purple_a700
                        }
                        "deep_orange_050"->{
                            deep_orange_050
                        }
                        "deep_orange_100"->{
                            deep_orange_100
                        }
                        "deep_orange_200"->{
                            deep_orange_200
                        }
                        "deep_orange_300"->{
                            deep_orange_300
                        }
                        "deep_orange_400"->{
                            deep_orange_400
                        }
                        "deep_orange_500"->{
                            deep_orange_500
                        }
                        "deep_orange_600"->{
                            deep_orange_600
                        }
                        "deep_orange_700"->{
                            deep_orange_700
                        }
                        "deep_orange_800"->{
                            deep_orange_800
                        }
                        "deep_orange_900"->{
                            deep_orange_900
                        }
                        "deep_orange_a100"->{
                            deep_orange_a100
                        }
                        "deep_orange_a200"->{
                            deep_orange_a200
                        }
                        "deep_orange_a400"->{
                            deep_orange_a400
                        }
                        "deep_orange_a700"->{
                            deep_orange_a700
                        }
                        "grey_050"->{
                            grey_050
                        }
                        "grey_100"->{
                            grey_100
                        }
                        "grey_200"->{
                            grey_200
                        }
                        "grey_300"->{
                            grey_300
                        }
                        "grey_400"->{
                            grey_400
                        }
                        "grey_500"->{
                            grey_500
                        }
                        "grey_600"->{
                            grey_600
                        }
                        "grey_700"->{
                            grey_700
                        }
                        "grey_800"->{
                            grey_800
                        }
                        "grey_900"->{
                            grey_900
                        }
                        "grey_1000_b"->{
                            grey_1000_b
                        }
                        "grey_1000_w"->{
                            grey_1000_w
                        }
                        "green_050"->{
                            green_050
                        }
                        "green_100"->{
                            green_100
                        }
                        "green_200"->{
                            green_200
                        }
                        "green_300"->{
                            green_300
                        }
                        "green_400"->{
                            green_400
                        }
                        "green_500"->{
                            green_500
                        }
                        "green_600"->{
                            green_600
                        }
                        "green_700"->{
                            green_700
                        }
                        "green_800"->{
                            green_800
                        }
                        "green_900"->{
                            green_900
                        }
                        "green_a100"->{
                            green_a100
                        }
                        "green_a200"->{
                            green_a200
                        }
                        "green_a400"->{
                            green_a400
                        }
                        "green_a700"->{
                            green_a700
                        }
                        "indigo_050"->{
                            indigo_050
                        }
                        "indigo_100"->{
                            indigo_100
                        }
                        "indigo_200"->{
                            indigo_200
                        }
                        "indigo_300"->{
                            indigo_300
                        }
                        "indigo_400"->{
                            indigo_400
                        }
                        "indigo_500"->{
                            indigo_500
                        }
                        "indigo_600"->{
                            indigo_600
                        }
                        "indigo_700"->{
                            indigo_700
                        }
                        "indigo_800"->{
                            indigo_800
                        }
                        "indigo_900"->{
                            indigo_900
                        }
                        "indigo_a100"->{
                            indigo_a100
                        }
                        "indigo_a200"->{
                            indigo_a200
                        }
                        "indigo_a400"->{
                            indigo_a400
                        }
                        "indigo_a700"->{
                            indigo_a700
                        }
                        "light_blue_050"->{
                            light_blue_050
                        }
                        "light_blue_100"->{
                            light_blue_100
                        }
                        "light_blue_200"->{
                            light_blue_200
                        }
                        "light_blue_300"->{
                            light_blue_300
                        }
                        "light_blue_400"->{
                            light_blue_400
                        }
                        "light_blue_500"->{
                            light_blue_500
                        }
                        "light_blue_600"->{
                            light_blue_600
                        }
                        "light_blue_700"->{
                            light_blue_700
                        }
                        "light_blue_800"->{
                            light_blue_800
                        }
                        "light_blue_900"->{
                            light_blue_900
                        }
                        "light_blue_a100"->{
                            light_blue_a100
                        }
                        "light_blue_a200"->{
                            light_blue_a200
                        }
                        "light_blue_a400"->{
                            light_blue_a400
                        }
                        "light_blue_a700"->{
                            light_blue_a700
                        }
                        "light_green_050"->{
                            light_green_050
                        }
                        "light_green_100"->{
                            light_green_100
                        }
                        "light_green_200"->{
                            light_green_200
                        }
                        "light_green_300"->{
                            light_green_300
                        }
                        "light_green_400"->{
                            light_green_400
                        }
                        "light_green_500"->{
                            light_green_500
                        }
                        "light_green_600"->{
                            light_green_600
                        }
                        "light_green_700"->{
                            light_green_700
                        }
                        "light_green_800"->{
                            light_green_800
                        }
                        "light_green_900"->{
                            light_green_900
                        }
                        "light_green_a100"->{
                            light_green_a100
                        }
                        "light_green_a200"->{
                            light_green_a200
                        }
                        "light_green_a400"->{
                            light_green_a400
                        }
                        "light_green_a700"->{
                            light_green_a700
                        }
                        "lime_050"->{
                            lime_050
                        }
                        "lime_100"->{
                            lime_100
                        }
                        "lime_200"->{
                            lime_200
                        }
                        "lime_300"->{
                            lime_300
                        }
                        "lime_400"->{
                            lime_400
                        }
                        "lime_500"->{
                            lime_500
                        }
                        "lime_600"->{
                            lime_600
                        }
                        "lime_700"->{
                            lime_700
                        }
                        "lime_800"->{
                            lime_800
                        }
                        "lime_900"->{
                            lime_900
                        }
                        "lime_a100"->{
                            lime_a100
                        }
                        "lime_a200"->{
                            lime_a200
                        }
                        "lime_a400"->{
                            lime_a400
                        }
                        "lime_a700"->{
                            lime_a700
                        }
                        "orange_050"->{
                            orange_050
                        }
                        "orange_100"->{
                            orange_100
                        }
                        "orange_200"->{
                            orange_200
                        }
                        "orange_300"->{
                            orange_300
                        }
                        "orange_400"->{
                            orange_400
                        }
                        "orange_500"->{
                            orange_500
                        }
                        "orange_600"->{
                            orange_600
                        }
                        "orange_700"->{
                            orange_700
                        }
                        "orange_800"->{
                            orange_800
                        }
                        "orange_900"->{
                            orange_900
                        }
                        "orange_a100"->{
                            orange_a100
                        }
                        "orange_a200"->{
                            orange_a200
                        }
                        "orange_a400"->{
                            orange_a400
                        }
                        "orange_a700"->{
                            orange_a700
                        }
                        "pink_050"->{
                            pink_050
                        }
                        "pink_100"->{
                            pink_100
                        }
                        "pink_200"->{
                            pink_200
                        }
                        "pink_300"->{
                            pink_300
                        }
                        "pink_400"->{
                            pink_400
                        }
                        "pink_500"->{
                            pink_500
                        }
                        "pink_600"->{
                            pink_600
                        }
                        "pink_700"->{
                            pink_700
                        }
                        "pink_800"->{
                            pink_800
                        }
                        "pink_900"->{
                            pink_900
                        }
                        "pink_a100"->{
                            pink_a100
                        }
                        "pink_a200"->{
                            pink_a200
                        }
                        "pink_a400"->{
                            pink_a400
                        }
                        "pink_a700"->{
                            pink_a700
                        }
                        "purple_050"->{
                            purple_050
                        }
                        "purple_100"->{
                            purple_100
                        }
                        "purple_200"->{
                            purple_200
                        }
                        "purple_300"->{
                            purple_300
                        }
                        "purple_400"->{
                            purple_400
                        }
                        "purple_500"->{
                            purple_500
                        }
                        "purple_600"->{
                            purple_600
                        }
                        "purple_700"->{
                            purple_700
                        }
                        "purple_800"->{
                            purple_800
                        }
                        "purple_900"->{
                            purple_900
                        }
                        "purple_a100"->{
                            purple_a100
                        }
                        "purple_a200"->{
                            purple_a200
                        }
                        "purple_a400"->{
                            purple_a400
                        }
                        "purple_a700"->{
                            purple_a700
                        }
                        "red_050"->{
                            red_050
                        }
                        "red_100"->{
                            red_100
                        }
                        "red_200"->{
                            red_200
                        }
                        "red_300"->{
                            red_300
                        }
                        "red_400"->{
                            red_400
                        }
                        "red_500"->{
                            red_500
                        }
                        "red_600"->{
                            red_600
                        }
                        "red_700"->{
                            red_700
                        }
                        "red_800"->{
                            red_800
                        }
                        "red_900"->{
                            red_900
                        }
                        "red_a100"->{
                            red_a100
                        }
                        "red_a200"->{
                            red_a200
                        }
                        "red_a400"->{
                            red_a400
                        }
                        "red_a700"->{
                            red_a700
                        }
                        "teal_050"->{
                            teal_050
                        }
                        "teal_100"->{
                            teal_100
                        }
                        "teal_200"->{
                            teal_200
                        }
                        "teal_300"->{
                            teal_300
                        }
                        "teal_400"->{
                            teal_400
                        }
                        "teal_500"->{
                            teal_500
                        }
                        "teal_600"->{
                            teal_600
                        }
                        "teal_700"->{
                            teal_700
                        }
                        "teal_800"->{
                            teal_800
                        }
                        "teal_900"->{
                            teal_900
                        }
                        "teal_a100"->{
                            teal_a100
                        }
                        "teal_a200"->{
                            teal_a200
                        }
                        "teal_a400"->{
                            teal_a400
                        }
                        "teal_a700"->{
                            teal_a700
                        }
                        "yellow_050"->{
                            yellow_050
                        }
                        "yellow_100"->{
                            yellow_100
                        }
                        "yellow_200"->{
                            yellow_200
                        }
                        "yellow_300"->{
                            yellow_300
                        }
                        "yellow_400"->{
                            yellow_400
                        }
                        "yellow_500"->{
                            yellow_500
                        }
                        "yellow_600"->{
                            yellow_600
                        }
                        "yellow_700"->{
                            yellow_700
                        }
                        "yellow_800"->{
                            yellow_800
                        }
                        "yellow_900"->{
                            yellow_900
                        }
                        "yellow_a100"->{
                            yellow_a100
                        }
                        "yellow_a200"->{
                            yellow_a200
                        }
                        "yellow_a400"->{
                            yellow_a400
                        }
                        "yellow_a700"->{
                            yellow_a700
                        }
                        else-> Color.White

                    }
                )
            )
            {
                Text(stringResource(R.string.convert_temperature))
            }
        }
    }
}
