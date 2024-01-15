package io.github.sebacipolat.wolfguard.sdk.device

import android.content.Context
import com.scottyab.rootbeer.RootBeer

class Root {

    fun isRooted(context: Context): Boolean {
        return RootBeer(context).isRooted
    }
}