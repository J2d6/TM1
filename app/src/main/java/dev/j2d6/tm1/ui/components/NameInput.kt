package dev.j2d6.tm1.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.TM1Theme
import dev.j2d6.tm1.ui.data.Teacher

@Composable
fun NameInput (
    modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(),
    onValueChanged : () -> Unit,
    state : Teacher
) {
    TM1Theme {
            val nameState  = remember {
                mutableStateOf(state.NOM)
            }
            OutlinedTextField(
                value = nameState.value,
                onValueChange = {onValueChanged},
                label = {
                    Text(text = "NOM et prénom(s)")
                }
            )

    }
}



@Preview(showSystemUi = true)
@Composable
fun NameInputPReview (

) {
    NameInput (
        onValueChanged = {},
        state = Teacher( 25,"Dimbiniaina",56 )
    )
}