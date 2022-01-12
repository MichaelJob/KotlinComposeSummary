// Spacer
// fills available space with nothing, to space out elements
Spacer(modifier = Modifier.weight(1.0f))


// use weight if more than one Spacer is used to specifiy sizes
// for example three Texts in one column, spaced by 1/4 and 3/4 like so:
Column(
    modifier = Modifier.padding(5.dp).fillMaxHeight(),
    verticalArrangement = Arrangement.spacedBy(10.dp)
) {
    Text(text = "Heading")

    Spacer(modifier = Modifier.weight(0.25f))

    Text(text = "Body")

    Spacer(modifier = Modifier.weight(0.75f))

    Text(text = "Footer")
}