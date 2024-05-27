package dev.j2d6.tm1.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.TM1Theme
import dev.j2d6.tm1.R
import dev.j2d6.tm1.ui.components.FABNewTeacher
import dev.j2d6.tm1.ui.components.TopTM1AppBar
import dev.j2d6.tm1.ui.components.searchBar
import dev.j2d6.tm1.ui.components.teacherList
import dev.j2d6.tm1.ui.data.TM1State


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier,
    state : TM1State?,
    onNewButtonClicked : () -> Unit,
    onItemClicked : () -> Unit
) {
        TM1Theme {
            Scaffold (
                topBar =
                {
                    TopTM1AppBar(
                        title = stringResource(id = R.string.app_title),
                        canNavigateBack = false)
                },
                floatingActionButton = {
                    FABNewTeacher(
                        modifier = Modifier.padding(bottom = 30.dp),
                        onClick = onNewButtonClicked
                    )
                }
            ){
                Column(
                    modifier = Modifier.padding(it),
                ) {

                    searchBar(modifier = modifier, value = "", onValueChange = {})
                    Spacer(modifier = Modifier.height(20.dp))
                    teacherList(modifier = modifier, onItemClicked = onItemClicked)
                }
            }
        }
}


@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        modifier = Modifier, state = null,
        onNewButtonClicked = { } ,
        onItemClicked = {})
}