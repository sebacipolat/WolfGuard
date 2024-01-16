package io.github.sebacipolat.wolfguard.sdk.device

import java.util.UUID

class DeviceID {
    /**
     * Return a random hash to use as device id.
     * @return  returns string
     */
    fun getID(): String {
        return UUID.randomUUID().toString()
    }
}