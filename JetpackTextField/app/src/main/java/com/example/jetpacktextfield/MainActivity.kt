package com.example.jetpacktextfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpacktextfield.ui.theme.JetpackTextFieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //SimpleTextField()
            LableAndPlaceholderTextfield()
        }
    }
}

/*@Preview(showSystemUi = true, device = Devices.PIXEL)
@Composable
fun SimpleTextField()
{
    var text by remember {
        mutableStateOf(TextFieldValue("")) }
        TextField(
            value = text,
            onValueChange = {newText ->
            text = newText
        })
}*/
@Preview(showSystemUi = true, device = Devices.PIXEL)
@Composable
fun LableAndPlaceholderTextfield()
{
    var text by remember {
        mutableStateOf(TextFieldValue("")) }
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = {Text(text = "First Name")},
        placeholder = { Text(text = "Enter Your Name Here")}
    )
}


