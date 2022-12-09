package com.example.onboardingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.onboardingcompose.navigation.RootNavGraph
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.navigation.SetupNavGraph

import com.example.onboardingcompose.screen.Navigation
import com.example.onboardingcompose.screen.WelcomeScreen
import com.example.onboardingcompose.ui.theme.OnBoardingComposeTheme
import com.example.onboardingcompose.viewmodel.SplashViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import com.example.onboardingcompose.navigation.NavigationItem as NavigationItem1

@ExperimentalAnimationApi
@ExperimentalPagerApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().setKeepOnScreenCondition {
            !splashViewModel.isLoading.value
        }

        setContent {
            OnBoardingComposeTheme {
                val navController = rememberNavController()
                RootNavGraph(navController = navController, splashViewModel = splashViewModel)

//                    Navigation()

            }


        }



    }
}

