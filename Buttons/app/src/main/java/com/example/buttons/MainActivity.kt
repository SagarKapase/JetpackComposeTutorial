package com.example.buttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buttons.ui.theme.ButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleButton()
        }
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL)
@Composable
fun SimpleButton()
{
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){
        Button(onClick = {}, modifier = Modifier
            .width(400.dp)
            .height(50.dp)) {
            Text(text = "Button Default Button", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {

        }
            ,modifier = Modifier
                .width(400.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Gray)) {
            Text(text = "Button with Gray Color", color = Color.White, fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {},
            modifier = Modifier.width(400.dp)
                .height(50.dp)) {
            Image(painterResource(id = R.drawable.cart),
                contentDescription = "Cart Image Button",
                modifier = Modifier.size(20.dp))
            Text(text = "Icon Button",Modifier.padding(start = 10.dp))
        }

    }
}