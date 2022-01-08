// Using multiple elements (for example different screens)

// Use a scaffold for default Top- and Bottom-Bars and display your multiple screens inside the Scaffolds content.
// Here a Box is used, which 'switches' out the elements/screens immediately.

@Composable
fun AppUI(model: YourAppModel) {

    val scaffoldState = rememberScaffoldState()

    with(model) {
            Scaffold(
                scaffoldState = scaffoldState,
                topBar = { TopBar(model) },
                snackbarHost = { NotificationHost(it) },
                bottomBar = { NavBar(model) },
            ) {
                Box() {
                    when (currentScreen) {
                        Screen.HOME     -> { HomeScreen(model) }
                        Screen.PROFILE  -> { ProfileScreen(model) }
                        Screen.LIST     -> { ListScreen(model) }
                        Screen.ABOUT    -> { AboutScreen(model) }
                    }
                }
            }
        }
    }