package dev.j2d6.tm1.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun searchBar (
    modifier: Modifier,
    value: String,
    onValueChange : (String) -> Unit
) {
    Row (
        modifier = Modifier.padding(10.dp)
    ){
        OutlinedTextField(
            value = value, // STATE IN VIEW MODEL
            onValueChange = {},
            label = { Text(text = "Teacher") },
            colors = TextFieldDefaults.colors(MaterialTheme.colorScheme.primary)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun searchBarPreview (
    modifier: Modifier = Modifier
) {
    searchBar(
        modifier = modifier,
        value = "",
        onValueChange = {}
    )
}