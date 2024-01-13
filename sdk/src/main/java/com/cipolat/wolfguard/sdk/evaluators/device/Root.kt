package com.cipolat.wolfguard.sdk.evaluators.device

import android.content.Context
import com.scottyab.rootbeer.RootBeer


class Root {

    fun isRooted(context: Context): Boolean {
        return RootBeer(context).isRooted
    }
}