import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import ch.michaeljob.kotlincomposesummary.kotlinsnippets.AppViewModel.booleanValue


//minimal use example
@Composable
fun MySwitch(){

    Switch(
        checked = booleanValue,
        onCheckedChange = { booleanValue = it }
    )

}


/*
by https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#Switch(kotlin.Boolean,kotlin.Function1,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.foundation.interaction.MutableInteractionSource,androidx.compose.material.SwitchColors)

    @Composable
    fun Switch(
        checked: Boolean?,
        onCheckedChange: ((Boolean) -> Unit)?,
        modifier: Modifier? = Modifier,
        enabled: Boolean? = true,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        colors: SwitchColors? = SwitchDefaults.colors()
    ): Unit
 */