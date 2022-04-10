// Using multiple elements (for example different screens)

// Crossfade animates the change of a element/screen by fading to the new element.

@Composable
fun MultipleScreensUI(model: YourMultipleScreensModel) {
    with(model) {
            Crossfade(
                targetState = currentScreen,
                animationSpec = tween(2000)  // fade with 2 seconds animation
            ) { screen ->
                when (screen) {
                    Screen.HOME      -> { HomeScreen(model) }
                    Screen.PROFILE   -> { ProfileScreen(model) }
                    Screen.LIST      -> { ListScreen(model) }
                    Screen.ABOUT     -> { AboutScreen(model) }
                }
            }
    }
}



// if Enum Screens contains a value "content" which is the composable function to get the screen, you can also do:
Crossfade(targetState = model.currentScreen ) { screen -> screen.content.invoke() }
//Enum Screen would look like this:
enum class Screen(val content: @Composable () -> Unit) {
    HOME  ( { HomeScreen() }   ),
    ABOUT ( { AboutScreen() }  ),
    DETAIL( { DetailScreen() } ),
}