package com.cipolat.wolfguard.sdk.evaluators.device

import com.cipolat.wolfguard.sdk.evaluators.device.call.Voip

class Device {

    var emulator = Emulator()
        private set
    var root = Root()
        private set
    var unknownSources = UnknownSources()
        private set
    var usbDebug = UsbDebug()
        private set
    var voip = Voip()
        private set
    var deviceID = DeviceID()
        private set
}