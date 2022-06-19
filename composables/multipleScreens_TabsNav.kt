// Tabs Navigation

// in your model have the currently selected tab
var selectedTab by mutableStateOf(AvailableTab.FIRST)
// and provide a enum with all available tabs
enum class AvailableTab(val title: String, val message: String) {
    FIRST("Left", "Lorem"),
    SECOND("Middle", "ipsum"),
    THIRD("Right", "dolor")
}

// show tabs at the top of your Composable if placed first inside a column like so:
@Composable
private fun Body(model: TabsModel) {
    with(model) {
        Column() {
            TabRow(selectedTabIndex = selectedTab.ordinal) {
                for (tab in AvailableTab.values()) {
                    Tab(text     = { Text(tab.title) },    // display each tabs title (values from enum)
                        selected = tab == selectedTab,     // is this tab selected?
                        onClick  = { selectedTab = tab }   // set clickon tab in model.selectedTab -> recompose
                    )
                }
            }
            //content of column is always the same composables as stated here, but..
            MessageBox(text = selectedTab.message) // content of text is depending on selectedTab
            //for different composables depending on clicked tab, do:
            when (selectedTab) {
                AvailableTab.HOME      -> { HomeScreen(model) }
                AvailableTab.PROFILE   -> { ProfileScreen(model) }
                AvailableTab.LIST      -> { ListScreen(model) }
                AvailableTab.ABOUT     -> { AboutScreen(model) }
            }
        }
    }
}




//******** alternative Tab Nav with Buttons, no TabRow **********//
// if you want to have a tab nav but also be able to show "other" screens, but hide its nav bar/button
// use same for model and enum - extend enum with boolean to show/hide nav
// or use a Scaffold or Crossfade for your Screens and a TabNav for your Tabs
enum class Screen(val navName: String, val hideNav: Boolean, val icon: ImageVector) {
    //visible Tabs in Navigation
    LEFT         ("Left", false, Icons.Filled.List),
    MIDDLE       ("Middle", false, Icons.Filled.People),
    RIGHT        ("Right", false, Icons.Filled.Account),
    //invisible Tabs in Navigation
    ANYC         ("", true, Icons.Filled.Chat),
    ANYD         ("", true, Icons.Filled.Chat),
}

@Composable
fun NavBar(model: ThatsAppModel) {
    with(model) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            for (screen in Screen.values().filter { screen -> !screen.hideNav }) {
                Button(
                    content = {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(imageVector = screen.icon, contentDescription = screen.navName, modifier = Modifier.size(20.dp))
                            Text(text = screen.navName, fontSize = 11.sp)
                        }
                    },
                    onClick = {
                        currentScreen = screen
                    },
                    shape = RoundedCornerShape(0), //as Buttons are by default rounded
                    modifier = Modifier
                        .weight(1F)
                        .height(55.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = (if (screen == currentScreen) { // highlight if tab is selected
                            MaterialTheme.colors.primary
                        } else {
                            DarkGray
                        })
                    )
                )
            }
        }
    }
}