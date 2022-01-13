// Text (hardcoded or filled with variables, but not input)

Text("abc")

// by variable definied inside parent composable or from passed in parameter
Text(myvar)

// with style by theme, centered text
Text(
    text = "title",
    style = MaterialTheme.typography.h5,
    modifier = Modifier.align(CenterHorizontally)
)


//with specific styling
Text(
    text      = "abc",
    fontStyle = FontStyle.Italic,
    overflow  = TextOverflow.Ellipsis,
    maxLines  = 5
)