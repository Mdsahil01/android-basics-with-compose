package com.mdsahil.birthday.unit2.kotlinfundamentals.classesobjects

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/*
* SmartDevice stores the common name, category, and status of a device.
* SmartTvDevice inherits SmartDevice and manages speaker volume and channels.
* SmartLightDevice inherits SmartDevice and manages brightness.
* Both child classes override turnOn() and turnOff() for their own behavior.
* RangeRegulator prevents volume, channel, and brightness values from exceeding their limits.
* SmartHome holds both devices and provides functions to control them.
* main() uses one SmartDevice variable to turn on a TV and then a light.
* The correct turnOn() runs automatically depending on which device the variable holds.
* deviceTurnOnCount tracks device on/off calls, but doesn't prevent incorrect counting on repeated calls.
*
* open class means other classes can inherit from it
*/

fun main() {
    val tv = SmartTvDevice("Android TV", "Entertainment")
    val light = SmartLightDevice("Google Light", "Utility")

    val smartHome = SmartHome(tv, light)

    smartHome.turnOnTv()
    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()

    smartHome.turnOnLight()
    smartHome.increaseLightBrightness()
}