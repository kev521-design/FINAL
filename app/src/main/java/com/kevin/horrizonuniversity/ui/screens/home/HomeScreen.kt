package com.kevin.horrizonuniversity.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.kevin.horrizonuniversity.R
import com.kevin.horrizonuniversity.navigation.ROUTE_LOGIN
import com.kevin.horrizonuniversity.navigation.ROUTE_REGISTER
import com.kevin.horrizonuniversity.navigation.ROUT_START
import com.kevin.horrizonuniversity.ui.theme.newblack
import com.kevin.horrizonuniversity.ui.theme.newblue
import com.kevin.horrizonuniversity.ui.theme.newwhite

@Composable
fun HomeScreen(navController: NavController){


    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = newblack),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Image(
            painter = painterResource(R.drawable.img_3),
            contentDescription = "blouse",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = RoundedCornerShape(10.dp))


        )

        Spacer(modifier = Modifier.width(150.dp))


        Button(
            onClick = {
                navController.navigate(ROUTE_REGISTER)
            },
            modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp),
            colors = ButtonDefaults.buttonColors(newwhite),
            shape = RoundedCornerShape(10.dp),

            ) {
            Text(
                text = "Get Started",
                color = newblue,
            )
        }
    }






}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController= rememberNavController())
}