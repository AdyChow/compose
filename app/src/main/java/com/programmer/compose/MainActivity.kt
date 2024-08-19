package com.programmer.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
        Row(Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.test),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(text = msg.name)
                Spacer(modifier = Modifier.height(8.dp))
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