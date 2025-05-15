package com.kevin.horrizonuniversity.ui.screens.enroll

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kevin.horrizonuniversity.R
import com.kevin.horrizonuniversity.navigation.ROUTE_ADMISSIONS
import com.kevin.horrizonuniversity.ui.theme.newblue
import com.kevin.horrizonuniversity.ui.theme.newgrey
import com.kevin.horrizonuniversity.ui.theme.newpink
import com.kevin.horrizonuniversity.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnrollScreen(navController: NavController){


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
            text = "Enroll at Horizon ",
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 126.dp)

        )

        Text(
            text = "University",
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 150.dp)
        )

        Text(
            text = "Join The Horizon University Community",
            fontSize = 20.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 25.dp, top = 10.dp)
        )



        Card (
            modifier = Modifier
                .padding(start = 23.dp, top = 30.dp)
                .width(350.dp)
                .height(550.dp)
                .background(newblue)

        ){



            Spacer(modifier = Modifier.height(10.dp))

            //VARIABLES
            var fullname by remember { mutableStateOf("") }
            var username by remember { mutableStateOf("") }
            var email by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            var confirmpassword  by remember { mutableStateOf("") }



            //fullname
            TextField(
                value = fullname,
                onValueChange = { fullname = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = {   Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = newblue) },
                label = { Text(text = "Fullname")},
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = newblue,
                    focusedBorderColor = newgrey,
                ),

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )
            //end
            Spacer(modifier = Modifier.height(10.dp))




            //username
            TextField(
                value = username,
                onValueChange = { username = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = {   Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = newblue) },
                label = { Text(text = "Username")},
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = newblue,
                    focusedBorderColor = newgrey,
                ),

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )
            //end
            Spacer(modifier = Modifier.height(10.dp))






            //Role
            var role by remember { mutableStateOf("Profile") }
            val roleOptions = listOf("student", "lecturer")
            var expanded by remember { mutableStateOf(false) }

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded }
            ) {
                TextField(
                    value = role,
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = newblue,
                        focusedBorderColor = newgrey,
                    ),
                    leadingIcon = {   Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = newblue) },
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp)
                )
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    roleOptions.forEach { selectionOption ->
                        DropdownMenuItem(
                            text = { Text(selectionOption) },
                            onClick = {
                                role = selectionOption
                                expanded = false
                            }
                        )
                    }
                }
            }
            //End of role










            //email
            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = {   Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = newblue) },
                label = { Text(text = "Email Adress")},
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = newblue,
                    focusedBorderColor = newgrey,
                ),

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

            )
            //end
            Spacer(modifier = Modifier.height(10.dp))



            //password
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = {   Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = newblue) },
                label = { Text(text = "Password")},
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = newblue,
                    focusedBorderColor = newgrey,
                ),

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()

            )
            //end
            Spacer(modifier = Modifier.height(10.dp))


            //confirmpassword
            TextField(
                value = confirmpassword,
                onValueChange = { confirmpassword = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = {   Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = newblue) },
                label = { Text(text = "Confirm Password")},
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = newblue,
                    focusedBorderColor = newgrey,
                ),

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()

            )
            //end



            Spacer(modifier = Modifier.height(20.dp))





            Button(
                onClick = {
                    navController.navigate(ROUTE_ADMISSIONS)
                   //if (password.isNotBlank() || confirmpassword.isNotBlank()) {
                       //Toast.makeText(context, "Enrolllment Successful", Toast.LENGTH_SHORT).show()
                   //}

                   },


                colors = ButtonDefaults.buttonColors(newblue),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            ) {
                Text(text = "Complete Enrollment")
            }





        }









    }

}




@Preview(showBackground = true)
@Composable
fun EnrollScreenPreview(){
    EnrollScreen(navController= rememberNavController())

}