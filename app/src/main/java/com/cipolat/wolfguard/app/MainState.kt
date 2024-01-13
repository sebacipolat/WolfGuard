package com.cipolat.wolfguard.app

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class MainState(
    var isRoot: MutableState<Boolean> = mutableStateOf(false),
    var isEmulator: MutableState<Boolean> = mutableStateOf(false),
    var isUsbDebug: MutableState<Boolean> = mutableStateOf(false),
    var isOnVoipCall: MutableState<Boolean> = mutableStateOf(false)
)