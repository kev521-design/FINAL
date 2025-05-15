package com.kevin.horrizonuniversity.ui.screens.events

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kevin.horrizonuniversity.R
import com.kevin.horrizonuniversity.navigation.ROUTE_LOGIN
import com.kevin.horrizonuniversity.ui.theme.newblue
import com.kevin.horrizonuniversity.ui.theme.newwhite
import com.kevin.horrizonuniversity.ui.theme.newwhite1


@Composable
fun EventsScreen(navController: NavController){


    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(newwhite)
            .verticalScroll(rememberScrollState())

    ) {


        Text(
            text = "HORIZON",
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(start = 20.dp, top = 30.dp)
        )
        Text(
            text = "EVENTS",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 20.dp, top = 0.dp)
        )


        Button(
            onClick = {

            },
            modifier = Modifier
                .fillMaxWidth()
                .width(20.dp)
                .padding(start = 40.dp, end = 40.dp, top = 30.dp),
            colors = ButtonDefaults.buttonColors(newblue),
            shape = RoundedCornerShape(10.dp),

            ) {
            Text(
                text = "UPCOMING",
                color = newwhite,
            )
        }

        Spacer(modifier = Modifier.width(13.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                .height(100.dp),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp),
        ) {
            Row (
                modifier = Modifier
                    .background(newwhite)
            ) {

                Image(
                    painter = painterResource(R.drawable.img_17),
                    contentDescription = "blouse",
                    modifier = Modifier.size(100.dp),
                )


                Column(

                ) {
                    Text(
                        text = "Seminar For Data Science",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 20.dp)

                    )

                    Text(
                        text = "Introductory seminar on Data science for beginners",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp)

                    )
                    Text(
                        text = "Johnson Hall",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 15.dp)

                    )


                    Text(
                        text = ">",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 200.dp, top = 0.dp,)

                    )


                }

            }   }

        Spacer(modifier = Modifier.width(13.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                .height(100.dp),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp),
        ) {
            Row (
                modifier = Modifier
                    .background(newwhite)
            ) {

                Image(
                    painter = painterResource(R.drawable.img_18),
                    contentDescription = "blouse",
                    modifier = Modifier.size(100.dp),
                )


                Column(

                ) {
                    Text(
                        text = "Art Exhibition Opening",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 20.dp)

                    )

                    Text(
                        text = "Opening event for the annual student art exhibition",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp)

                    )
                    Text(
                        text = "Art Center",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 15.dp)

                    )


                    Text(
                        text = ">",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 200.dp, top = 0.dp, )

                    )
                }
            }   }//end of card

 Spacer(modifier = Modifier.width(13.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                .height(100.dp),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp),
        ) {
            Row (
                modifier = Modifier
                    .background(newwhite)
            ) {

                Image(
                    painter = painterResource(R.drawable.img_19),
                    contentDescription = "blouse",
                    modifier = Modifier.size(100.dp),
                )


                Column(

                ) {
                    Text(
                        text = "Business Networking Day",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 20.dp)

                    )

                    Text(
                        text = "Join us for a fun run around the campus",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp)

                    )
                    Text(
                        text = "Main Quad",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 15.dp)

                    )


                    Text(
                        text = ">",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 200.dp, top = 0.dp, )

                    )
                }
            }   }//end of card

 Spacer(modifier = Modifier.width(13.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                .height(100.dp),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp),
        ) {
            Row (
                modifier = Modifier
                    .background(newwhite)
            ) {

                Image(
                    painter = painterResource(R.drawable.img_20),
                    contentDescription = "blouse",
                    modifier = Modifier.size(100.dp),
                )


                Column(

                ) {
                    Text(
                        text = "Community Service Day",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 20.dp)

                    )

                    Text(
                        text = "Outdoor Volunteering activities",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp)

                    )
                    Text(
                        text = "West parking lot",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 15.dp)

                    )


                    Text(
                        text = ">",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 200.dp, top = 0.dp, )

                    )
                }
            }   }//end of card

 Spacer(modifier = Modifier.width(13.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                .height(100.dp),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp),
        ) {
            Row (
                modifier = Modifier
                    .background(newwhite)
            ) {

                Image(
                    painter = painterResource(R.drawable.img_21),
                    contentDescription = "blouse",
                    modifier = Modifier.size(100.dp),
                )
                Column(

                ) {
                    Text(
                        text = "Career Fair",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 20.dp)

                    )

                    Text(
                        text = "Meet potential employers",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp)

                    )
                    Text(
                        text = "Conference Hall",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 15.dp)

                    )


                    Text(
                        text = ">",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 200.dp, top = 0.dp, )

                    )
                }
            }   }//end of card

 Spacer(modifier = Modifier.width(13.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                .height(100.dp),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp),
        ) {
            Row (
                modifier = Modifier
                    .background(newwhite)
            ) {

                Image(
                    painter = painterResource(R.drawable.img_22),
                    contentDescription = "blouse",
                    modifier = Modifier.size(100.dp),
                )
                Column(

                ) {
                    Text(
                        text = "Guest Lecture :History",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 20.dp)

                    )

                    Text(
                        text = "Talk on modern History",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp)

                    )
                    Text(
                        text = "Library",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 15.dp)

                    )


                    Text(
                        text = ">",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 200.dp, top = 0.dp, )

                    )
                }
            }   }//end of card

 Spacer(modifier = Modifier.width(13.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                .height(100.dp),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp),
        ) {
            Row (
                modifier = Modifier
                    .background(newwhite)
            ) {

                Image(
                    painter = painterResource(R.drawable.img_23),
                    contentDescription = "blouse",
                    modifier = Modifier.size(100.dp),
                )
                Column(

                ) {
                    Text(
                        text = "Annual Music Fetivals",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 20.dp)

                    )

                    Text(
                        text = "Live music performances bringing up culture",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp)

                    )
                    Text(
                        text = "Athietic Field",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, top = 15.dp)

                    )


                    Text(
                        text = ">",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 200.dp, top = 0.dp, )

                    )
                }
            }   }//end of card











    }
}




@Preview(showBackground = true)
@Composable
fun EventsScreenPreview(){
    EventsScreen(navController= rememberNavController())

}