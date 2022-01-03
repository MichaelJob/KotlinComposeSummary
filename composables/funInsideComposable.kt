import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun myComposable(){

    /*
     * Variables and functions can be inside a composable,
     * although they mostly belong to a model to seperate UI and Model
     */
    var checkedBlue by remember { mutableStateOf(false) }

    fun toggleCheckedBlue() {
        checkedBlue = !checkedBlue
    }

    /*
     * UI
     */
    Column(
        modifier = Modifier.padding(20.dp)
    ) {

        Text(
            text = "hello world",
            style = TextStyle(
                fontSize = 16.sp,
                color = if(checkedBlue) Color.Blue else Color.Red
            )
        )

        Switch(checked = checkedBlue, onCheckedChange = { toggleCheckedBlue() })
        // such a simple fun could be written inside as well:
        // Switch(checked = checkedBlue, onCheckedChange = { checkedBlue = !checkedBlue })

    }
}