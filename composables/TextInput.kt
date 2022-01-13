// Text Input can be achived with the Composable "OutlinedTextField"
// example with a model for example (with KeyboardActions):

with(model) {
    val keyboard = LocalSoftwareKeyboardController.current
    OutlinedTextField(
        value = yourEditTextVar,                    // value from model
        onValueChange = { yourEditTextVar = it },   // update value on input
        singleLine    = true,
        trailingIcon  = {
            IconButton(     // a clear input icon
                onClick = {
                    keyboard?.hide()
                    yourEditTextVar = ""
                    launchSomeModelFunc()
                }
            )
            {
                Icon(Icons.Filled.Clear, "clear")
            }
        },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(onDone = {
            keyboard?.hide()
            launchSomeModelFunc()
        }),
        colors          = TextFieldDefaults.outlinedTextFieldColors(focusedBorderColor = MaterialTheme.colors.secondary),
        placeholder     = { Text("placeholdertext") },
        modifier        = Modifier.fillMaxWidth()
    )
}