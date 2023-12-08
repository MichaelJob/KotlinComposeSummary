import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction

// Text Input can be achieved with the Composable "OutlinedTextField"
// example with a model for example (with KeyboardActions):
@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun MyInputField() {
    with(model) {
        val keyboard = LocalSoftwareKeyboardController.current
        OutlinedTextField(
            value = textinput,                    // value from model
            onValueChange = { textinput = it },   // update value on input
            singleLine = true,
            trailingIcon = {
                IconButton(     // a clear input icon
                    onClick = {
                        keyboard?.hide()
                        textinput = ""
                        //maybe also launchSomeModelFunc()
                    }
                )
                {
                    Icon(Icons.Filled.Clear, "clear")
                }
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                keyboard?.hide()
                //launchModelFunc() if something should happen after input (enter)
            }),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.secondary,
            ),
            placeholder = { Text("placeholdertext") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}