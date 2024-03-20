import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.michaeljob.kotlincomposesummary.kotlinsnippets.AppViewModel.labeltext

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

    //with a red circle behind
    Text(
        modifier = Modifier
            .padding(16.dp)
            .drawBehind {
                drawCircle(
                    color = Color.Red,
                    radius = this.size.maxDimension*0.5F
                )
            },
        text = "42",
    )
}