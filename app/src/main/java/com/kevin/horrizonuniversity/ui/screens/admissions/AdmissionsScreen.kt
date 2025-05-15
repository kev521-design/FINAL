package com.kevin.horrizonuniversity.ui.screens.admissions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kevin.horrizonuniversity.R
import com.kevin.horrizonuniversity.navigation.ROUT_HOME
import com.kevin.horrizonuniversity.navigation.ROUT_INFORMATION
import com.kevin.horrizonuniversity.ui.theme.newblue
import com.kevin.horrizonuniversity.ui.theme.newblue1
import com.kevin.horrizonuniversity.ui.theme.newgreen
import com.kevin.horrizonuniversity.ui.theme.neworange
import com.kevin.horrizonuniversity.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdmissionsScreen(navController: NavController){





    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = {
                    Text("ADMISSIONS",
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .padding(start = 70.dp)
                    ) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(ROUT_INFORMATION) }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = newblue,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },//end TopApp bar

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
                containerColor = newwhite,
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
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


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .background(newblue)
                ) {


                    Image(
                        painter = painterResource(R.drawable.img_12),
                        contentDescription = "blouse",
                        modifier = Modifier
                            .padding(start = 110.dp)
                            .size(170.dp)

                    )
                    Text(
                        text = "Horizon University ",
                        fontSize = 20.sp,
                        color = Color.White,
                        //fontWeight = FontWeight.SemiBold,
                        //textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 126.dp)

                    )
                    Text(
                        text = "Admissions Now Open!!!!",
                        fontSize = 20.sp,
                        color = Color.White,
                        //fontWeight = FontWeight.SemiBold,
                        //textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 110.dp)

                    )

                    Spacer(modifier = Modifier.height(40.dp))


                    Text(
                        text = "Hey User",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp)
                    )

                    Spacer(modifier = Modifier.height(25.dp))

                    Text(
                        text = "Here are available Courses",
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp)
                    )

                    Spacer(modifier = Modifier.height(25.dp))
                    //ROW1
                    Row (
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .horizontalScroll(rememberScrollState())

                    ){
                        //Card1
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp)
                        ){

                            Column (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(newwhite),

                                ){
                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "\uD83E\uDDE0 Faculty of Arts & Humanities",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = ".Bachelor of Arts in Psychology",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = ".Bachelor of Fine Arts",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = ".Master of Arts in Creative Writing",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }
                        }
                        //end of card1

                        Spacer(modifier = Modifier.width(25.dp))

                        //Card2
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp)
                        ){

                            Column (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(newblue1),
                                ){
                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "\uD83D\uDCBB Faculty of Technology & Eng",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Bachelor of Science in Computer Science",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Bachelor of Engineering in Software Engineering",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Master of Science in Artificial Intelligence",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                            }
                        }
                        //end of card2


                        Spacer(modifier = Modifier.width(25.dp))

                        //Card3
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp)
                        ){

                            Column (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(newgreen),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,

                                ){
                                Spacer(modifier = Modifier.height(25.dp))


                                Text(
                                    text = "\uD83D\uDCBC Faculty of Business & Economics",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Bachelor of Business Administration (BBA)",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Bachelor of Commerce (Finance/Marketing)",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".MBA (Full-Time/Part-Time/Online)",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                            }
                        }
                        //end of card3


                    }//end row1



                    Spacer(modifier = Modifier.height(25.dp))
                    //ROW2
                    Row (
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .horizontalScroll(rememberScrollState())

                    ){
                        //Card1
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp)
                        ){

                            Column (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(newwhite),

                                ){
                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "\uD83E\uDDEA Faculty of Health & Life Sciences",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = ".Bachelor of Science in Nursing",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = ".Bachelor of Biomedical Science",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = ".Master of Public Health",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }
                        }
                        //end of card1

                        Spacer(modifier = Modifier.width(25.dp))

                        //Card2
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp)
                        ){

                            Column (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(newblue1),
                            ){
                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "\uD83C\uDF0D Faculty of Env & Social Sciences",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Bachelor of Environmental Science",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Bachelor of International Relations",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Master of Sustainable Development",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                            }
                        }
                        //end of card2


                        Spacer(modifier = Modifier.width(25.dp))

                        //Card3
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp)
                        ){

                            Column (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(newgreen),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,

                                ){
                                Spacer(modifier = Modifier.height(25.dp))


                                Text(
                                    text = "\uD83D\uDCBC Faculty of Business & Economics",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Bachelor of Business Administration (BBA)",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = ".Bachelor of Commerce (Finance/Marketing)",
                                    fontSize = 10.sp,
                                    //fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                                Spacer(modifier = Modifier.height(6.dp))

                            }
                        }
                        //end of card3


                    }//end row2



                }

            }//end of content




        }
    )

    //End of scaffold







}




@Preview(showBackground = true)
@Composable
fun AdmissionsScreenPreview(){
    AdmissionsScreen(navController= rememberNavController())

}