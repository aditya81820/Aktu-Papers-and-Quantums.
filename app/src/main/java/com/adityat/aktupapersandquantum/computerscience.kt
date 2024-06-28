package com.adityat.aktupapersandquantum

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Computerscience(navController: NavHostController)
{
    val context = LocalContext.current
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        )
        {
            Text(text = "Computer Science",
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline,
                style = TextStyle(
                    fontFamily = FontFamily.Default,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .padding(vertical = 10.dp)

            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 10.dp)
                .verticalScroll(rememberScrollState()),

            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            button2("https://drive.google.com/drive/folders/1RcABBwk-MmjDWsFwKe07cNd4WyHEdmIn?usp=drive_link"
                ,context,"Math IV")
            Spacer(modifier = Modifier.size(10.dp))

            button2("https://drive.google.com/drive/folders/1oKY0PB7tCC7O309yAuUD4fgRfxv-C9EH?usp=drive_link",context,"Universal Human Value " +
                    "and Professional Ethics" , 2)
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1_W-NEgvjl9fPgsmqPOLm-iC9iXh2b68D?usp=drive_link",context,"Technical " +
                    "Communication")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1zKcBu25p6JvDQGCaNkWUSbbgiWKeepca?usp=drive_link",context,"Data Structure")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1syEe5To11-iRe14Ae7YY1QEqKF9VJ5s2?usp=drive_link",context,"Computer Organization " +
                    "and " +
                    "Architecture")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1HbOMyRI32y-_N8gbep6L6xrQNQVAWk1k?usp=drive_link",context,"Discrete Structures & " +
                    "Theory of Logic ")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1hUSugCi_gZTk3ALMb1_Y6COHt7gy178e?usp=drive_link",context,"Python " +
                    "programming")
            Spacer(modifier = Modifier.size(10.dp))

            button2("https://drive.google.com/drive/folders/1YmP-NwMEQitA2D3qW4Aj5POnrW11NZiV?usp=drive_link",context,"Operating System")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/18wriDBj1yZzq--5QKYsz5IHA4OrZcogu?usp=drive_link",context,"Theory of Automata and " +
                    "Formal Languages", 2)
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1jC7LAj8jwwPAoJhZd9mU6G5p6urZbXl6?usp=drive_link",context,"Database Management System")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1JxPcICKjc8CWFqcE-eGeWepYlaUPu_Ou?usp=drive_link",context,"Compiler Design")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1KhlGWZMb-uMeI6g0YRlALAU3Cw6XNdHg?usp=drive_link",context,"Design and Analysis of " +
                    "Algorithm")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1-_0evjTVJF8Iws3iUWpOC6xfZJiOJbYo?usp=drive_link",context,"Constitution of India. Law and " +
                    "Engineering")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1sEHL7JK4NYfN-j_ycN4jxEI3iM6YfbP9?usp=drive_link",context,"Software Engineering")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1axOFRtXB2HIjH9z9A_cLrM6MQ-y9_g0l?usp=drive_link",context,"Web Technology")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1kCmIZdWtaK3lM6FlSh1JhSnl0FQHAMOK?usp=drive_link",context,"Computer Networks")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1CUCNrwshKL5ofvDestr04PhCOcVve0V_?usp=drive_link",context,"Data Analytics")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/16pYK-U9JhwZsVGBMnnyddTvsFdPUUUJf?usp=drive_link",context,"Machine Learning Techniques")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1_cAEv44U7hMBh5xR0G1o41wkUlgv3An7?usp=drive_link",context,"Data Compression")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1O_9uzmFI8Ide0twjgxvnv1_5UpvjFHiF?usp=drive_link",context,"Artificial Intelligence")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/18Qj7d51nHqmhfpauCbWsCfnXUE3mU6bi?usp=drive_link",context,"Cryptography and Network Security")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1ioC5Tqfqr3EzehqI2h_6wE6w1ievriHN?usp=drive_link",context,"Cloud Computing")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/drive/folders/1TnlZxtRtdqL2B-6SteT0wJnql_UQg8Wl?usp=drive_link",context,"Software Project Management")

        }
    }
}

//@Preview
//@Composable
//fun Computersciencepreview(){
//    Computerscience(navController)
//}
