import androidx.compose.material.Switch
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

val checkedState = remember { mutableStateOf(true) }

//minimal use example
@Composable
Switch(
    checked = checkedState.value,
    onCheckedChange = { checkedState.value = it }
)





/*

https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#Switch(kotlin.Boolean,kotlin.Function1,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.foundation.interaction.MutableInteractionSource,androidx.compose.material.SwitchColors)


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