package io.github.sebacipolat.wolfguard.sdk.device.call

import android.content.Context
import android.media.AudioManager

class Voip {
    /**
     *Let you known if there are an active voice call over voip,
     *like whatsapp call, skype, etc
     *@param context:Context Android context
     *@return boolean
     */
    fun isOnCall(context: Context): Boolean {
        val mode = (context.getSystemService(Context.AUDIO_SERVICE) as AudioManager).mode
        return if (AudioManager.MODE_IN_CALL == mode) {
            true
        } else if (AudioManager.MODE_IN_COMMUNICATION == mode) {
            true
        } else AudioManager.MODE_RINGTONE == mode
    }

}