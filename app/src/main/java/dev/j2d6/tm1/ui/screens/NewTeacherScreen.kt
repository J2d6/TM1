package dev.j2d6.tm1.ui.screens

import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.TM1Theme
import dev.j2d6.tm1.R
import dev.j2d6.tm1.ui.components.TopTM1AppBar
import dev.j2d6.tm1.ui.data.Teacher

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewTeacherScreen(
    modifier: Modifier = Modifier.wrapContentSize(Alignment.TopCenter),
    onHomeReturnButtonClicked : () -> Unit,
    onConfirmClicked : () -> Unit
) {
    var newTeacher = remember {
        mutableStateOf(Teacher(343315245,"",0))
    }

    TM1Theme {
        Scaffold(
            topBar = {
                TopTM1AppBar(
                    title = stringResource(id = R.string.new_teacher),
                    canNavigateBack = true,
                    navigateUp = onHomeReturnButtonClicked
                )
            }
        ) {
           Column (
               modifier = Modifier
                   .padding(it)
                   .fillMaxSize(),
               verticalArrangement = Arrangement.spacedBy(30.dp)
           ) {
                Box (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Column(
                        verticalArrangement = Arrangement.spacedBy(15.dp),
                        modifier = Modifier
                            .padding(it)
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.TopCenter)
                    ) {
                        OutlinedTextField(
                            value = newTeacher.value.NOM,
                            onValueChange = { nom ->
                                newTeacher.value.NOM = nom
                            },
                            label = {
                                Text(text = "NOM et Prénom(s)")
                            }
                        )
                        OutlinedTextField(
                            value = "${newTeacher.value.VH}",
                            onValueChange = { vh ->
                                newTeacher.value.VH = vh.toInt()
                            },
                            label = { Text(text = "VH", fontWeight = FontWeight.Bold) },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number
                            ),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.Red
                            )
                        )

                        OutlinedTextField(
                            value = "${newTeacher.value.TH}",
                            onValueChange = { th ->
                                newTeacher.value.TH = th.toInt()
                            },
                            label = {
                                Text(text="TH")
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number
                            )
                        )
                    }
                }

               Row (
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(end = 10.dp),
                   horizontalArrangement = Arrangement.End
               ) {
                   ElevatedButton(
                       onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer,
                            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                        ),
                       modifier = Modifier.padding(end = 35.dp)
                       ) {
                       Text(
                           text = "Ajouter",
                           fontWeight = FontWeight.Bold
                       )

                   }
               }

           }
        }
        }
}


@Preview(showSystemUi = true)
@Composable
fun NewScreenPreview () {
    NewTeacherScreen(
        onConfirmClicked = {},
        onHomeReturnButtonClicked = {}
    )
}
