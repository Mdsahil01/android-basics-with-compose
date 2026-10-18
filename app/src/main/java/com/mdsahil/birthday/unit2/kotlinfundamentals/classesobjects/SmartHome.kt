package com.mdsahil.birthday.unit2.kotlinfundamentals.classesobjects

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount =0
        private set

    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }
    fun turnOffLight(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseLightBrightness(){
        smartLightDevice.increasingBrightness()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOffLight()
    }
}