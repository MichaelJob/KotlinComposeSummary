import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SentimentSatisfied
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


// a common list item can be made up of any elements (see Lazy Column) but there is a dedicated listitem in Compose:
// it provides for a trailingIcon and main content text as well as overline and secondary text out of the box
@Composable
fun MyListItem() {

    val foo = "some-text"
    val bar = "other-text"

    ListItem(
        headlineContent = { Text(foo) }, //main content of listitem
        supportingContent = { Text("Foo $bar") },
        leadingContent = { Text("leading") },
        trailingContent = {
            Icon(
                imageVector = Icons.Filled.SentimentSatisfied,
                contentDescription = "iconDescription"
            )
        },
    )
}