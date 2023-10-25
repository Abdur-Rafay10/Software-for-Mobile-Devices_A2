package com.example.smd_a2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smd_a2.ui.theme.SMD_A2Theme

class question2Screen2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SMD_A2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WeatherApp2()
                }
            }
        }
    }
}
@Composable
fun WeatherApp2() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(0.65f)) {
            TopLeftCard(
                heading = stringResource(R.string.location),
                para = stringResource(R.string.para5),
                background = Color.White,
                modifier = Modifier.weight(1.5f)
            )
            ToprightCard(
                description= stringResource(R.string.description),
                background = Color.LightGray,
                modifier = Modifier
                    .weight(1f)

            )
        }

        Column(Modifier.weight(1f)) {
            BottomFirstCard(
                title = stringResource(R.string.title1),
                condition = stringResource(R.string.condition1),
                temp = stringResource(R.string.temp1),
                background = Color.Blue,
                modifier = Modifier.weight(0.5f)
            )
            BottomSecondCard(
                title = stringResource(R.string.title2),
                condition = stringResource(R.string.condition2),
                temp = stringResource(R.string.temp2),
                background = Color.White,
                modifier = Modifier.weight(0.5f)
            )
            BottomSecondCard(
                title = stringResource(R.string.title3),
                condition = stringResource(R.string.condition3),
                temp = stringResource(R.string.temp3),
                background = Color.White,
                modifier = Modifier.weight(0.5f)
            )
        }
    }
}

@Composable
private fun TopLeftCard(
    heading: String,
    para: String,
    background: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.Start
    ) {

        Icon(
            imageVector = Icons.Rounded.ArrowBack,
            contentDescription = "arrow",
            tint = Color.DarkGray
        )
        Text(
            text = heading,
            modifier = Modifier.padding(bottom = 15.dp).align(Alignment.CenterHorizontally),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )
        Icon(
            imageVector = Icons.Rounded.MoreVert,
            contentDescription = "More",
            tint = Color.DarkGray,
            modifier = Modifier.align(Alignment.End).padding(bottom = 10.dp)
        )
        Text(
            text = para,
            textAlign = TextAlign.Justify,
            color = Color.DarkGray
        )
        buttonCard(background =  Color.White,)
    }
}
@Composable
private fun ToprightCard(
    description: String,
    background: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(background),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            imageVector = Icons.Rounded.Add,
            contentDescription = "plus",
            tint = Color.DarkGray,
            modifier = Modifier.padding( top=50.dp).align(Alignment.CenterHorizontally)
        )

        Text(
            text = description,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold
        )

    }
}



@Composable
private fun BottomFirstCard(
    title: String,
    condition: String,
    temp: String,
    background: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(1.dp),
        horizontalAlignment = Alignment.Start
    ) {

        Text(
            text = title,
            modifier = Modifier.padding(bottom = 10.dp),
            fontWeight = FontWeight.Bold ,
            fontSize = 35.sp,
            color = androidx.compose.ui.graphics.Color.White
        )

        Text(
            text = condition,
            textAlign = TextAlign.Justify,
            color = androidx.compose.ui.graphics.Color.White
        )
        Text(
            text = temp,
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold ,
            fontSize = 20.sp,
            color = androidx.compose.ui.graphics.Color.Magenta,
            modifier = Modifier.align(Alignment.End).padding(bottom = 30.dp)
        )

    }
}
@Composable
private fun BottomSecondCard(
    title: String,
    condition: String,
    temp: String,
    background: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(1.dp),
        horizontalAlignment = Alignment.Start
    ) {

        Text(
            text = title,
            modifier = Modifier.padding(bottom = 10.dp),
            fontWeight = FontWeight.Bold ,
            fontSize = 35.sp,
            color = androidx.compose.ui.graphics.Color.Blue
        )

        Text(
            text = condition,
            textAlign = TextAlign.Justify,
            color = androidx.compose.ui.graphics.Color.Blue
        )
        Text(
            text = temp,
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold,
            color = androidx.compose.ui.graphics.Color.Blue,
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.End).padding(bottom = 30.dp)
        )

    }
}
@Composable
private fun buttonCard(

    background: Color,
    elevation: Dp = 8.dp,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Button(
            colors= ButtonDefaults.buttonColors(Color.LightGray),
            onClick = {
                // Handle button click action here
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = "Choose place",color = androidx.compose.ui.graphics.Color.Blue)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    SMD_A2Theme {
        WeatherApp2()
    }
}