package com.kevin.horrizonuniversity.ui.screens.spalsh

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.kevin.horrizonuniversity.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kevin.horrizonuniversity.navigation.ROUTE_LOGIN
import com.kevin.horrizonuniversity.navigation.ROUT_HOME
import com.kevin.horrizonuniversity.ui.theme.newblue
import com.kevin.horrizonuniversity.ui.theme.newwhite
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController) {


    //Navigation

    val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_HOME)
    }
    //end of Navigation



    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(newwhite),
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

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = "WELCOME TO HORIZON UNIVERSITY",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = newblue,
            fontFamily = FontFamily.SansSerif


            )


    }

}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){

    SplashScreen(rememberNavController())


}