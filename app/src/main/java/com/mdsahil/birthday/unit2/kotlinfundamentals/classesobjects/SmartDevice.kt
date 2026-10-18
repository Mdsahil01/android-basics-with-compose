package com.mdsahil.birthday.unit2.kotlinfundamentals.classesobjects

open class SmartDevice(
    val name: String,
    val category: String
) {
    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    open fun turnOn(){
        deviceStatus = "on"
    }

    open fun turnOff(){
        deviceStatus = "off"
    }

}