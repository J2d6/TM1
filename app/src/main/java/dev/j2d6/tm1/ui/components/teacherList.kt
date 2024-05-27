package dev.j2d6.tm1.ui.components

import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.j2d6.tm1.ui.data.Teacher

@Composable
fun teacherList (
    modifier : Modifier,
    onItemClicked : () -> Unit
) {
    val itemsList = generateTeachersList()
    LazyColumn (
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        items(itemsList) {
            teacherItem(
                teacher = it,
                onItemClicked = onItemClicked
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun teacherListPreview (
    modifier: Modifier = Modifier
) {
    teacherList(modifier = modifier, onItemClicked = { println("clicked") })
}

fun generateTeachersList(): List<Teacher> {
    val teachersList = mutableListOf<Teacher>()
    for (i in 1..150) {
        val teacher = Teacher(
            TH = i,
            NOM = "Teacher $i",
            VH = (1..100).random()
        )
        teachersList.add(teacher)
    }
    return teachersList
}