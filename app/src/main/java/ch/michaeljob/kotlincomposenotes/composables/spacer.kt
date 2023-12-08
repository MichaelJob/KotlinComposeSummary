import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Spacer
// fills available space with nothing, to space out elements
// Spacer(modifier = Modifier.weight(1.0f))

// use weight if more than one Spacer is used to specifiy sizes
// for example three Texts in one column, spaced by 1/4 and 3/4 like so:
@Composable
fun MySpacedComposable(){
    Column(
        modifier = Modifier.padding(5.dp).fillMaxHeight(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(text = "Heading")

        Spacer(modifier = Modifier.weight(0.25f))

        Text(text = "Body")

        Spacer(modifier = Modifier.weight(0.75f))

        Text(text = "Footer")
    }
}