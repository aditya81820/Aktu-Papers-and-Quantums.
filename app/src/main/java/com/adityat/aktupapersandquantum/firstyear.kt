package com.adityat.aktupapersandquantum

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun firstyear(navController: NavHostController)
{
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    )
    {
        Text(text = "First year",
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            style = TextStyle(
                fontFamily = FontFamily.Default,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .padding(vertical = 20.dp)

        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 80.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        button2("https://drive.google.com/drive/folders/1V--JDSQJk91-vxr1Gtm1wFUfyiCKtbKK?usp=drive_link",context,"Engineering Maths 1")
        button2("https://drive.google.com/drive/folders/1cWJTvK5YhVmGzcN8HRAsE5PyqtgFivtn?usp=drive_link",context,"Engineering Maths 2")
        button2("https://drive.google.com/drive/folders/1e7CFYQAK6uYzhknJIHRD6xDgutJcqwyi?usp=drive_link",context,"Engineering Physics")
        button2("https://drive.google.com/drive/folders/1ptP-27-QLLObKbyu0I9LNLVOQKMHDStX?usp=drive_link",context,"Engineering Chemistry")
        button2("https://drive.google.com/drive/folders/1Qbu9dnkjNqlhj4_4exzyqSzDJOjCgTF4?usp=drive_link",context,"Fundamentals of " +
                "Electrical Engineering")
        button2("https://drive.google.com/drive/folders/1eYo4JVn5AFWKNQYbLeBFHwxuZ2FPG4qH?usp=drive_link",context,"Fundamentals of " +
                "Electronics Engineering")
        button2("https://drive.google.com/drive/folders/1C379aCP33ZxBS7qADWhdz49njbIQmbKb?usp=sharing",context,"Fundamentals of " +
                "Mechanical Engineering ")
        button2("https://drive.google.com/drive/folders/1mp9mMc0n1EzRJiRxPQhDvV266X8parUv?usp=drive_link",context,"Environment and " +
                "Ecology")
        button2("https://drive.google.com/drive/folders/1b8wMBQPF-S0dWEt0qU8A_rLG1dStr2fG?usp=drive_link",context,"Soft Skills")
        button2("https://drive.google.com/drive/folders/1g9XeVyzcth1V5ITGp4hj3unrpXu6KiNW?usp=drive_link",context,"Programming for " +
                "Problem Solving ")





    }
}

//@Preview
//@Composable
//fun firstyearpreview(){
//    firstyear(navController)
//}
