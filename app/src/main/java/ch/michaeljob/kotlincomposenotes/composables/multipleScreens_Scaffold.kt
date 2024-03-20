import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ch.michaeljob.kotlincomposesummary.kotlinsnippets.AppViewModel
import ch.michaeljob.kotlincomposesummary.kotlinsnippets.ScreensAsEnums

// Multiple Screens
@Composable
fun MyMultipleScreensScaffold(model: AppViewModel) {

    with(model) {
        Scaffold(
            topBar = { /* TopBar(model) */ },
            bottomBar = { /* BottomBar(model) */ },
        ) { // it: PaddingValues - must be passed into the Composable
            Box(
                modifier = Modifier.padding(it)
            ) {
                when (currentScreen) {  // currentScreen is a mutableState in your viewmodel for example
                    ScreensAsEnums.HOME -> {
                        //HomeScreen(model)
                    }
                    ScreensAsEnums.ABOUT -> {
                        //AboutScreen(model)
                    }
                }
            }
        }
    }
}