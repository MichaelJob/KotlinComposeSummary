import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import ch.michaeljob.kotlincomposesummary.kotlinsnippets.AppViewModel
import ch.michaeljob.kotlincomposesummary.kotlinsnippets.ScreensAsEnums

// use Androids System Back Button via BackHandler to go back to a specified screen (or do whatever it needs to do)

@Composable
fun XYZScreen(model: AppViewModel) {
    
    //your screen content

    BackHandler(enabled = true){
        model.currentScreen = ScreensAsEnums.HOME
    }
}