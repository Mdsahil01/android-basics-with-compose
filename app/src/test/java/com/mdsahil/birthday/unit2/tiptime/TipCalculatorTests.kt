package com.mdsahil.birthday.unit2.tiptime

import org.junit.Test
import org.junit.Assert.assertEquals
import java.text.NumberFormat
import java.util.Locale

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundUp(){

        val amount = 10.00
        val tipPercent = 20.00

        val expectedTip = NumberFormat.getCurrencyInstance(
            Locale("en","IN")
        ).format(2)


        val actualTip = calculateTip(
            amount = amount,
            tipPercent = tipPercent,
            roundUp = false
        )

        assertEquals(expectedTip,actualTip)

    }

}