import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// "Divider" adds a horizontal line
@Composable
fun MyDividers(){
    // here some padding is added
    Divider(
        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
    )

    // or with specific color and thickness
    Divider(
        color = Color.Cyan,
        thickness = 2.dp
    )
}