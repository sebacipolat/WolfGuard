package com.cipolat.wolfguard

import com.cipolat.wolfguard.sdk.evaluators.device.Device

class WolfGuard private constructor() {
    companion object {

        @Volatile
        private var instance: WolfGuard? = null
        private lateinit var device: Device

        fun getInstance() =
            instance ?: synchronized(this) {
                device = Device()
                instance ?: WolfGuard().also {
                    instance = it
                }
            }
    }

    fun getDevice() = device
}
