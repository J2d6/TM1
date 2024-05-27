package dev.j2d6.tm1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.TM1Theme
import dev.j2d6.tm1.ui.components.DMDialog
import dev.j2d6.tm1.ui.components.DeleteOrModifyDialog
import dev.j2d6.tm1.ui.data.TM1State
import dev.j2d6.tm1.ui.data.TMIViewModel
import dev.j2d6.tm1.ui.screens.HomeScreen
import dev.j2d6.tm1.ui.screens.ModifyScreen
import dev.j2d6.tm1.ui.screens.NewTeacherScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TM1Theme {
                TM1App(modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center)
                )
            }
        }
    }
}
@Composable
fun TM1App(
   modifier: Modifier,
   model : TMIViewModel = TMIViewModel()
) {
    val state by model.tmState.collectAsState()
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home") {
        composable(route = "Home") { HomeScreen(
            modifier = modifier,
            state = state,
            onNewButtonClicked = { navController.navigate("New") },
            onItemClicked = { navController.navigate("DM")}
        ) }
        composable("DM") {
            DMDialog(
                onDissmisRequest = { navController.navigate("Home")},
                onModifyButtonClicked = { navController.navigate("Modify")}
            )
        }
        composable("Modify") {
            ModifyScreen(
                state = TM1State(),
                onHomeReturnButtonClicked = { navController.navigate("Home")},
                onVHValueChanged = {},
                onNameValueChanged = {},
                onTHValueChanged = {}
            )
        }

        composable("New") {
            NewTeacherScreen(
                onHomeReturnButtonClicked = { navController.navigate("Home") } ,
                onConfirmClicked = {}
            )
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun tm1AppPreview() {
    TM1App(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}













