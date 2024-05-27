package dev.j2d6.tm1.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.compose.TM1Theme


@Composable
fun DeleteOrModifyDialog (
    modifier : Modifier = Modifier
) {
    TM1Theme {
       Dialog(onDismissRequest = { /*TODO*/ }) {
           Card(
               modifier = Modifier
                   .width(400.dp)
                   .height(250.dp)
                   .padding(30.dp)
                   .wrapContentSize(Alignment.Center),
               colors = CardDefaults.cardColors(
                   MaterialTheme.colorScheme.secondaryContainer
               )
           ) {
               Row (
                   modifier = Modifier
                       .fillMaxSize()
                       .wrapContentSize(Alignment.Center)
                       .padding(horizontal = 10.dp)
                   ,
                   horizontalArrangement = Arrangement.spacedBy(20.dp)
               ){



               }
           }
       }
    }
}

@Composable
@Preview
fun DeleteOrModifyDialogPreview () {
    DMDialog(
        onDissmisRequest = {},
        onModifyButtonClicked = {}
    )
}


@Composable
fun DMDialog (
    onDissmisRequest : () -> Unit,
    onModifyButtonClicked : () -> Unit
) {
    TM1Theme {
        AlertDialog(
            onDismissRequest = {
                onDissmisRequest()
            },
            dismissButton = {
                ElevatedButton(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        MaterialTheme.colorScheme.errorContainer
                    )
                ) {
                    Text(
                        text = "Supprimer",
                        color = MaterialTheme.colorScheme.onErrorContainer
                    )

                }
            },
            confirmButton = {
                ElevatedButton(
                    onClick = { onModifyButtonClicked() },
                    colors = ButtonDefaults.buttonColors(
                        MaterialTheme.colorScheme.primary
                    )
                ) {
                    Text(text = "Modifier")
                }
            },
            icon = {
                Icon( Icons.Filled.Info, contentDescription = "Edit or Modify")
            }
        )
    }
}