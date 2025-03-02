package com.example.thirtydays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydays.data.ThirtyDays
import com.example.thirtydays.data.daysItems
import com.example.thirtydays.ui.theme.ThirtyDaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThirtyDaysTheme {
                ThirtyDaysApp()
            }
        }
    }
}


@Composable
fun DayTitle(dayText: Int, modifier: Modifier = Modifier) {
    Text(text = stringResource(dayText),modifier = modifier)
}

@Composable
fun TodoTittle(todoText: Int, modifier: Modifier = Modifier) {
    Text(text = stringResource(todoText),modifier = modifier)
}

@Composable
fun ImageOfTheDay(dayImage : Int,modifier: Modifier = Modifier){
    Image(painter = painterResource(dayImage), contentDescription = stringResource(R.string.thirty_days_tips), contentScale = ContentScale.Fit,  modifier = modifier)
}

@Composable
fun TextActivity(textActivity: Int,modifier: Modifier = Modifier){
    Text(text = stringResource(textActivity),modifier = modifier)
}


@Composable
fun ThirtyDaysColumn(columnsItems: ThirtyDays, modifier: Modifier = Modifier){
    Card (modifier = modifier){
        Column(modifier = modifier){
            DayTitle(dayText = columnsItems.day)
            TodoTittle(todoText = columnsItems.todoTittleText)
            ImageOfTheDay(dayImage = columnsItems.dayImage,modifier = Modifier.fillMaxWidth())
            TextActivity(textActivity = columnsItems.dayActivity)
        }
    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ThirtyDaysApp() {
    LazyColumn {
        items(daysItems){
            ThirtyDaysColumn(columnsItems = it, modifier = Modifier.padding(8.dp).fillMaxSize())
        }
    }
}