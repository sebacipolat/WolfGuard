package io.github.sebacipolat.wolfguard.sdk.device

import android.content.Context
import com.scottyab.rootbeer.RootBeer

/**
 * Root Detectton helper
 */
class Root {

    /**
     * isRooted
     * Tells if the device has rooted enabled
     * @param context: Android Context
     * @return boolean
     */
    fun isRooted(context: Context): Boolean {
        return RootBeer(context).isRooted
    }
}