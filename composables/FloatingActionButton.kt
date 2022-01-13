// FloatingActionButton - FAB

@Composable
fun View(model: AppModel) {
    Scaffold(topBar                  = { /*your top app bar*/ },
            floatingActionButton     = {
                FloatingActionButton(
                    onClick = { reset() }
                ) {
                    Icon(Icons.Filled.Clear, "clear it")
                }
            },
            floatingActionButtonPosition = FabPosition.End,
            content                      = { /*your main body content*/ }
    )
}