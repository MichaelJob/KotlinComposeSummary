import androidx.compose.foundation.clickable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler

// set a text which links to a provided url
@Composable
private fun MyLink(name: String, url: String) {

    val uriHandler = LocalUriHandler.current

    Text(
        text = name,
        style = MaterialTheme.typography.bodyLarge,
        color = Color(0xFF190EA4),
        modifier = Modifier.clickable(
            onClick = { uriHandler.openUri(url) }
        )
    )
}