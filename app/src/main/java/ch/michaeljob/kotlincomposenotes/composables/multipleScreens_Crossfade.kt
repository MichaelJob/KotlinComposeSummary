import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import ch.michaeljob.kotlincomposesummary.kotlinsnippets.AppViewModel

// multiple screens
// with Crossfade to animate transition; with Enums for multiple Screens with a camposable fun as attribute

// Crossfade animates the change of a elements/screens by fading to the new element.

@Composable
fun MultipleScreensUI(model: AppViewModel) {
    with(model) {
            Crossfade(
                targetState = currentScreenEnumFunc,
                animationSpec = tween(2000)  // fade with 2 seconds animation
            ) {
                screen -> screen.content.invoke()
            }
    }
}

// Enum Screens contains a value "content" which is the composable function to get the screen:
enum class ScreenEnumWithComposableFunc(val content: @Composable () -> Unit) {
    HOME  ( { /* HomeScreen() */ }   ),
    ABOUT ( { /* AboutScreen() */ }  ),
    DETAIL( { /* DetailScreen() */ } ),
}