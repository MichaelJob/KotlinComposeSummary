// to show notifications like dialogs inside the app
// use a snackbar with a modelVariable for example like so:

@Composable
fun AppUI(model: AppModel) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar        = { Bar(model) },
        snackbarHost  = { NotificationHost(it) },
        content       = { Body(model) }
    )
    Notification(model, scaffoldState)
}

@Composable
private fun NotificationHost(state: SnackbarHostState) {
    SnackbarHost(state) { data ->
        Box(
            modifier         = Modifier.fillMaxHeight(),
            contentAlignment = Alignment.Center
        )
        {
            Snackbar(snackbarData = data)
        }
    }
}

@Composable
private fun Notification(model: AppModel, scaffoldState: ScaffoldState) {
    with(model){
        if (notificationMessage.isNotBlank()) {     //will only show whenever a message is set inside the model
            LaunchedEffect(scaffoldState.snackbarHostState) {
                scaffoldState.snackbarHostState.showSnackbar(
                    message     = notificationMessage,
                    actionLabel = "OK"
                )
                notificationMessage = ""   // message in model gets reseted to empty string here
            }
        }
    }
}