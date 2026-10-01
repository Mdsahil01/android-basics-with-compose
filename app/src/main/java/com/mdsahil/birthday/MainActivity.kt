package com.mdsahil.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mdsahil.birthday.ui.theme.BirthdayTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Phone
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayTheme {

                 BusinessCard()
            }
        }
    }
}

    @Composable
    fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = message,
                fontSize = 100.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = from,
                fontSize = 36.sp,
                modifier = Modifier
                    .padding(16.dp)
            )
        }
    }

    @Composable
    fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
        val image = painterResource(R.drawable.androidparty)

        Box(

         ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.5F
            )
            GreetingText(
                message = message,
                from = from,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            )
        }
    }

@Composable
fun BusinessCard(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(
            24.dp,
            Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Profile(full_name = "Mohammed Sahil", title = "Student")
        ContactInfo(phone_num = "+91 1234567890", social_handle = "@Mdsahil01", email = "mohammedsahil@gmail.com")
    }
}




@Composable
fun Profile(full_name: String,title: String ) {
    val image = painterResource(R.drawable.profile)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        Image(

            painter = image,
            contentDescription = "Profile picture",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = full_name
        )
        Text(
            text = title
        )
    }
}
@Composable
fun ContactInfo(phone_num : String,social_handle : String,email: String){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row() {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Phone"
            )
            Text(
                text =  phone_num
            )
        }
        Row() {
            Icon(
                imageVector = Icons.Default.Language,
                contentDescription = "Social"
            )
            Text(
                text =  social_handle
            )
        }
        Row() {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email"
            )
            Text(
                text =  email
            )
        }
    }

}


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun BirthdayCardPreview() {
        BirthdayTheme {

             BusinessCard()
        }
    }
