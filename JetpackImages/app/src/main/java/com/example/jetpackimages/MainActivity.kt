package com.example.jetpackimages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackimages.ui.theme.JetpackImagesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //SimpleImage()
            //CircleImageView()
            RoundCornerImageView()
        }
    }
}

/*@Preview(device = Devices.PIXEL, showSystemUi = true)
@Composable
fun SimpleImage()
{
    Image(
        painter = painterResource(id = R.drawable.nature),
        contentDescription = "Nature Image",
        modifier = Modifier.fillMaxWidth()
    )
}*/
/*
@Preview(device = Devices.PIXEL, showSystemUi = true)
@Composable
fun CircleImageView()
{
    Image(
        painter = painterResource(id = R.drawable.nature),
        contentDescription = "Nature Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(128.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Gray, CircleShape)
    )
}*/
@Preview(device = Devices.PIXEL, showSystemUi = true)
@Composable
fun RoundCornerImageView()
{
    Image(
        painter = painterResource(id = R.drawable.nature),
        contentDescription = "Nature Image",
        contentScale = ContentScale.Crop,
        alignment = Alignment.Center,
        modifier = Modifier
            .size(128.dp)
            .clip(RoundedCornerShape(10))
            .border(2.dp, Color.Gray, RoundedCornerShape(10))
    )
}
