package com.cipolat.wolfguard.sdk.evaluators.device

import java.util.UUID

class DeviceID {

    fun getID(): String {
        return UUID.randomUUID().toString()
    }
}