// ConstraintLayout

ConstraintLayout(Modifier.fillMaxSize()) {
    // set your needed elements refs:
    val (header, body, footer) = createRefs()
    // init your elements with its modifier related to their refs and define the layout constraints for each:
    Header(model, Modifier.constrainAs(header) { //***
        start.linkTo(parent.start, 20.dp)
        end.linkTo(parent.end, 20.dp)
        top.linkTo(parent.top, 20.dp)
        width = Dimension.fillToConstraints
    })
    Body(model, Modifier.constrainAs(body){
        start.linkTo(parent.start)
        end.linkTo(parent.end)
        top.linkTo(header.bottom, 20.dp)
        bottom.linkTo(footer.top, 5.dp)
        width = Dimension.fillToConstraints
        height = Dimension.fillToConstraints
    })
    Footer(model, Modifier.constrainAs(footer){
        start.linkTo(parent.start)
        end.linkTo(parent.end)
        bottom.linkTo(parent.bottom)
        width = Dimension.fillToConstraints
    })
}

// note that you pass the modifier with the specified constraints down to each element - see //***
@Composable
private fun Header(model: yourModel, modifier: Modifier){
    with(model) {
        val keyboard = LocalSoftwareKeyboardController.current
        Card(modifier) { //***
            ...



// constraints to:
        top
start           end
        bottom