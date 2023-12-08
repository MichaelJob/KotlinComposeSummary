import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

// use Box to create a UI-content container,
// its children are positiond on top of eachother if not elseswise specified

@Composable
fun myBox(){
    Box(
        contentAlignment = Alignment.Center,
        modifier         = Modifier.fillMaxSize()
    ) {
        Text("abc")
        Text("xyz") // these two texts would overlap
    }
}