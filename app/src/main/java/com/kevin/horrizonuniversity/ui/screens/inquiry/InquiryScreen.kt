package com.kevin.horrizonuniversity.ui.screens.inquiry

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kevin.horrizonuniversity.R
import com.kevin.horrizonuniversity.navigation.ROUT_HOME
import com.kevin.horrizonuniversity.ui.theme.newblue
import com.kevin.horrizonuniversity.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InquiryScreen(navController: NavController){




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
                        contentDescription = "Home"
                    ) },
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
                        contentDescription = "Favorites"
                    ) },
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
                        contentDescription = "Profile"
                    ) },
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
                        contentDescription = "Info"
                    ) },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )


            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = newblue,
            ) {
                Icon(
                    Icons.Default.Add,
                    tint = newwhite,
                    contentDescription = "Add"
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
                    .background(newblue)
            ) {


                //Main Contents of the page

                Box {

                    //Card
                    Card(
                        modifier = Modifier.fillMaxWidth().height(250.dp),
                        shape = RoundedCornerShape(bottomStart = 80.dp),
                        colors = CardDefaults.cardColors(newblue),


                        ) {


                        Image(
                            painter = painterResource(R.drawable.img_12),
                            contentDescription = "blouse",
                            modifier = Modifier
                                .padding(start = 110.dp, top = 20.dp)
                                .size(200.dp)

                        )


                    }//End of Card

                }
                //End of Box


                Spacer(modifier = Modifier.height(0.dp))



                Card (
                    modifier = Modifier
                        .padding(start = 23.dp, top = 30.dp)
                        .width(350.dp)
                        .height(550.dp)
                        .background(newwhite),


                ){


//details1
                    Text(
                        text = "\uD83C\uDFEB Main Campus Address:",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 15.dp, top = 20.dp)
                    )
                    Text(
                        text = ".Horizon University",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )
                    Text(
                        text = ".123 Horizon Way",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )
                    Text(
                        text = ".Skyline City, ST 45678",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )
                    Text(
                        text = ".United States\n" +
                                "\n",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )

//details2
                    Text(
                        text = "\uD83D\uDCDE Contact Numbers:",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 15.dp, top = 10.dp)
                    )
                    Text(
                        text = ".Main Office: +1 (555) 123-4567" ,
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )
                    Text(
                        text = ".Admissions: +1 (555) 234-5678",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )
                    Text(
                        text = ".International Office: +1 (555) 345-6789",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )


//details3
                    Text(
                        text = "\uD83D\uDCE7 Email Addresses:",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 15.dp, top = 20.dp)
                    )
                    Text(
                        text = ".General Inquiries: info@horizonuniversity.edu" ,
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )
                    Text(
                        text = ".Admissions: admissions@horizonuniversity.edu",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )
                    Text(
                        text = ".International Students: global@horizonuniversity.edu",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )



//details3
                    Text(
                        text = "\uD83C\uDF10 Website:",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 15.dp, top = 20.dp)
                    )
                    Text(
                        text = ".www.horizonuniversity.edu",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )



//details3
                    Text(
                        text = "\uD83D\uDCCD Office Hours:",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 15.dp, top = 20.dp)
                    )
                    Text(
                        text = ".Monday – Friday: 9:00 AM – 5:00 PM (Local Time)",
                        fontSize = 17.sp,
                        color = Color.Black,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )




                }


            }//end of content




        }
    )

    //End of scaffold





}




@Preview(showBackground = true)
@Composable
fun InquiryScreenPreview(){
    InquiryScreen(navController= rememberNavController())

}