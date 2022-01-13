// for a list with items use lazy column:

LazyColumn(
    modifier = Modifier.fillMaxSize()
) {
    items(items = listFromModel, key = { it.id }) {  //key must be unique, preferably the unique id of your list items
        Card(it) //here each list item is defined
    }
}