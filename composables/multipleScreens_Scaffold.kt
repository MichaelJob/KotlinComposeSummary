// Using multiple elements (for example different screens)

// Use a scaffold for default Top- and Bottom-Bars and display your multiple screens inside the Scaffolds content.
// Here a Box is used, which 'switches' out the elements/screens immediately.

@Composable
fun AppUI(model: YourAppModel) {

    with(model) {
        Scaffold(
            topBar = { TopBar(model) },
            bottomBar = { NavBar(model) },
        ) { // it: PaddingValues - must be passed into the Composable
            Box(modifier = Modifier.padding(it)) {
                when (currentScreen) {  // currentScreen is a mutableState in your model for example
                    Screen.HOME -> {
                        HomeScreen(model)
                    }
                    Screen.PROFILE -> {
                        ProfileScreen(model)
                    }
                    Screen.LIST -> {
                        ListScreen(model)
                    }
                    Screen.ABOUT -> {
                        AboutScreen(model)
                    }
                }
            }
        }
    }
}

// if a Drawer is provided remember the scaffoldState - here the main content is also inlined

@Composable
fun AppUI(model: YourAppModel) {

    val scaffoldState = rememberScaffoldState()

    with(model) {
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = { TopBar(model) },
            snackbarHost = { NotificationHost(it) },
            bottomBar = { NavBar(model) },
            drawerContent = { YourDrawerComposable(model) },
            content = { paddingValues ->   // "paddingValues ->" could be left out and replaced by "it" in next line
                Box(modifier = Modifier.padding(paddingValues)) {
                    when (currentScreen) {  // currentScreen is a mutableState in your model for example
                        Screen.HOME -> {
                            HomeScreen(model)
                        }
                        Screen.PROFILE -> {
                            ProfileScreen(model)
                        }
                        Screen.LIST -> {
                            ListScreen(model)
                        }
                        Screen.ABOUT -> {
                            AboutScreen(model)
                        }
                    }
                }
            }
        )
    }
}