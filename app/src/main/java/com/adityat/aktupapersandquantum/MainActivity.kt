package com.adityat.aktupapersandquantum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.adityat.aktupapersandquantum.ui.theme.AktuPapersAndQuantumTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            AktuPapersAndQuantumTheme {
                MyNavigation()
            }
        }
    }

}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = firstpaged.route ) {
        composable(firstpaged.route) {

            firstpage(navController)
        }
        composable(Questionpapers.route) {

            Questionpapaers(navController)
        }
        composable(Firstyear.route) {
            firstyear(navController)
        }
        composable(Computerscience.route) {

            Computerscience(navController)
        }
        composable(Serviceunavialble.route) {
            ServiceUnavailableScreen(navController)
        }
        composable(Quantum.route) {
            Quantum(navController)
        }


    }
}


