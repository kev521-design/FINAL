package com.kevin.horrizonuniversity.ui.screens.StartScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kevin.horrizonuniversity.R
import com.kevin.horrizonuniversity.navigation.ROUTE_ADMISSIONS
import com.kevin.horrizonuniversity.navigation.ROUT_ENROLL
import com.kevin.horrizonuniversity.navigation.ROUT_EVENTS
import com.kevin.horrizonuniversity.navigation.ROUT_HISTORY
import com.kevin.horrizonuniversity.navigation.ROUT_HOME
import com.kevin.horrizonuniversity.navigation.ROUT_INFORMATION
import com.kevin.horrizonuniversity.navigation.ROUT_INQUIRY
import com.kevin.horrizonuniversity.ui.theme.newblue
import com.kevin.horrizonuniversity.ui.theme.newpink
import com.kevin.horrizonuniversity.ui.theme.newwhite
import org.intellij.lang.annotations.JdkConstants.TitledBorderTitlePosition


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(navController: NavController){



    Spacer(modifier = Modifier.width(20.dp))


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(



        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newblue,
            ){
                NavigationBarItem(
                    icon = { Icon(
                        Icons.Default.Home,
                        tint = newwhite,
                        contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(
                        Icons.Default.Favorite,
                        tint = newwhite,
                        contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(
                        Icons.Default.Person,
                        tint = newwhite,
                        contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )


                NavigationBarItem(
                    icon = { Icon(
                        Icons.Default.Info,
                        tint = newwhite,
                        contentDescription = "Info") },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        navController.navigate(ROUT_INFORMATION)
                    }
                )


            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = newwhite,
            ) {
                Icon(
                    Icons.Default.Add, contentDescription = "Add",
                    tint = newpink
                    )
            }
        },
//End of FloatingActionButton





                //Content

        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {

                //Main Contents of the page

                //Row1
                Row (modifier = Modifier.padding(start = 20.dp, top = 35.dp)
                ){

                    //Card1
                    Card (
                        modifier = Modifier
                            .width(100.dp)
                            .height(150.dp)
                            .clickable{navController.navigate(ROUT_HISTORY)}
                    ){

                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.img_7),
                               contentDescription = "blouse",
                                modifier = Modifier
                                    .fillMaxSize(),
                                     contentScale = ContentScale.Crop
                           )
                        }
                    }
                    //end of card1



                    Spacer(modifier = Modifier.width(13.dp))

                    //Card2
                    Card (
                        modifier = Modifier
                            .width(100.dp).
                            height(150.dp)
                            .clickable{navController.navigate(ROUT_INFORMATION)}
                    ){

                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.img_8),
                                contentDescription = "blouse",
                                modifier = Modifier
                                    .fillMaxSize(),
                                    contentScale = ContentScale.Crop
                            )

                            Text(text = "News", fontSize = 15.sp)

                        }

                    }
                    //end of card2


                    Spacer(modifier = Modifier.width(13.dp))

                    //Card2
                    Card (
                        modifier = Modifier
                            .width(100.dp).
                            height(150.dp)
                            .clickable{navController.navigate(ROUTE_ADMISSIONS)}
                    ){

                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.img_5),
                                contentDescription = "blouse",
                                modifier = Modifier
                                    .fillMaxSize(),
                                    contentScale = ContentScale.Crop
                            )
                        }
                    }
                    //end of card2

                }
                //End Of Row1

                Row (modifier = Modifier.padding(start = 25.dp, top = 10.dp)
                ){

                    Text(
                        text = "History",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 15.dp)

                    )
                    Text(
                        text = "Information",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 65.dp)
                    )
                    Text(
                        text = "Admissions",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 35.dp)
                    )
                }

                Spacer(modifier = Modifier.height(13.dp))

                //Row2
                Row (modifier = Modifier.padding(start = 20.dp, top = 25.dp)
                ){

                    //Card1
                    Card (
                        modifier = Modifier
                            .width(100.dp)
                            .height(150.dp)
                            .clickable{navController.navigate(ROUT_EVENTS)}
                    ){

                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.img_4),
                                contentDescription = "blouse",
                                modifier = Modifier
                                    .fillMaxSize(),
                                     contentScale = ContentScale.Crop

                            )
                            Text(text = "Events", fontSize = 15.sp)

                        }

                    }
                    //end of card1

                    Spacer(modifier = Modifier.width(13.dp))

                    //Card2
                    Card (
                        modifier = Modifier
                            .width(100.dp)
                            .height(150.dp)
                            .clickable{navController.navigate(ROUT_INQUIRY)}
                    ){

                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.img_6),
                                contentDescription = "blouse",
                                modifier = Modifier
                                    .fillMaxSize(),
                                    contentScale = ContentScale.Crop
                            )
                        }
                    }
                    //end of card2

                   Spacer(modifier = Modifier.width(13.dp))

                    //Card2
                    Card (
                        modifier = Modifier
                            .width(100.dp)
                            .height(150.dp)
                            .clickable{navController.navigate(ROUT_ENROLL)}
                    ){

                        Column (
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){

                            Image(
                                painter = painterResource(R.drawable.img_15),
                                contentDescription = "blouse",
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                    //end of card2
                }
                //End Of Row2


                Row (modifier = Modifier.padding(start = 25.dp, top = 10.dp)
                ){

                    Text(
                        text = "Events",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 5.dp)

                    )
                    Text(
                        text = "Inquire",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 80.dp)
                    )
                    Text(
                        text = "Enroll",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 85.dp)
                    )
                }






                Spacer(modifier = Modifier.width(20.dp))

                Image(
                painter = painterResource(R.drawable.logo2),
                contentDescription = "blouse",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(250.dp),

                )

            }//end of content

        }
    )

    //End of scaffold

}




@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(navController= rememberNavController())

}