package com.cipolat.wolfguard.app

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.cipolat.wolfguard.WolfGuard

class MainViewModel(var context: Context) : ViewModel() {
    var state by mutableStateOf(MainState())
        private set

    init {
        checkDevice()
    }

    fun checkDevice() {
        state.isRoot.value = WolfGuard.getInstance().getDevice().root.isRooted(context)
        state.isEmulator.value = WolfGuard.getInstance().getDevice().emulator.isEmulator()
        state.isUsbDebug.value = WolfGuard.getInstance().getDevice().usbDebug.isEnabled(context)
        state.isOnVoipCall.value = WolfGuard.getInstance().getDevice().voip.isOnCall(context)
    }
}