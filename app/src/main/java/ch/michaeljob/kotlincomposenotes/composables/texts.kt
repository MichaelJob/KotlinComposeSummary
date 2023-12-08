import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import ch.michaeljob.kotlincomposenotes.kotlinsnippets.AppViewModel.labeltext

// Text (hardcoded or filled with variables)
@Composable
fun MyTexts(){
    Text("abc")

    // by variable definied inside parent composable or from passed in parameter
    Text(labeltext)

    // with style by theme, centered text
    Text(
        text = "title",
        style = MaterialTheme.typography.titleMedium,
        textAlign = TextAlign.Center
    )


    //further specific styling
    Text(
        text      = "abc",
        fontStyle = FontStyle.Italic,
        overflow  = TextOverflow.Ellipsis,
        maxLines  = 5
    )
}