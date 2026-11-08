package com.mdsahil.birthday.unit2.artspace

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mdsahil.birthday.R



 data class Artwork(
    val imageRes: Int,
    val title: String,
    val details: String
 )

val artworks = listOf(
    Artwork(
        R.drawable.mysuru_palace,
        "Mysuru Palace",
        "Mysuru,Karnataka • 2026"
    ),
    Artwork(
        R.drawable.bidar_palace,
        "Bidar Fort",
        "Bidar, Karnataka • 2026"
    ),

    Artwork(
        R.drawable.bahamani_palace,
        "Bahamani Palace",
        "Karnataka • 2026"
    ),

    Artwork(
        R.drawable.madno_icream,
        "Madno Ice Cream",
        "Bengaluru, Karnataka • 2026"
    )
)


@Preview
@Composable
fun ArtSpaceScreen(){

    var currentArtwork by remember { mutableStateOf(0) }
    val artwork = artworks[currentArtwork]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
         Image(
             painter = painterResource( artwork.imageRes),
             contentDescription = artwork.title
         )

        Text(
            text = artwork.title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = artwork.details,
            fontSize = 16.sp
        )


        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = {
                    currentArtwork =
                        (currentArtwork - 1 + artworks.size) % artworks.size
                }
            ){
                Text("Previous")
            }

            Button(
                onClick = {
                    currentArtwork = (currentArtwork + 1) % artworks.size
                }
            ) {
                Text("Next")
            }

        }



    }

}