package com.cipolat.wolfguard.sdk.evaluators.device

import android.content.Context
import android.provider.Settings

class UsbDebug() {

    fun isEnabled(context: Context): Boolean {
        return Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.ADB_ENABLED, 0
        ) != 0
    }
}