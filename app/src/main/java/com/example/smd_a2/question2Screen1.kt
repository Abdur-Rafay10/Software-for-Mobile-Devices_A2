package com.example.smd_a2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.TopEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smd_a2.ui.theme.SMD_A2Theme

class question2Screen1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SMD_A2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WeatherApp()
                }
            }
        }
    }
}
@Composable
fun WeatherApp() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF242444)),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "MUMBAI",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 30.dp, top = 30.dp)
        )

        Text(
            text = "28°C",
            color = Color.White,
            fontSize = 40.sp,
            modifier = Modifier
                .padding(start = 30.dp, top = 10.dp)
        )

        Text(
            text = "SUNNY",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 30.dp, top = 10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.city3),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .size(300.dp)
                .height(200.dp)
                .padding(top = 20.dp)
        )


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    SMD_A2Theme {

            WeatherApp()


    }
}