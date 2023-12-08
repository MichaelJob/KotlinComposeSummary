import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ch.michaeljob.kotlincomposenotes.kotlinsnippets.AppViewModel

// to show notifications like dialogs inside the app
// use a snackbar with a modelVariable for example like so:

@Composable
fun AppUI(model: AppViewModel) {
    var snackbarHostState = SnackbarHostState()
    Scaffold(
        topBar = { Text("TopBar") },
        snackbarHost = { NotificationHost(snackbarHostState) },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "Main Body content", modifier = Modifier.padding(it))
                Button(onClick = { model.notificationMessage = "Button clicked" }) {
                    Text(text = "click me")
                }
            }
        }
    )
    Notification(model, snackbarHostState)
}

@Composable
private fun NotificationHost(snackbarHostState: SnackbarHostState) {
    SnackbarHost(snackbarHostState) { data ->
        Box(
            modifier = Modifier.fillMaxHeight(),
            contentAlignment = Alignment.Center
        )
        {
            Snackbar(snackbarData = data)
        }
    }
}

@Composable
private fun Notification(model: AppViewModel, snackbarHostState: SnackbarHostState) {
    with(model) {
        if (notificationMessage.isNotBlank()) {     //will only show whenever a message is set inside the model
            LaunchedEffect(snackbarHostState) {
                snackbarHostState.showSnackbar(
                    message = notificationMessage,
                    actionLabel = "OK"
                )
                notificationMessage = ""   // message in model gets reseted to empty string here
            }
        }
    }
}