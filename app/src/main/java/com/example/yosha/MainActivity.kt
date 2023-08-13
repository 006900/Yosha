package com.example.yosha

import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.yosha.calculatorComponents.CalculatorAction
import com.example.yosha.calculatorComponents.CalculatorButton
import com.example.yosha.calculatorComponents.CalculatorOperation
import com.example.yosha.calculatorComponents.CalculatorViewModel
import com.example.yosha.componentSetting.DataStoreUtil
import com.example.yosha.listNavigation.ScreenNavigationSplash
import com.example.yosha.ui.theme.Orange
import com.example.yosha.ui.theme.PurpleGrey80
import com.example.yosha.ui.theme.YoshaTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.android.gms.ads.MobileAds

sealed class Screen(val route:String){
    object Youtube:Screen("Youtube")
    object ImageTop:Screen("ImageTop")
    object NavRadio:Screen("NavigationRadio")

}


var imageUri by mutableStateOf<Uri?>(null)



sealed class ScreenSplash(val route:String){
    object Splash:ScreenSplash("Splash")
    object BottomNav:ScreenSplash("BottomNav")
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {
            val dataStore = DataStoreUtil(LocalContext.current)
            val darkTheme by dataStore.darkThemeUi.collectAsState(initial = false)

            MobileAds.initialize(this)
            YoshaTheme(darkTheme = darkTheme) {

                      ScreenNavigationSplash()

                    }
                }
            }
        }




@OptIn(ExperimentalComposeUiApi::class, ExperimentalGlideComposeApi::class)
@Composable
fun MainScreen(){

    val systemUiController = rememberSystemUiController()
    SideEffect { systemUiController.isStatusBarVisible=false
        systemUiController.isNavigationBarVisible=true
    }

    val viewModel = viewModel<CalculatorViewModel>()
    val state = viewModel.state
    val buttonSpacing = 8.dp

    val contextColor = LocalContext.current
    val storeColor = DataStoreUtil(contextColor)
    val colorText = storeColor.colorTextCalculator.collectAsState(initial = "")

    val contextColorButton = LocalContext.current
    val storeColorButton = DataStoreUtil(contextColorButton)
    val colorButton = storeColorButton.fountColorButton.collectAsState(initial = "")

    val data = DataStoreUtil(LocalContext.current)
    val imageSize by data.imageSize.collectAsState(initial = false)

    val dataStore = DataStoreUtil(LocalContext.current)
    val opacity by dataStore.opacity.collectAsState(initial = false)

    val contextFor = LocalContext.current
    val store = DataStoreUtil(contextFor)
    val tokenText = store.getAccessToken.collectAsState(initial = "")

    val dataTop = DataStoreUtil(LocalContext.current)
    val imageTop by dataTop.imageTop.collectAsState(initial = false)



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
        , contentAlignment = Alignment.Center
) {


        val context = LocalContext.current
        val bitmap = remember { mutableStateOf<Bitmap?>(null) }


        if (tokenText.value.isBlank()){imageUri?.let {
            if (Build.VERSION.SDK_INT < 28) {
                bitmap.value = MediaStore.Images
                    .Media.getBitmap(context.contentResolver, it)
            } else {
                val source = ImageDecoder.createSource(context.contentResolver, it)
                bitmap.value = ImageDecoder.decodeBitmap(source)
            }


            Box(modifier = Modifier.fillMaxSize()) {

                bitmap.value?.let { btm ->
                    Image(
                        bitmap = btm.asImageBitmap(),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = if (!imageSize){
                            ContentScale.None}else{
                            ContentScale.FillHeight}
                    )
                }
            }
        }
        }else{
            GlideImage(model = tokenText.value,
                contentDescription = null,
                contentScale = if (imageSize){ ContentScale.FillHeight}
                else{ ContentScale.Fit},
                modifier= Modifier.fillMaxSize(),
                alignment = if (imageTop){ Alignment.TopCenter}
                else{ Alignment.Center})}

        }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp)
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing),
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 60.sp,
                color = when (colorText.value) {
                    "orange" -> {
                        Orange
                    }

                    "red" -> {
                        Color.Red
                    }

                    "purple" -> {
                        PurpleGrey80
                    }

                    "white" -> {
                        Color.White
                    }

                    "black" -> {
                        Color.Black
                    }

                    "blue" -> {
                        Color.Blue
                    }

                    "yellow" -> {
                        Color.Yellow
                    }

                    "cyan" -> {
                        Color.Cyan
                    }

                    "gray" -> {
                        Color.Gray
                    }

                    "magenta" -> {
                        Color.Magenta
                    }

                    "green" -> {
                        Color.Green
                    }

                    "darkGray" -> {
                        Color.DarkGray
                    }

                    "lightGray" -> {
                        Color.LightGray
                    }

                    else -> {
                        Color.White
                    }
                },
                maxLines = 3,
            )

            Divider(modifier = Modifier.padding(bottom = 15.dp), color = Color.White, thickness = 3.dp)

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f)
                ) {
                    viewModel.onAction(CalculatorAction.Clear)
                }
                CalculatorButton(
                    symbol = "Del",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Delete)
                }
                CalculatorButton(
                    symbol = "÷",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(7))
                }
                CalculatorButton(
                    symbol = "8",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(8))
                }
                CalculatorButton(
                    symbol = "9",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(9))
                }
                CalculatorButton(
                    symbol = "×",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(4))
                }
                CalculatorButton(
                    symbol = "5",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(5))
                }
                CalculatorButton(
                    symbol = "6",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(6))
                }
                CalculatorButton(
                    symbol = "-",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(1))
                }
                CalculatorButton(
                    symbol = "2",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(2))
                }
                CalculatorButton(
                    symbol = "3",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(3))
                }
                CalculatorButton(
                    symbol = "+",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f)
                ) {
                    viewModel.onAction(CalculatorAction.Number(0))
                }
                CalculatorButton(
                    symbol = ".",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Decimal)
                }
                CalculatorButton(
                    symbol = "=",
                    color = if (!opacity) {
                        when (colorButton.value) {
                            "orange" -> {
                                Orange
                            }

                            "red" -> {
                                Color.Red
                            }

                            "purple" -> {
                                PurpleGrey80
                            }

                            "white" -> {
                                Color.White
                            }

                            "black" -> {
                                Color.Black
                            }

                            "blue" -> {
                                Color.Blue
                            }

                            "yellow" -> {
                                Color.Yellow
                            }

                            "cyan" -> {
                                Color.Cyan
                            }

                            "gray" -> {
                                Color.Gray
                            }

                            "magenta" -> {
                                Color.Magenta
                            }

                            "green" -> {
                                Color.Green
                            }

                            "darkGray" -> {
                                Color.DarkGray
                            }

                            "lightGray" -> {
                                Color.LightGray
                            }

                            else -> {
                                Color.Transparent
                            }
                        }
                    } else {
                        Color.Transparent
                    },
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    viewModel.onAction(CalculatorAction.Calculate)
                }
            }
        }
    }}



