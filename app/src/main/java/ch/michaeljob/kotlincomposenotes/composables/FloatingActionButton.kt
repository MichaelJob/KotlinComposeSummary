import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// FloatingActionButton - FAB
@Composable
fun ViewWithFloatingActionButton() {
    Scaffold(
        topBar = { /*your top app bar*/ },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* clear action */ }
            ) {
                Icon(Icons.Filled.Clear, "clear it")
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        content = { // it: PaddingValues (from Scaffold) shall be passed to content
            Column(
                modifier = Modifier.padding(it)
            ) {
                Text("main content")
            }
        }
    )
}