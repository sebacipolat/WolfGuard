package com.cipolat.wolfguard.sdk.evaluators.device

import android.content.Context
import com.cipolat.wolfguard.sdk.evaluators.Evaluator
import com.scottyab.rootbeer.RootBeer


class Root : Evaluator {

    fun isRooted(context: Context): Boolean {
        return RootBeer(context).isRooted
    }

    override fun getScore(): Int {
        return 0
    }
}