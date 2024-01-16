<p align="center">
<img src="/images/banner.png"/>
</p>
A RASP (Runtime Application Self-Protection) solution for protecting Android apps.
</br>
</br>

[![Kotlin](https://img.shields.io/badge/kotlin-1.8.10-blue)]()
[![Android](https://img.shields.io/badge/minAndroidSDK-24-brightgreen)](https://developer.android.com/about/versions/nougat)
[![Android](https://img.shields.io/badge/targetAndroidSDK-34-brightgreen)](https://developer.android.com/about/versions/14)
[![last-version](https://img.shields.io/badge/last_version-1.0.2-blue)]()

</br>

In the dynamic landscape of mobile applications, ensuring robust security is paramount. Adopting a proactive approach to safeguarding Android applications has become imperative in the face of evolving cyber threats

## Features
* Emulation detection
* Root Detection
* Usb Debug detection
* Vopi Call detection

> [!NOTE]  
> This sdk is still in development
> 
> See [Versioning](#versioning) section for more information. 


## Getting started

First ensure that you have defined `mavenCentral` in your Gradle configuration.

```groovy
repositories {
    mavenCentral()
}
```

Next, add wolfguard as a dependency to your project.

Groovy
```groovy
dependencies {
    implementation 'io.github.sebacipolat:wolfguard-sdk:{version}'
}
```
Kts

```kts
dependencies {
    implementation("io.github.sebacipolat:wolfguard-sdk:{version}")
}
```


## Emulation detection

Do you want to know if your app is running into a emulator?

Get a boolean value with

```kotlin
WolfGuard.getInstance().getDevice().emulator.isEmulator()
```

## Root detection

Do you want to know if your app is running into a root device?

We use rootber https://github.com/scottyab/rootbeer to make these detection

You will need provide an Android context to get a boolean value with

```kotlin
WolfGuard.getInstance().getDevice().root.isRooted(context)
```

## Usb Debug mode detection

Do you want to know if your app is running into a device with the usdb debug mode enabled?

You will need provide an Android context to get a boolean value with

```kotlin
WolfGuard.getInstance().getDevice().usbDebug.isEnabled(context)
```
## Voip Call detection

Do you want to know if your app is running into a device with an active voip call, like whatsapp, skype?

You will need provide an Android context to get a boolean value with

```kotlin
WolfGuard.getInstance().getDevice().voip.isOnCall(context)
```

## Sample App
There are an sample app to test easily our sdk, just clone the wolfguard repo and open the app project.

<img src="/images/screen_1.png"/>

## Demo

| Feature   | Demo | 
|-----------|------|
| Voip Call | <img src="/images/voip.gif" align="right" width="320"/>    | 
| Usb Debug | <img src="/images/usb.gif" align="right" width="320"/>    | 
|           |      | 

# License
```xml
Designed and developed by 2024 Sebastian Cipolat

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
