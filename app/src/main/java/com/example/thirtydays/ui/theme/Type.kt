package com.example.thirtydays.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.thirtydays.R

// Set of Material typography styles to start with

val montserate = FontFamily(
    Font(R.font.montserrat_bold),
    Font(R.font.montserrat_regular, weight = FontWeight.Bold)
)
val abrilFatFace = FontFamily(Font(R.font.abril_fatface_regular))

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = abrilFatFace,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal
    ),
    displayMedium = TextStyle(
        fontFamily = montserate,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)