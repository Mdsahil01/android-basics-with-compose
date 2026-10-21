package com.mdsahil.birthday.unit2.lemonade

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mdsahil.birthday.R

@Preview
@Composable
fun LemonadeApp(){
    var currentStep by remember { mutableIntStateOf(1) }
    var squeezeCount by remember { mutableIntStateOf(0) }
    var squeezesNeeded by remember { mutableIntStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                when (currentStep) {
                    1 -> R.drawable.lemon_tree
                    2 -> R.drawable.lemon_squeeze
                    3 -> R.drawable.lemon_drink
                    else -> R.drawable.lemon_restart
                }
            ),
            null,
            modifier = Modifier
                .size(200.dp)

                .clickable {
                    when (currentStep) {
                        1 -> {
                            currentStep = 2
                            squeezeCount = 0
                            squeezesNeeded = (2..4).random()
                        }

                        2 -> {
                            squeezeCount++

                            if (squeezeCount >= squeezesNeeded) {
                                currentStep = 3
                            }
                        }

                        3 -> {
                            currentStep = 4
                        }

                        4 -> {
                            currentStep = 1
                        }
                    }
                }


        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = stringResource(
                when (currentStep) {
                    1 -> R.string.lemon_tree
                    2 -> R.string.lemon
                    3 -> R.string.glass_of_lemonade
                    else -> R.string.empty_glass
                }
            ),
            fontSize = 18.sp
        )


    }

}