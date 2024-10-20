package com.example.jetpacktextfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacktextfield.ui.theme.JetpackTextFieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //SimpleTextField()
            //LableAndPlaceholderTextfield()
            //KeyboardOptionsTextField()
            //OutlinedTextFieldExample()
            TextFieldWithIcons()
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
/*@Composable
fun LableAndPlaceholderTextfield()
{
    Column (modifier = Modifier.padding(top = 100.dp, start = 100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        var text by remember {
            mutableStateOf(TextFieldValue("")) }
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {Text(text = "First Name")},
            placeholder = { Text(text = "Enter Your First Name")}
        )
    }
}*/

/*@Composable
fun KeyboardOptionsTextField()
{
    Column (modifier = Modifier.padding(top = 100.dp, start = 100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        var text by remember {
            mutableStateOf(TextFieldValue("")) }
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {Text(text = "Number Input Type")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

        )
    }
}*/

/*@Composable
fun OutlinedTextFieldExample()
{
    Column (modifier = Modifier.padding(top = 100.dp, start = 100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        var text by remember {
            mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            value = text,
            label = { Text(text = "Enter your name")},
            onValueChange = {
                text = it
            }
        )
    }
}*/
@Composable
fun TextFieldWithIcons()
{
    Column (modifier = Modifier.padding(top = 100.dp, start = 100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        var text by remember {
            mutableStateOf(TextFieldValue("")) }
        return OutlinedTextField(
            value = text,
            leadingIcon = { Icon(imageVector = Icons.Default.Email,
                contentDescription = "emailIcon")},
            label = { Text(text = "Email Address")},
            placeholder = { Text(text = "Enter your Email")},
            onValueChange = {
                text = it
            }
        )
    }
}


