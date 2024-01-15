package io.github.sebacipolat.wolfguard.sdk.device

import java.util.UUID

class DeviceID {

    fun getID(): String {
        return UUID.randomUUID().toString()
    }
}