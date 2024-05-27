package dev.j2d6.tm1.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import dev.j2d6.tm1.ui.data.Teacher
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import com.example.compose.TM1Theme


@Composable
fun THInput(
    modifier : Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(),
    state : Teacher,
    onValueChanged : () -> Unit
) {

        var thState = remember {
            mutableStateOf(state.TH)
        }
        TM1Theme {
            OutlinedTextField(
                value = thState.value.toString(),
                onValueChange = {onValueChanged},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                ),
                label = {
                    Text(text = "TH", fontWeight = FontWeight.Bold)
                }
            )
        }

}