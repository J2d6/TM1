package dev.j2d6.tm1.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.TM1Theme
import dev.j2d6.tm1.ui.data.TM1State
import dev.j2d6.tm1.ui.data.Teacher

@Composable
fun teacherItem (
    modifier: Modifier = Modifier,
    teacher : Teacher,
    onItemClicked : () -> Unit
) {
    TM1Theme {
        Card (
            modifier = Modifier.clickable {
                onItemClicked()
            },
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surface)
        ){
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = MaterialTheme.colorScheme.surface)
                    .padding(15.dp)
            ){
                Row(
                    modifier = Modifier
                ) {
                    Text(text = teacher.NOM)
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "TH : ${teacher.TH}", fontWeight = FontWeight.Bold)
                }
                Text(text = "VH : ${teacher.VH}", fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun teacherItemPreview (
    modifier: Modifier = Modifier,
    teacher: Teacher = Teacher(15, "Dimbiniaina Jordany", 125)
) {
    teacherItem(modifier = modifier, teacher = teacher, onItemClicked = {})
}


