import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// for a list with many items use lazy column:
val listWithNames: List<String> = listOf("Michael", "Dieter", "Barbara") //bad example for "many"

@Composable
fun MyLazyColumnList(){
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(
            items = listWithNames,   // pass a list to items
            key = { it.hashCode() }  // key must be unique, preferably the unique id of your list items
        ) {  //this: LazyItemScope it: String
            Text(text = it)          //here each list item is defined as "it"
        }
    }
}