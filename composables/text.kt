// Text (hardcoded or filled with variables, but not input)

Text("abc")

// by variable definied inside parent composable or from passed in parameter
Text(myvar)

@Composable
private fun Bar(model: MyModel) {
    with(model){
        TopAppBar(title = { Text(title, style = MaterialTheme.typography.h5) })
    }
}

//with specific styling
Text(
    text      = "abc",
    fontStyle = FontStyle.Italic,
    overflow  = TextOverflow.Ellipsis,
    maxLines  = 5
)