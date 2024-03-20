import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

import ch.michaeljob.kotlincomposesummary.kotlinsnippets.AppViewModel

val model = AppViewModel

// ConstraintLayout
@Composable
fun myConstraintLayout() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        // set your needed elements refs:
        val (header, body, footer) = createRefs()
        // init your elements with its modifier related to their refs and define the layout constraints for each:
        Header(model, Modifier.constrainAs(header) { //***
            start.linkTo(parent.start, 20.dp)
            end.linkTo(parent.end, 20.dp)
            top.linkTo(parent.top, 20.dp)
            width = Dimension.fillToConstraints
        })
        Body(model, Modifier.constrainAs(body) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(header.bottom, 20.dp)
            bottom.linkTo(footer.top, 5.dp)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Footer(model, Modifier.constrainAs(footer) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
        })
    }

}

// note that you pass the modifier with the specified constraints down to each element - see //***
@Composable
private fun Header(model: AppViewModel, modifier: Modifier) {
    with(model) {
        Card(
            modifier = modifier
        ) {
            //...ColumnScope
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
private fun Body(model: AppViewModel, modifier: Modifier) {
    with(model) {
        val keyboard = LocalSoftwareKeyboardController.current
        Card(
            modifier = modifier
        ) {
            //...ColumnScope
            OutlinedTextField(
                value = textinput,
                onValueChange = {
                    textinput = it
                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = {
                        keyboard?.hide()
                    }
                ),
            )
        }
    }
}

@Composable
private fun Footer(model: AppViewModel, modifier: Modifier) {
    with(model) {
        Row(
            modifier = modifier
        ) {
            //...RowScope
        }
    }
}


/*

constraints to:

        top
start           end
        bottom

*/