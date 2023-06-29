import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.onboardingcompose.ui.theme.v360
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.NavigationItem
import com.example.onboardingcompose.navigation.Screen
//import com.example.onboardingcompose.screen.CustomIndicator

import com.example.onboardingcompose.screen.navfinal
import com.example.onboardingcompose.ui.theme.*
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.*


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun view360(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()

) {
    Image(
        painter = painterResource(id = R.drawable.i360finale), contentDescription = null,
        modifier = Modifier
            .padding(top = 1.dp)
            .fillMaxWidth()

            .fillMaxHeight(),
/*.background(
    Color.White
)*/
        contentScale = ContentScale.FillBounds,

        )

    val gradient =
        Brush.horizontalGradient(
            listOf(
                Color(0xFF121C42),
                Color(0xFF3483A3)
            )
        )

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()
    ) {

        val scroll = rememberScrollState(0)


        Box(modifier = Modifier.height(20.dp))
        /*
        Box(modifier = Modifier.height(45.dp)) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "About Bhavans",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 35.sp,
                fontWeight=FontWeight.ExtraBold,
                textDecoration =TextDecoration.Underline ,
                style = TextStyle(
                    color = Color.Red,
                fontFamily = FontFamily.Cursive),
                overflow = TextOverflow.Visible)
        }
        Box(modifier = Modifier.height(180.dp)) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "           Kulapathi Dr. K. M. Munshi founded Bharatiya Vidya Bhavan on 7 November 1938 with the blessings of Mahatma Gandhi. About 22,000 members have committed themselves to the Bhavan's ideal \" Vasudhaiva Kutumbakam \" (The World is One Family) and lives by its code.",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 20.sp,
                style = TextStyle(
                    color = Color.Black,
                fontFamily = FontFamily.SansSerif),
                overflow = TextOverflow.Ellipsis)
        }


        Box(modifier = Modifier.height(45.dp)) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Quick Links",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 35.sp,
                fontWeight=FontWeight.ExtraBold,
                textDecoration =TextDecoration.Underline ,
                style = TextStyle(
                    color = Color.Red,
                    fontFamily = FontFamily.Cursive),
                overflow = TextOverflow.Visible)
        }

         */
        Column(
            verticalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier.fillMaxHeight()
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(Modifier.weight(8f)) {
                    GBhome(
                        text = "IT BLOCK AND COMMERCE BLOCK",
                        textColor = Color.White,
                        onClick = { navController.navigate(Screen.itcom.route) },
                        gradient = gradient

                        )

                }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(Modifier.weight(8f)) {
                    GBhome(
                        text = "BIO CHEMISTRY AND SCIENCE BLOCK",
                        textColor = Color.White,
                        onClick = { navController.navigate(Screen.biosci.route) },
                        gradient = gradient

                        )

                }


            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(Modifier.weight(8f)) {
                    GBhome(
                        text = "VIVEK BHARATHI AND MBA BLOCK",
                        textColor = Color.White,
                        onClick = { navController.navigate(Screen.vbmba.route) },
                        gradient = gradient
                    )
                }


            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(Modifier.weight(8f)) {
                    GBhome(
                        text = "LIBRARY BLOCK",
                        textColor = Color.White,
                        onClick = { navController.navigate(Screen.libblock.route) },
                        gradient = gradient

                        )

                }


            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(Modifier.weight(8f)) {
                    GBhome(
                        text = "PARKING GATE AND SPORTS ROOM",
                        textColor = Color.White,
                        onClick = { navController.navigate(Screen.parking.route) },
                        gradient = gradient
                    )
                }


            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(Modifier.weight(8f)) {
                    GBhome(
                        text = "CANTEEN",
                        textColor = Color.White,
                        onClick = { navController.navigate(Screen.canteen.route) },
                        gradient = gradient
                    )
                }


            }
        }

        Box(modifier = Modifier.height(90.dp))
    }
    Box(modifier = Modifier.height(90.dp))

}
@Composable
fun GBhome(
    text :String,
    textColor : Color,
    gradient : Brush,
    onClick: () -> Unit,
) {
    val homefont = FontFamily(
        Font(R.font.home)
    )

    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor =  Color.Transparent
        ),
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(10.dp),
        onClick = onClick,
    modifier = Modifier.padding(start = 10.dp,end = 10.dp)) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth()
                .height(40.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = textColor,
                fontSize = 15.sp, textAlign = TextAlign.Center,
                fontWeight = FontWeight.Normal,
                fontFamily= homefont
            )
        }
    }

}
