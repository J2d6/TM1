package dev.j2d6.tm1.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dev.j2d6.tm1.R



@Composable
fun appTitle(
    modifier: Modifier
) {
    Row {
        Text(text = stringResource(id = R.string.app_title))
    }
}

@Preview
@Composable
fun appTitlePreview(
    modifier: Modifier = Modifier
) {
   appTitle(modifier = modifier)
}