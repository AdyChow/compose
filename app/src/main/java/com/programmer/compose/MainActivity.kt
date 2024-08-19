package com.programmer.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MessageCard(Message("Android", "Compose is awesome!"))
        }
    }

    data class Message(val name: String, val body: String)

    @Composable
    fun MessageCard(msg: Message) {
        Row {
            Image(painter = painterResource(id = R.drawable.test), contentDescription = "")
            Column {
                Text(text = msg.name)
                Text(text = msg.body)
            }
        }

    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard(Message("Android", "Compose is awesome!"))
    }
}