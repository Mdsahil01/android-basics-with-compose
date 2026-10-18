package com.mdsahil.birthday.unit2.kotlinfundamentals.classesobjects

class SmartLightDevice(
    deviceName: String,
    deviceCategory: String
) : SmartDevice(
    name = deviceName,
    category = deviceCategory
        ) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(
        initialValue = 0,
        minValue = 0,
        maxValue = 100
    )


    fun  increasingBrightness(){
        brightnessLevel++
        println("Brightness increased to $brightnessLevel")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on.The bightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel =0
        println("Smart Light turned off")
    }
}