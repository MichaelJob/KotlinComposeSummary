import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ch.michaeljob.kotlincomposenotes.kotlinsnippets.AppViewModel
import ch.michaeljob.kotlincomposenotes.kotlinsnippets.ScreensAsEnums

/* Drawer Layout
 *
 * Material 3
 * makes use of ModalNavigationDrawer for Drawer Layouts.
 * Inside the main content there can still be a Scaffold,
 * but the Scaffold itself has lost its own Drawer functionality!
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyDrawerLayout(model: AppViewModel) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    with(model) {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet(
                    content = { Text("your drawer composable") }
                )
            },
            content = {
                MyMultipleScreensScaffold(model = model)
            }
        )
    }
}