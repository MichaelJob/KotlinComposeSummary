import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.People
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Tabs Navigation

// in your viewmodel have the currently selected tab
var selectedTab by mutableStateOf(AvailableTabs.FIRST)

// and provide a enum with all available tabs
enum class AvailableTabs(val title: String, val message: String) {
    FIRST("Left", "Lorem"),
    SECOND("Middle", "ipsum"),
    THIRD("Right", "dolor")
}

// show tabs at the top of your Composable if placed first inside a column like so:
@Composable
fun TabNav() {
    Column() {
        TabRow(selectedTabIndex = selectedTab.ordinal) {
            for (tab in AvailableTabs.entries) {
                Tab(text = { Text(tab.title) },    // display each tabs title (values from enum)
                    selected = tab == selectedTab,     // is this tab selected?
                    onClick = {
                        selectedTab = tab
                    }
                )
            }
        }
        //content of column is always the same composables as stated here, but..
        Text(text = selectedTab.message) // content of text is depending on selectedTab
        //for different composables depending on clicked tab, do:
        when (selectedTab) {
            AvailableTabs.FIRST -> {
                /* FirstScreen() */
            }

            AvailableTabs.SECOND -> {
                /* SecondScreen() */
            }

            AvailableTabs.THIRD -> {
                /* ThirdScreen() */
            }
        }
    }
}


//******** alternative Tab Nav with Buttons, no TabRow **********//
// if you want to have a tab nav but also be able to show "other" screens, but hide its nav bar/button
// use same for model and enum - extend enum with boolean to show/hide nav
// or use a Scaffold or Crossfade for your Screens and a TabNav for your Tabs
enum class Screens(val navName: String, val hideNav: Boolean, val icon: ImageVector) {
    //visible Tabs in Navigation
    LEFT("Left", false, Icons.Filled.List),
    MIDDLE("Middle", false, Icons.Filled.People),
    RIGHT("Right", false, Icons.Filled.AccountBox),

    //invisible Tabs in Navigation
    ANYC("", true, Icons.Filled.Chat),
    ANYD("", true, Icons.Filled.Chat),
}

// in your viewmodel have the currently selected tab
var currentScreen by mutableStateOf(Screens.LEFT)

@Composable
fun NavBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        for (screen in Screens.entries.filter { screen -> !screen.hideNav }) {
            Button(
                content = {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = screen.icon,
                            contentDescription = screen.navName,
                            modifier = Modifier.size(20.dp)
                        )
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
                    containerColor = (if (screen == currentScreen) { // highlight if tab is selected
                        MaterialTheme.colorScheme.primary
                    } else {
                        MaterialTheme.colorScheme.inversePrimary
                    })
                )
            )
        }
    }
}