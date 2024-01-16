package io.github.sebacipolat.wolfguard

import io.github.sebacipolat.wolfguard.sdk.device.Device

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

    /**
     * Get Device Instance
     */
    fun getDevice() = device
}
