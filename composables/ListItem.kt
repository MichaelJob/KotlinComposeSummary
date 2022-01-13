// a common list item can be made up of any elements (see Lazy Column) but there is a dedicated listitem in Compose:
// it provides for a trailingIcon and main content text as well as overline and secondary text out of the box
ListItem (
    text          = { Text(yourVar) },
    secondaryText = { Text("Foo ${bar}") },
    overlineText  = { Text("Date: $dateVar") },
    trailing      = { Icon(Icons.Filled.SentimentSatisfied, "iconDescription") }
)