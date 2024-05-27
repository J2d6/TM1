package dev.j2d6.tm1.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.TM1Theme

@Composable
fun FABNewTeacher (
    modifier: Modifier,
    onClick : () -> Unit,
) {
    TM1Theme {
        LargeFloatingActionButton (
            onClick = onClick,
            containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
            modifier = Modifier.padding(bottom = 20.dp)
        ) {
            Icon(Icons.Filled.Add, contentDescription = "New Teacher")
        }
    }
}

@Preview
@Composable
fun FABNewTeacherPreview(
    modifier: Modifier = Modifier
){
    FABNewTeacher(modifier = modifier, onClick = {})
}