package com.kevin.horrizonuniversity.ui.screens.informaion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.kevin.horrizonuniversity.navigation.ROUT_HISTORY
import com.kevin.horrizonuniversity.navigation.ROUT_HOME
import com.kevin.horrizonuniversity.ui.theme.newblue
import com.kevin.horrizonuniversity.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InformationScreen(navController: NavController){





    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar

        topBar = {
            TopAppBar(
                title = {
                    Text("INFORMATION",
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .padding(start = 70.dp)
                    ) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(ROUT_HISTORY)}) {
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
                        Icons.Default.Home, contentDescription = "Home",
                        tint = newwhite
                    ) },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = {
                        Icon(
                            Icons.Default.Info, contentDescription = "Favorites",
                            tint = newwhite
                        ) },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(
                        Icons.Default.Person, contentDescription = "Profile",
                        tint = newwhite
                    ) },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )


                NavigationBarItem(
                    icon = { Icon(
                        Icons.Default.Info, contentDescription = "Info",
                        tint = newwhite
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
                    .verticalScroll(rememberScrollState())
            ) {


                //Main Contents of the page


                Spacer(modifier = Modifier.height(15.dp))

                //Searchbar

                var search by remember { mutableStateOf("")}
                OutlinedTextField(
                    value = search,
                    onValueChange = { search = it },
                    modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp ),
                    leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "")},
                    placeholder = { Text(text = "Search...")}
                )
                //End of Searchbar

                Spacer(modifier = Modifier.height(10.dp))

                Image(
                    painter = painterResource(R.drawable.img_10),
                    contentDescription = "blouse",
                    modifier = Modifier.width(400.dp).height(200.dp),
                    contentScale = ContentScale.FillWidth
                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "Philosophy",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(start = 20.dp)
                )


                Text(
                    text = " >At Horizon University," +
                            " we believe education is not merely the transfer of knowledge, " +
                            "but the cultivation of vision." +
                            "Our philosophy centers on empowering individuals to explore new frontiers" +
                            " of thought, creativity, and innovation.",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp)
                )


                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "Mission",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(start = 20.dp)
                )


                Text(
                    text = " 'Inspiring Global Vision, Empowering Local Action, and Shaping a Future Without Borders.'" +
                            "",
                    fontWeight = FontWeight.Medium,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp)
                )

                Text(
                    text = " >This motto reflects a commitment to global impact while emphasizing the importance of both broad vision and grounded, actionable change.",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 7.dp)
                )



                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "Vision",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(start = 20.dp)
                )


                Text(
                    text = " >'To be a global leader in transformative education and research, empowering future innovators and leaders to shape a better world through knowledge, integrity, and innovation.'",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp)
                )


            }//end of content




        }
    )

    //End of scaffold





}




@Preview(showBackground = true)
@Composable
fun InformationScreenPreview(){
    InformationScreen(navController= rememberNavController())

}