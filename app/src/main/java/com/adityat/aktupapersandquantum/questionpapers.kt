package com.adityat.aktupapersandquantum

import android.app.Activity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController



@Composable
fun Questionpapaers(navController: NavHostController)
{

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    )
    {
        Text(text = "Question Papers",
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
            .padding(vertical = 80.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        button("First Year",navController, Firstyear.route)
        button("Computer Science", navController, Computerscience.route)
        button(
            "Mechanical Engineering",
            navController,
            Serviceunavialble.route
        )
        button("ECE", navController, Serviceunavialble.route)
        button("Civil Engineering", navController, Serviceunavialble.route)


    }
}
@Composable
fun button(
    s: String,
    navController: NavHostController,
    route1: String,
    )
{
    Button(onClick = {
        navController.navigate(route1)
            },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .size(40.dp, 90.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize(),

        ) {
            Text(text = s,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.None,
                style = TextStyle(
                    fontFamily = FontFamily.Serif,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier
                    .padding(vertical = 20.dp)

            )
        }
    }
}
//@Preview
//@Composable
//fun Questionpaperspreview(){
//    Questionpapaers(navController)
//}
