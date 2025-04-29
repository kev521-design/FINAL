package com.kevin.horrizonuniversity.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.Kevin.zawadimart.ui.theme.screens.auth.LoginScreen
import com.Kevin.zawadimart.ui.theme.screens.auth.RegisterScreen
import com.kevin.horrizonuniversity.data.UserDatabase
import com.kevin.horrizonuniversity.repository.UserRepository
import com.kevin.horrizonuniversity.ui.screens.about.AboutScreen
import com.kevin.horrizonuniversity.ui.screens.home.HomeScreen
import com.kevin.horrizonuniversity.ui.screens.spalsh.SplashScreen
import com.kevin.horrizonuniversity.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {
    val context = LocalContext.current


    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }



        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUTE_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUTE_LOGIN) {
                    popUpTo(ROUTE_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUTE_LOGIN) { inclusive = true }
                }
            }
        }



    }
}