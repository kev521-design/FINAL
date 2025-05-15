package com.kevin.horrizonuniversity.ui.screens.history

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kevin.horrizonuniversity.R
import com.kevin.horrizonuniversity.navigation.ROUT_START
import com.kevin.horrizonuniversity.ui.theme.newblue
import com.kevin.horrizonuniversity.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HistoryScreen(navController: NavController){


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("HISTORY",
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier
                        .padding(start = 70.dp)

                ) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(ROUT_START)}) {
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
                        // navController.navigate(ROUT_HOME)
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
                    .verticalScroll(rememberScrollState())
            ) {
                //Main Contents of the page



                Image(
                    painter = painterResource(R.drawable.img_16),
                    contentDescription = "blouse",
                    modifier = Modifier.width(400.dp).height(200.dp),
                    contentScale = ContentScale.FillWidth
                )

                Spacer(modifier = Modifier.height(30.dp))



                    Text(
                        text = "Horizon University(HU)",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 20.dp)
                    )
                    Text(
                        text = ">.Founded in 1965, Horizon University began as a small liberal arts institution with a vision to provide students with an education that emphasized both academic rigor and personal growth. The university's founders, a group of visionary educators and philanthropists, believed that fostering a holistic approach to education would empower students to navigate a rapidly changing world.",
                        fontWeight = FontWeight.Normal,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 25.dp, top = 10.dp)
                    )
                Text(
                        text = ">.Initially, Horizon University offered a limited number of programs focused on the humanities and sciences. However, its commitment to innovation and excellence quickly propelled it to national recognition. Over the decades, the university expanded its academic offerings, introducing cutting-edge programs in technology, business, and the arts. The institution’s progressive curriculum, paired with world-class faculty, set it apart as a leader in higher education.",
                        fontWeight = FontWeight.Normal,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 25.dp, top = 10.dp)
                    )
                Text(
                        text = "By the early 1990s, Horizon University had established a reputation for being a hub of research and intellectual curiosity. The opening of the Horizon Institute for Advanced Studies in 1995 marked a major milestone in the university's history, fostering groundbreaking research across a variety of fields. This research arm helped elevate Horizon University's status as an institution committed to not only educating future leaders but also contributing to global knowledge and innovation.",
                        fontWeight = FontWeight.Normal,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 25.dp, top = 10.dp)
                    )

            }//end of content




        }
    )

    //End of scaffold






}




@Preview(showBackground = true)
@Composable
fun HistoryScreenPreview(){
    HistoryScreen(navController= rememberNavController())

}