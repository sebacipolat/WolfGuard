package io.github.sebacipolat.wolfguard.sdk.device

import android.content.Context
import android.provider.Settings

/**
 * USB features related to Android
 */
class UsbDebug() {

    /**
     * Tell if the device has the usb debug mode enabled.
     * @param context: Context Android
     * @return boolean
     */
    fun isEnabled(context: Context): Boolean {
        return Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.ADB_ENABLED, 0
        ) != 0
    }
}