import androidx.compose.runtime.*

/*
 * use "remember" to work with a variable inside a composable
 * (otherwise every recompose will reset myString to "some-text" again)
 */
var myString by remember { "some-text" }

/*
 * mostikely you need the variable to be reflected in the GUI, use "mutableStateOf"
 */
var myBoolean by remember { mutableStateOf(false) }

