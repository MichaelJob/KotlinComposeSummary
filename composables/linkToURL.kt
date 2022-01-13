// set a text which links to a provided url
@Composable
private fun Link(name: String, url: String){
    val uriHandler = LocalUriHandler.current
    val linkColor  = remember { Color(0xFF190EA4) }

    Text(text     = name,
        style    = MaterialTheme.typography.body1,
        color    = linkColor,
        modifier = Modifier.clickable(onClick = { uriHandler.openUri(url) }))
}