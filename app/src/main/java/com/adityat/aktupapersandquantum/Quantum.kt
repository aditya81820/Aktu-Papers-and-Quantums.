package com.adityat.aktupapersandquantum
import android.content.Context
import android.content.Intent
import android.net.Uri
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
fun Quantum(navController: NavHostController)
{
    val context = LocalContext.current
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        )
        {
            Text(text = "Computer Science Quantums",
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
            button2("https://drive.google.com/file/d/1cQZTacgI2QjJEaiayxKMEa4LPdvAS_jr/view?usp=drive_link"
                ,context,"Math IV")
            Spacer(modifier = Modifier.size(10.dp))

            button2("https://drive.google.com/file/d/1K4zMDqkt7i9JabWNen5ldu2RIRsc5uXa/view?usp=drive_link",context,"Universal Human Value " +
                    "and Professional Ethics" , 2)
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1pAcjA5iLvWd3N8BpnIwrZMC3KYJAMEOi/view?usp=drive_link",context,"Technical " +
                    "Communication")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/180n24NdsNdmoLqS_ag6CnJLeB6n2kis7/view?usp=drive_link",context,"Data Structure")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1dXVxxi-oURY72UX2H-GmQP8ohExw1mH5/view?usp=drive_link",context,"Computer Organization " +
                    "and " +
                    "Architecture")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1BIgyQ0-U8OriWCG-2hLitRbAO5NRs1ud/view?usp=drive_link",context,"Discrete Structures & " +
                    "Theory of Logic ")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/13GshtV03OGZwsX7sKA6SEHlyVdBSzHZd/view?usp=drive_link",context,"Python " +
                    "programming")
            Spacer(modifier = Modifier.size(10.dp))

            button2("https://drive.google.com/file/d/18YEwMuafFikBscI2Fy2GJtSabaU0kgaK/view?usp=drive_link",context,"Operating System")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1NR3knf9IiFTu7jjA-5FNerxqtErkayzr/view?usp=drive_link",context,"Theory of Automata and " +
                    "Formal Languages", 2)
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1uAEe3SfFxQ3-oo4BcaFoKrknaAP8q0Ca/view?usp=drive_link",context,"Database Management System")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1YxQeJsPH4aryq4PqruxUulZv4nMp3H-c/view?usp=drive_link",context,"Compiler Design")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/14_KCDOrXxSlukYCXBCrbef6-nrOK95k-/view?usp=drive_link",context,"Design and Analysis of " +
                    "Algorithm")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1kqaC_36FzX3BwXZZVnfRzFDOMPUtYi8y/view?usp=drive_link",context,"Constitution of India. Law and " +
                    "Engineering")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1lJOhvYY2ZNFKa9668xC-PLB-HnQC0Hjo/view?usp=drive_link",context,"Software Engineering")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1vMLU0c_wth2Y6Fg0_lNHdg9obhSOuesa/view?usp=drive_link",context,"Web Technology")
            Spacer(modifier = Modifier.size(10.dp))

            button2("https://drive.google.com/file/d/1Yi1mRXO9YkTBBqhQ5OWWQf0yg_HVaYJm/view?usp=drive_link",context,"Computer Networks")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/16EMJ9eYZk2GoP8UF4NZ0m-Ka-uusQCl2/view?usp=drive_link",context,"Indian Tradition")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1LDvF6WkeUJhpGeD6MuQY9bogdXA-VGV6/view?usp=drive_link",context,"Data Analytics")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1xO5iqYXTj1_neKKiGasR-cm9eLrQ-TmW/view?usp=drive_link",context,"Machine Learning Techniques")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1NiKcRq66_zXZnrmc9YqWngu01-wM0OqT/view?usp=drive_link",context,"Data Compression")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/19jkBgxputdnSCAmJXFidJTjTUrWvkYl5/view?usp=drive_link",context,"Artificial Intelligence")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/198VASXisqSUg68cDVqySrFna3_oHmb_2/view?usp=drive_link",context,"Cryptography and Network Security")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1xBTzdNJ_2ZFNbot33IYHh3OapjjKlbdE/view?usp=drive_link",context,"Cloud Computing")
            Spacer(modifier = Modifier.size(10.dp))
            button2("https://drive.google.com/file/d/1_IfhqS5vTIKddROrrNpLWZ6F_SSkDRnP/view?usp=drive_link",context,"Software Project Management")

        }
    }
}
@Composable
fun button2(url: String, context: Context, s: String, size: Int = 6)
{
    Button(onClick = {
        val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        context.startActivity(webIntent)
    },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .size(38.dp, 50.dp),
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
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier
                    .padding(vertical = size.dp)


            )
        }
    }
}
//@Preview
//@Composable
//fun Quantumpreview(){
//    Quantum(navController)
//}
