package io.github.sebacipolat.wolfguard.sdk.device

import android.content.Context
import com.scottyab.rootbeer.RootBeer

/**
 * Root Detectton helper
 */
class Root {
    /**
     * Returns if applications is running on a root device
     * @param context: Android Context
     * @return boolean
     */
    fun isRooted(context: Context): Boolean {
        return RootBeer(context).isRooted
    }
}