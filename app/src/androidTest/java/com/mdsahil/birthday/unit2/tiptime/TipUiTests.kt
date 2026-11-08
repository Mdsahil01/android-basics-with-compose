package com.mdsahil.birthday.unit2.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test

class TipUiTests{

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip(){
        composeTestRule.setContent {
            TipTimeScreen()
        }

        composeTestRule
            .onNodeWithText("Bill Amount")
            .performTextInput("10")

        composeTestRule
            .onNodeWithText("Tip Percentage")
            .performTextInput("20")

        composeTestRule
            .onNodeWithText("Tip Amount: ₹2.00")
            .assertExists()
    }
}