package com.example.yosha.calculatorComponents
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yosha.componentSetting.CircleButton
import com.example.yosha.componentSetting.DataStoreUtil
import com.example.yosha.ui.theme.Orange
import com.example.yosha.ui.theme.PurpleGrey80


@ExperimentalComposeUiApi
@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier = Modifier,
    color: Color= Color.White,
    textStyle: TextStyle = TextStyle(),
    onClick: () -> Unit
) {

    val contextColorButton = LocalContext.current
    val storeColorButton = DataStoreUtil(contextColorButton)
    val colorTextButton = storeColorButton.colorTextButton.collectAsState(initial = "")

    val dataStore = DataStoreUtil(LocalContext.current)
    //retrieving the boolean value from the data store as a state
    val circleButton by dataStore.circleButton.collectAsState(initial = true)
    val data = DataStoreUtil(LocalContext.current)
    //retrieving the boolean value from the data store as a state
    val border by data.border.collectAsState(initial = true)

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(
                if (!circleButton) {
                    RectangleShape
                } else {
                        CircleShape
                }
            )

            .border(
                width = 3.dp,
                color = if (border){
                    Color.White}else{
                    Color.Transparent},
                shape = if (circleButton) {
                    CircleShape
                } else {
                    RectangleShape
                }
            )
            .background(color)
            .clickable {
                onClick()
            }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            style = textStyle,
            fontSize = 50.sp,
            color = when(colorTextButton.value){
                "orange"->{ Orange }
                "red"->{ Color.Red}
                "purple"->{ PurpleGrey80 }
                "white"->{ Color.White}
                "black"->{ Color.Black}
                "blue"->{ Color.Blue}
                "yellow"->{ Color.Yellow}
                "cyan"->{ Color.Cyan}
                "gray"->{ Color.Gray}
                "magenta"->{ Color.Magenta}
                "green"->{ Color.Green}
                "darkGray"->{ Color.DarkGray}
                "lightGray"->{ Color.LightGray}
                else->{ Color.White} },
            fontWeight = FontWeight.ExtraBold
        )
    }
}


