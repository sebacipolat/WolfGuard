package io.github.sebacipolat.wolfguard.sdk.device

import android.content.Context
import android.os.Build
import android.provider.Settings

class UnknownSources {
    fun isEnabled(context: Context): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (context.packageManager.canRequestPackageInstalls()) return true else false
        } else {
            return Settings.Secure.getInt(
                context.contentResolver,
                Settings.Secure.INSTALL_NON_MARKET_APPS,
                0
            ) == 1
        }
    }
}