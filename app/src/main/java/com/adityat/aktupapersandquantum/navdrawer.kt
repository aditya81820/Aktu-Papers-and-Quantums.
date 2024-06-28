package com.adityat.aktupapersandquantum
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.adityat.aktupapersandquantum.Computerscience.route

import kotlinx.coroutines.launch



@Composable
fun NavigationDrawerM3(navController: NavHostController) {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val items = listOf(
        DrawerItem(R.drawable.maths, label = "First year", secondaryLabel = "", route),
        DrawerItem(
            R.drawable.java,
            label = "Computer Science",
            secondaryLabel = "",
            Computerscience.route
        ),
        DrawerItem(
            R.drawable.wrench,
            label = "Mechanical Engineering",
            secondaryLabel = "",
            Serviceunavialble.route
        ),
        DrawerItem(R.drawable.signal, label = "ECE", secondaryLabel = "", route),
        DrawerItem(
            R.drawable.engineer,
            label = "Civil Engineering",
            secondaryLabel = "",
            Serviceunavialble.route
        )
    )
    var selectedItem by remember { mutableStateOf(items[0]) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = drawerState.isOpen,
        drawerContent = {
            ModalDrawerSheet {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 64.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "AKTU Content", style = MaterialTheme.typography.headlineLarge)
                }
                items.forEach { item ->
                    NavigationDrawerItem(
                        label = { Text(text = item.label) },
                        selected = item == selectedItem,
                        onClick = {
                            scope.launch { drawerState.close() }
                            selectedItem = item
                            navController.navigate(route)
                        },
                        icon = {
                            Icon(
                                painterResource(id = item.icon),
                                modifier = Modifier.size(25.dp),
                                contentDescription = item.label)
                               },
                        badge = { Text(text = item.secondaryLabel)},
                        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }
            }
        },
        content =  {
            val context = LocalContext.current  // Get context here
            Content2(onMenuIconClick = { scope.launch { drawerState.open()} }, context = context,navController)
        }
    )
}

data class DrawerItem(
    val icon: Int,
    val label: String,
    val secondaryLabel: String,
    val route: String
)

@Composable
fun Content(
    onClick: () -> Unit,

) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = ">>> Swipe >>>")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = onClick) {
            Text(text = "Click to Open")
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Content2(
    onMenuIconClick: () -> Unit,
    context: Context, // Make sure context is passed here
    navController: NavHostController,
) {
    Scaffold(

        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = onMenuIconClick) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Open Drawer")
                    }
                },
                title = { Text(text = "AKTU Content")}
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp)
        ) {

            item {
                //Spacer(modifier = Modifier.height(70.dp))
                Spacer(modifier = Modifier.height(70.dp))
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center
                ) {

                    FilledTonalButton(
                        onClick = {

                            navController.navigate(Questionpapers.route)

                        },
                        modifier = Modifier.size(170.dp, 170.dp)
                    ) {
                        Column(
                            modifier =  Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,

                            ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center,


                                ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.test),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(80.dp)
                                        .padding(vertical = 5.dp)
                                )

                            }
                            Spacer(modifier = Modifier.size(10.dp))
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center,

                                ){
                                Text(
                                    "Question Papers",
                                    textAlign = TextAlign.Center,
                                    textDecoration = TextDecoration.Underline,
                                    style = TextStyle(
                                        fontFamily = FontFamily.Default,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                        }
                    }







                    Spacer(modifier = Modifier.width(10.dp))
                    UrlButton(url = "https://akturesult.online", context = context,
                        R.drawable.result , "Result")
                }

                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    UrlButton(url = "https://erp.aktu.ac.in/Login.aspx", context = context, R.drawable.admitcard , "Admit Card")
                    Spacer(modifier = Modifier.width(10.dp))
                    UrlButton(url = "https://aktu.ac.in/syllabus%202023-2024.html", context = context , R.drawable.img , "Syllabus")

                }
                Spacer(modifier = Modifier.size(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    FilledTonalButton(
                        onClick = {
                            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://erp.aktu.ac.in/WebPages/Public/Students/Dashboard.aspx"))
                            context.startActivity(webIntent)
                        },
                        modifier = Modifier.size(170.dp, 170.dp)
                    ) {
                        Column(
                            modifier =  Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,

                            ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center,


                                ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.aktu),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(80.dp)
                                        .padding(vertical = 5.dp)
                                )

                            }
                            Spacer(modifier = Modifier.size(2.dp))
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center,

                                ){
                                Text(
                                    "Student Dashboard",
                                    textAlign = TextAlign.Center,
                                    textDecoration = TextDecoration.Underline,
                                    style = TextStyle(
                                        fontFamily = FontFamily.Default,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )



                                    // Option 1: Modifier.align(Alignment.CenterHorizontally)
                                    // OR // Option 2: Add padding for vertical adjustment
                                    //.padding(top = 10.dp, bottom = 10.dp)  // Adjust padding as needed
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    FilledTonalButton(
                        onClick = {
                            navController.navigate(Quantum.route)
                        },
                        modifier = Modifier.size(170.dp, 170.dp)
                    ) {
                        Column(
                            modifier =  Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,

                            ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center,


                                ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.img_2),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(80.dp)
                                        .padding(vertical = 5.dp)
                                )

                            }
                            Spacer(modifier = Modifier.size(2.dp))
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center,

                                ){
                                Text(
                                    "Quantums-\nComputer\nscience",
                                    textAlign = TextAlign.Center,
                                    textDecoration = TextDecoration.Underline,
                                    style = TextStyle(
                                        fontFamily = FontFamily.Default,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )



                                    // Option 1: Modifier.align(Alignment.CenterHorizontally)
                                    // OR // Option 2: Add padding for vertical adjustment
                                    //.padding(top = 10.dp, bottom = 10.dp)  // Adjust padding as needed
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun UrlButton(url: String, context: Context, drawableId: Int, s: String) {
    FilledTonalButton(
        onClick = {
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            context.startActivity(webIntent)
        },
        modifier = Modifier.size(170.dp, 170.dp)
    ) {
        Column(
            modifier =  Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,


            ) {
                Icon(
                    painter = painterResource(id = drawableId),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(vertical = 5.dp)
                )

            }
            Spacer(modifier = Modifier.size(10.dp))
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,

            ){
                Text(
                    s,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )



                    // Option 1: Modifier.align(Alignment.CenterHorizontally)
                    // OR // Option 2: Add padding for vertical adjustment
                    //.padding(top = 10.dp, bottom = 10.dp)  // Adjust padding as needed
                )
            }
        }
    }
}


//
//@Preview
//@Composable
//fun NavigationDrawerM3previe(){
//    NavigationDrawerM3(navController)
//}

