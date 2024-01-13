package com.cipolat.wolfguard.sdk.evaluators.device.call

import android.content.Context
import android.media.AudioManager


class Voip {
    fun isOnCall(context: Context): Boolean {
        val mode = (context.getSystemService(Context.AUDIO_SERVICE) as AudioManager).mode
        return if (AudioManager.MODE_IN_CALL == mode) {
            true
        } else if (AudioManager.MODE_IN_COMMUNICATION == mode) {
            true
        } else AudioManager.MODE_RINGTONE == mode
    }

}