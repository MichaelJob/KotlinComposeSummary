import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.*

@Composable
fun MyComposableWithInsideVariables(){
    /*
     * use "remember" to work with a variable inside a composable
     * (otherwise every recompose will reset myString to "some-text" again)
     *
     * most-likely you need the variable to be reflected in the GUI, use "mutableStateOf"*
     */
    var myString by remember { mutableStateOf("some-text") }

    var myBoolean by remember { mutableStateOf(false) }


    Text(text = myString)
    Switch(checked = myBoolean, onCheckedChange = { /* do something */ })

}