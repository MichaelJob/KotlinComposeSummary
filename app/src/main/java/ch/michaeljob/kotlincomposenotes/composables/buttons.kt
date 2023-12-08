import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

// Buttons

@Composable
fun myButtons(){
    // simple button
    Button(
        onClick = { /* do something */ }
    ){
        Text("click me")
    }

    // IconButton - centered content for Buttons in AppBars or so
    IconButton(
        onClick = { /* do something */ }
    ) {
        Icon(Icons.Filled.Menu, "Menu")
    }

    // Button has a RowScope as its content: so the following code shows a Icon followed by the Text in a row
    Button(
        onClick = { /* go to Home */ }
    ){
        Icon(Icons.Filled.Home, "Home")
        Text("Home")
    }
}