package dev.j2d6.tm1.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.TM1Theme
import dev.j2d6.tm1.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopTM1AppBar(
    title: String = stringResource(id = R.string.app_title),
    canNavigateBack: Boolean,
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    navigateUp: () -> Unit = {},

) {
    TM1Theme {
        CenterAlignedTopAppBar(
            title = { Text(title, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onPrimary) },
            modifier = modifier,
            scrollBehavior = scrollBehavior,
            navigationIcon = {
                if (canNavigateBack) {
                    IconButton(onClick = navigateUp) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Return back",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.primary)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun topBarPReview(

) {
    TopTM1AppBar(title = stringResource(id = R.string.app_title), canNavigateBack = true)
}
