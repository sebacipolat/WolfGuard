package com.cipolat.wolfguard.sdk.evaluators.device.call

import android.content.Context
import android.telephony.TelephonyManager
import com.cipolat.wolfguard.sdk.evaluators.Evaluator


class PhoneCall(private var context: Context) : Evaluator {

    private val telephonyManager =
        context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

    /*fun isOnCall(): Boolean {
        val state = telephonyManager.callStateForSubscription
        when (state) {
            TelephonyManager.CALL_STATE_IDLE ->{}
            TelephonyManager.CALL_STATE_OFFHOOK ->{}
            TelephonyManager.CALL_STATE_RINGING ->{}
            else -> {}
        }
    }*/

    override fun getScore(): Int {
        TODO("Not yet implemented")
    }
}