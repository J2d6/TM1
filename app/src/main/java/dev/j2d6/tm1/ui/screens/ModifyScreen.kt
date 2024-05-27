package dev.j2d6.tm1.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.TM1Theme
import dev.j2d6.tm1.R
import dev.j2d6.tm1.ui.components.NameInput
import dev.j2d6.tm1.ui.components.THInput
import dev.j2d6.tm1.ui.components.TopTM1AppBar
import dev.j2d6.tm1.ui.components.VHInput
import dev.j2d6.tm1.ui.data.TM1State
import dev.j2d6.tm1.ui.data.Teacher

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModifyScreen(
    modifier : Modifier = Modifier,
    state : TM1State,
    onHomeReturnButtonClicked : () -> Unit,
    onNameValueChanged : () -> Unit,
    onTHValueChanged : () -> Unit ,
    onVHValueChanged : () -> Unit
) {
    Scaffold (
        topBar =
        {
            TopTM1AppBar (
                title = stringResource(id = R.string.modify_teacher),
                canNavigateBack = true,
                navigateUp = onHomeReturnButtonClicked
            )
        }
    ) {
        TM1Theme {
            Box (
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
                    .wrapContentSize(Alignment.TopCenter)
            ) {
                Column (
                    modifier = Modifier
                        .padding(30.dp)
                        .wrapContentSize(Alignment.TopCenter),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ){
                    Box (
                        modifier = Modifier
                            .wrapContentSize(Alignment.TopCenter)
                            .padding(10.dp)
                    ) {
                        Column (
                            verticalArrangement = Arrangement.spacedBy(15.dp),
                            modifier = Modifier.padding(25.dp)
                        ){
                            NameInput(
                                onValueChanged = { onNameValueChanged },
                                state = state.selectedTeacher ?: Teacher(0,"",0)
                            )
                            THInput(
                                state = state.selectedTeacher ?: Teacher(0,"",0),
                                onValueChanged = { onTHValueChanged}
                            )
                            VHInput(
                                state = state.selectedTeacher ?: Teacher(0,"",0),
                                onValueChanged = onVHValueChanged
                            )
                        }
                    }
                    Row (
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.End

                    ){
                        ExtendedFloatingActionButton(
                            onClick = { /*TODO*/ },
                            containerColor = MaterialTheme.colorScheme.primaryContainer
                        ) {
                            Text(
                                text = "Modifier",
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ModifyScreenPreview() {
    ModifyScreen(
        state = TM1State(),
        onHomeReturnButtonClicked = { /*TODO*/ },
        onNameValueChanged = { /*TODO*/ },
        onTHValueChanged = { /*TODO*/ },
        onVHValueChanged = {}
    )
}
