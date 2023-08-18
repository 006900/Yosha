package com.example.yosha.converterThemperature

data class TempUiState (
    val currentTemperature: String = "",
    val currentTempType: String = " ºF",
    val currentTempTypeOpposite: String = "",
    val switchTemp: Boolean = true
)
