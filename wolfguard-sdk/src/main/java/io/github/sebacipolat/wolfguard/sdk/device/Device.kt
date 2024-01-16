package io.github.sebacipolat.wolfguard.sdk.device

import io.github.sebacipolat.wolfguard.sdk.device.call.Voip

class Device {
    var emulator = Emulator()
        private set
    var root = Root()
        private set
    var usbDebug = UsbDebug()
        private set
    var voip = Voip()
        private set
    var deviceID = DeviceID()
        private set
}