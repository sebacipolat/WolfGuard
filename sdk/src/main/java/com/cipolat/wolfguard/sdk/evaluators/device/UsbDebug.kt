package com.cipolat.wolfguard.sdk.evaluators.device

import android.content.Context
import android.provider.Settings
import com.cipolat.wolfguard.sdk.evaluators.Evaluator

class UsbDebug() : Evaluator {

    fun isEnabled(context: Context): Boolean {
        return Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.ADB_ENABLED, 0
        ) != 0
    }

    override fun getScore(): Int {
        return        0
    }
}